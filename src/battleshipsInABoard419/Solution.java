package battleshipsInABoard419;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wb on 2018/3/6.
 */
public class Solution {
    public int countBattleships(char[][] board) {
        Set<String> set = new HashSet<>();
        int result = 0;
        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[0].length;++j){
                String s = i + "," + j;
                if(set.contains(s))continue;
                if(board[i][j]=='X'){
                    ++result;
                    if(j<board[0].length-1 && board[i][j+1]=='X')
                        while(j<board[0].length-1 && board[i][++j]=='X');
                    else if(i<board.length-1 && board[i+1][j]=='X') {
                        int k=i;
                        while (k < board.length - 1 && board[++k][j] == 'X') {
                            set.add(k + "," + j);
                        }
                    }
                }
            }
        }
        return result;
    }
}
