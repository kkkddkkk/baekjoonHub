import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(char c:a.toCharArray()){
            if(Character.isLowerCase(c))System.out.print((c+"").toUpperCase());
            else System.out.print((c+"").toLowerCase());
        }
    }
}