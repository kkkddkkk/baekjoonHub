class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];
        String[][] map1 = twoToTen(arr1, n);
        String[][] map2 = twoToTen(arr2, n);
        for(int i=0;i<map1.length;i++){
            answer[i] = "";
            for(int j=0;j<map1[i].length;j++){
                if(map1[i][j].equals("1")||map2[i][j].equals("1")) answer[i]+="#";
                if(map1[i][j].equals("0")&&map2[i][j].equals("0")) answer[i]+=" ";
            }
        }
        return answer;
    }
    
    public String[][] twoToTen(int[] arr, int n){
        String[][] value = new String[arr.length][n];
        
        for(int i=0;i<value.length;i++){
            String temp = "";
            while(arr[i]>0){
                temp+=arr[i]%2+"";
                arr[i]/=2;
            }
            temp+="0".repeat(n-temp.length());
            int k=0;
            for(int j=n-1;j>=0;j--){
                value[i][k++] = temp.charAt(j)+"";
            }            
        }
        
                    return value;
        
    }
}