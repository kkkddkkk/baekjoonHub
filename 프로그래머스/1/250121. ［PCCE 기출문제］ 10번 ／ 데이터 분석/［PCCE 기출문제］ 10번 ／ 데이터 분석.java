import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        //data:코드번호, 제조일, 최대수량, 현재수량
        int num = 0;
        switch(ext){
            case "code": num=0; break;
            case "date": num=1; break;
            case "maximum": num=2; break;
            case "remain": num=3; break;
        }
        List<Integer[]> list = new ArrayList<Integer[]>();
        for(int[] i:data){
            if(i[num]<val_ext){
                list.add(Arrays.stream(i).boxed().toArray(Integer[]::new));
            }
        }
        
       switch(sort_by){
            case "code": num=0; break;
            case "date": num=1; break;
            case "maximum": num=2; break;
            case "remain": num=3; break;
        }
        final int sortNum = num;
                
        list.sort((a, b)->{
            return a[sortNum].compareTo(b[sortNum]);
        });
        answer = new int[list.size()][4];
        for(int i=0;i<list.size();i++){
            answer[i] = Arrays.stream(list.get(i)).mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}