package codingPractice;

import java.util.HashMap;
import java.util.HashSet;

public class FindLongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";

        HashMap map = new HashMap<>();
        HashSet seen = new HashSet<>();
        int index =0;
        String s="";
        int i = 1;
        for(char ch : str.toCharArray())
        {
            if (!seen.contains(ch)) {
                seen.add(ch);
                s += ch;
                index++;
            }
            else{
                    map.put(s, index);
                    s="";
                    index =0;
                    seen=null;
                    seen=new HashSet<>();;
                    str = str.substring(i, str.length());
                    i++;
                    
            }
        }

        System.out.println(map);
    }
}
