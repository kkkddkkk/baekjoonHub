class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int size = 0;
        switch(n){
            case 1:{
                size = slicer[1]+1;
                answer = new int[size];
                for(int i=0;i<=slicer[1];i++){
                    answer[i] = num_list[i];
                }
                break;
            }
            case 2:{
                size = num_list.length-slicer[0];
                answer = new int[size];
                int idx = 0;
                for(int i=slicer[0];i<num_list.length;i++){
                    answer[idx++] = num_list[i];
                }
                break;                
            }
            case 3:{
                size = slicer[1]-slicer[0]+1;
                answer = new int[size];
                for(int i=slicer[0];i<=slicer[1];i++){
                    answer[i-slicer[0]] = num_list[i];
                }
                break;                
            }
            default:{
                size = (int)Math.ceil((double)(slicer[1]-slicer[0]+1)/(double)slicer[2]);
                answer = new int[size];
                int idx = 0;
                for(int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                    answer[idx++] = num_list[i];
                }
                break; 
            }
        }
        return answer;
    }
}