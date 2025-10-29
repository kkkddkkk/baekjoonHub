import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        //park -> O는 길, X는 장애물, S는 시작지점
        //routes -> E(ast), W(est), N(orth), S(outh) , + n칸 이동
        answer = new int[2];
        for(int i=0;i<park.length;i++){
            if(!park[i].contains("S")) continue;
            answer[0] = i;
            answer[1] = park[i].indexOf("S");
            break;
        }

        for(String s:routes){
            String direction = s.split(" ")[0];
            int count = Integer.parseInt(s.split(" ")[1]);
            switch(direction){
                case "E": {
                    if(answer[1]+count>=park[0].length()) break;
                    boolean flag = false;
                    for(int i=answer[1]+1;i<=answer[1]+count;i++){
                        if(park[answer[0]].charAt(i)=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) answer[1] = answer[1]+count;
                    break;
                }
                case "W": {
                    if(answer[1]-count<0) break;
                    boolean flag = false;
                    for(int i=answer[1]-count;i<=answer[1]-1;i++){
                        if(park[answer[0]].charAt(i)=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag)answer[1] = answer[1]-count;
                    break;
                }
                case "N":{
                    if(answer[0]-count<0) break;
                    boolean flag = false;
                    for(int i=answer[0]-count;i<=answer[0]-1;i++){
                        if(park[i].charAt(answer[1])=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) answer[0] = answer[0]-count;
                    break;
                }
                case "S":{
                    if(answer[0]+count>=park.length) break;
                    boolean flag = false;
                    for(int i=answer[0]+1;i<=answer[0]+count;i++){
                        if(park[i].charAt(answer[1])=='X'){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) answer[0] = answer[0]+count;
                    break;
                }
            }
        }
        
        return answer;
    }
}