package keyboardRow500;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2017/12/17.
 */
public class Solution {
    public String[] findWords(String[] words) {
        List<Character> rowList1 = new ArrayList<>();
        List<Character> rowList2 = new ArrayList<>();
        List<Character> rowList3 = new ArrayList<>();
        rowList1.add('q');rowList1.add('w');rowList1.add('e');rowList1.add('r');
        rowList1.add('t');rowList1.add('y');rowList1.add('u');rowList1.add('i');
        rowList1.add('o');rowList1.add('p');

        rowList2.add('a');rowList2.add('s');rowList2.add('d');rowList2.add('f');
        rowList2.add('g');rowList2.add('h');rowList2.add('j');rowList2.add('k');
        rowList2.add('l');

        rowList3.add('z');rowList3.add('x');rowList3.add('c');rowList3.add('v');
        rowList3.add('b');rowList3.add('n');rowList3.add('m');
        String[] res = {};
        if(words==null||words.length==0)
            return res;
        List<String> anw = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] cArray = words[i].toLowerCase().toCharArray();
            int row1=0,row2=0,row3=0;
            for(char c:cArray){
                if(rowList1.contains(c))++row1;
                if(rowList2.contains(c))++row2;
                if(rowList3.contains(c))++row3;
            }
            if(row1+row2==0 || row1+row3==0 || row2+row3==0)
                anw.add(words[i]);
        }
        String[] strArray = new String[anw.size()];
        int i=0;
        for(String str:anw)
            strArray[i++]=str;
        return strArray;
    }
}
