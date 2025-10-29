import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {-1, -1, -1, -1};
        //빈칸은 ., 파일이 있는 칸은 #
        //answer[0] = 가장 왼쪽에 위치한 파일의 x값
        //answer[1] = 가장 위에 위치한 파일의 y값        
        //answer[2] = 가장 오른쪽에 위치한 파일의 x값
        //answer[3]가장 아래쪽에 위치한 파일의 y값
        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        for(int i=0;i<wallpaper.length;i++){
            if(!wallpaper[i].contains("#")) continue;
            String[] line = wallpaper[i].split("");
            for(int j=0;j<line.length;j++){
                if(line[j].equals("#")){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        Collections.sort(x);
        Collections.sort(y);
        answer[0] = x.get(0);
        answer[1] = y.get(0);
        answer[2] = x.get(x.size()-1)+1;
        answer[3] = y.get(y.size()-1)+1;
        
        return answer;
    }
}