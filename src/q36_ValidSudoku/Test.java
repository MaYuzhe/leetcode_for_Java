package q36_ValidSudoku;

/**
 * Created by IDEA
 *
 * @author Ma Yuzhe
 * @date 2018/6/14
 * @time 14:08
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        char[][] arr = new char[][]{{'5','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}};
        char[][] arr = new char[][]{{'.','4','6','.','.','.','6','.','.'},
                                    {'.','.','.','6','.','.','.','.','4'},
                                    {'.','.','.','.','.','1','.','.','.'},
                                    {'.','.','.','.','.','7','.','.','.'},
                                    {'5','.','7','.','.','.','4','.','.'},
                                    {'.','.','.','.','.','.','.','.','3'},
                                    {'.','.','.','7','.','.','1','.','.'},
                                    {'.','.','.','.','.','.','.','.','.'},
                                    {'.','.','1','2','.','.','.','.','.'}};
        boolean b = solution.isValidSudoku(arr);
        System.out.println();
    }
}
