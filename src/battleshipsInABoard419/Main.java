package battleshipsInABoard419;

/**
 * Created by wb on 2018/3/6.
 */
public class Main {
    public static void main(String[] args){
        char[][] board = {{'.','X','.','.','X'},
                        {'.','X','.','.','X'},
                        {'.','.','.','.','X'},
                        {'X','.','X','X','.'},
                        {'X','.','.','.','X'}};
        Solution solution = new Solution();
        System.out.println(solution.countBattleships(board));
    }
}
