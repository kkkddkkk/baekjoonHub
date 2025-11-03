class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        //bandage: 붕대감는 시간, 체력 회복량, 성공 시 추가 회복량
        //health: 최대 체력
        //attacks: 몬스터 공격 시간, 피해량
        int monsterTurn = 0;
        int count = 0;
        int hp = health;
        for(int i=0;i<=attacks[attacks.length-1][0];i++){
            if(attacks[monsterTurn][0]==i){
                hp-=attacks[monsterTurn][1];
                if(hp<=0) break;
                monsterTurn++;
                count = 0;
                continue;
            }
            hp+=bandage[1];
            
            if(count == bandage[0]-1){
                hp+=bandage[2];
                count = 0;
            }else{
                count++;
            }
            if(i==0) count = 0;
            if(hp>health) hp = health;
        }
        answer = hp<=0?-1:hp;
        return answer;
    }
}