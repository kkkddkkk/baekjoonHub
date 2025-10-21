import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];
        int[] reported = new int[id_list.length];
        String[] distincted = Arrays.stream(report).distinct().toArray(String[]::new);
        Map<String, String> reporterMap = new HashMap<String, String>();
        Map<String, Integer> reportedMap = new HashMap<String, Integer>();

        for(String dis:distincted){
            reporterMap.put(dis.split(" ")[0], 
                reporterMap.getOrDefault(dis.split(" ")[0], "")+dis.split(" ")[1]+" ");
            reportedMap.put(dis.split(" ")[1], 
                reportedMap.getOrDefault(dis.split(" ")[1], 0)+1);
        }
        
        for(int i=0;i<id_list.length;i++){
            if(!reporterMap.containsKey(id_list[i])) reporterMap.put(id_list[i], " ");
            String[] targets = reporterMap.get(id_list[i]).split(" ");
            for(String target:targets){
                if(reportedMap.get(target)>=k) answer[i]++;
            }
        }

        
        return answer;
    }
}