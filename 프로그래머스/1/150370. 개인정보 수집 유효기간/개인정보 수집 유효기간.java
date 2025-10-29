import java.util.*;
import java.time.*;
import java.text.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws Exception{
        int[] answer = {};
        //terms = 약관 종류
        //privacies = 개인정보정보
        //today = 오늘
        //파기해야 할 idx를 오름차순으로 담기
        List<Integer> list = new ArrayList<Integer>();
        Map<String, Integer> termMap = new HashMap<String, Integer>();
        for(String s: terms){
            termMap.put(s.split(" ")[0], Integer.parseInt(s.split(" ")[1]));
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Calendar cal = Calendar.getInstance();
        Date now = formatter.parse(today);
        
        for(int i=0;i<privacies.length;i++){
            Date privacyDate = formatter.parse(privacies[i].split(" ")[0]);
            cal.setTime(privacyDate);
            cal.add(Calendar.MONTH, termMap.get(privacies[i].split(" ")[1]));
            Date result = cal.getTime();
            if(now.after(result) || now.equals(result)) list.add(i+1);
        }

        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}