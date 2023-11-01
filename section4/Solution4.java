package section4;

import java.util.HashMap;
import java.util.Scanner;

public class Solution4 {
    public int solution(String s,String t){
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            int cnt = 0;
            int lt = i;
            int rt = t.length()-1+i;
            for(int j = lt; j<=rt; j++){
                map.put(s.charAt(j),1);
            }
            for(int j=0; j<; j++){
                if(map.get((t.charAt(j))) == 1){

                }
            }

        }

        return result;
    }
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Scanner sc = new Scanner(System.in);
        // S문자열
        String S = sc.next();
        // T문자열
        String T = sc.next();
        System.out.println(s.solution(S,T));
    }
}
