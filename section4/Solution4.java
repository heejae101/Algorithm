package section4;

import java.util.HashMap;
import java.util.Scanner;

public class Solution4 {
    public int solution(String s,String t){
        int result = 0;
        // s 문자열
        HashMap<Character,Integer> sMap = new HashMap<>();
        // t 문자열
        HashMap<Character,Integer> tMap = new HashMap<>();
        // t문자열에 있는 문자들 넣기
        for(char x : t.toCharArray()){
            tMap.put(x,tMap.getOrDefault(x,0)+1);
        }
        // s 문자열에서 t길이에 -1 한만큼 s문자열 넣고 시작
        for(int i=0; i<t.length()-1; i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length()-t.length()+1; i++){
            int rt = t.length()-1+i;
            sMap.put(s.charAt(rt),sMap.getOrDefault(s.charAt(rt),0)+1);
            if(sMap.equals(tMap)) result++;
            if(sMap.get(s.charAt(i))>1) sMap.put(s.charAt(i),sMap.get(s.charAt(i))-1);
            else sMap.remove(s.charAt(i));
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
