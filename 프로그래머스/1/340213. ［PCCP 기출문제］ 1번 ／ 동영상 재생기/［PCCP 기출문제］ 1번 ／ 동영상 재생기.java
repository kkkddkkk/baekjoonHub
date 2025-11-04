class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        //video_len: 비디오 길이
        //op_start: 오프닝 시작시간
        //op_end: 오프닝 끝나는 시간
        //pos가 오프닝 중이면 자동으로 op_end로 이동
        //commands: prev=10초 전으로 이동(10초 미만일 경우 0분 0초로 이동), next= 10초 후로 이동(10초 미만으로 남았을 경우 video_len으로 이동)
        //pos: 현재 위치
        int now = Integer.parseInt(pos.split(":")[0])*60+
            Integer.parseInt(pos.split(":")[1]);
        int openStartTime = Integer.parseInt(op_start.split(":")[0])*60+
            Integer.parseInt(op_start.split(":")[1]);
        int openEndTime = Integer.parseInt(op_end.split(":")[0])*60+
            Integer.parseInt(op_end.split(":")[1]);
        int endTime = Integer.parseInt(video_len.split(":")[0])*60+
            Integer.parseInt(video_len.split(":")[1]);
        
        for(String command: commands){
            if(now>=openStartTime&&now<=openEndTime) now = openEndTime;
            
            if(command.equals("next")) now+=10;
            else if(command.equals("prev")) now-=10;
            if(now>=openStartTime&&now<=openEndTime) now = openEndTime;
            if(now<0) now = 0;
            else if(now>endTime) now = endTime;
        }
        String minute = now/60+"";
        minute = "0".repeat(2-minute.length())+minute;
        String second = now%60+"";
        second = "0".repeat(2-second.length())+second;
        answer = minute+":"+second;
        return answer;
    }
}