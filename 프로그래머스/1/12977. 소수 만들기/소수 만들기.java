import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> sumSet = new HashSet<Integer>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    flag = true;
                    for(int l=2;l*l<=nums[i]+nums[j]+nums[k];l++){
                        if((nums[i]+nums[j]+nums[k])%l==0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) answer++;
                }
            }
        }

        return answer;
    }
}