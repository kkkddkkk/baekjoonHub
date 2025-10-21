import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> temp = new HashMap<String, Integer>();
        for(int i=0;i<survey.length;i++){
            String first = survey[i].charAt(0)+"";
            String second = survey[i].charAt(1)+"";
            switch(choices[i]){
                case 1: {
                    temp.put(survey[i].split("")[0], 
                             temp.getOrDefault(first, 0)+3);
                    break;
                }
                case 2: {
                    temp.put(survey[i].split("")[0],
                             temp.getOrDefault(first, 0)+2);
                    break;
                }
                case 3: {
                    temp.put(survey[i].split("")[0],
                             temp.getOrDefault(first, 0)+1);
                    break;
                }
                case 4: {
                    temp.put(survey[i].split("")[0],
                             temp.getOrDefault(first, 0)+0);
                    break;
                }
                case 5: {
                    temp.put(survey[i].split("")[1],
                             temp.getOrDefault(second, 0)+1);
                    break;
                }
                case 6: {
                    temp.put(survey[i].split("")[1],
                             temp.getOrDefault(second, 0)+2);
                    break;
                }
                default: {
                    temp.put(survey[i].split("")[1],
                             temp.getOrDefault(second, 0)+3);
                    break;
                } 
            }
        }
        addString(sb, temp, "R", "T");
        addString(sb, temp, "C", "F");
        addString(sb, temp, "J", "M");
        addString(sb, temp, "A", "N");
        
        answer = sb.toString();
        return answer;
    }
    
    public void addString(StringBuilder sb, 
                          Map<String, Integer> map, String s1, String s2){
        if(map.getOrDefault(s1, 0)>map.getOrDefault(s2, 0)){
            sb.append(s1);
        }else if(map.getOrDefault(s1, 0)<map.getOrDefault(s2, 0)){
            sb.append(s2);
        }else{
            if(s1.compareTo(s2)>0) sb.append(s2);
            else sb.append(s1);
        }
    }

}