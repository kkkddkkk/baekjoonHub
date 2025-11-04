class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        //시간은 시간*100+분
        //출근희망시간+10분까지 어플로 출근해야함
        //schedules: 출근희망시간
        //timelogs: 출근시간
        //startday: 이벤트 시작 요일
        // if(i+startday>=6) continue;
        boolean gift = true;
        
        for(int i=0;i<schedules.length;i++){
            int boundaryTime = (schedules[i]/100)*60+schedules[i]%100+10;
            gift = true;
            for(int j=0;j<timelogs[i].length;j++){
                if((j+startday)%7==6 || (j+startday)%7==0) continue;
                int workerTime = (timelogs[i][j]/100)*60+timelogs[i][j]%100;
                if(boundaryTime<workerTime){
                    gift = false;
                    break;
                }
                
            }
            if(gift) answer++;
        }
        
        return answer;
    }
}