package multidimensional_array.gaps;

public class Gaps {

    /**
     * Return boolean if has gaps in between pairs
     * [1, 2] [2, 10] [10, 15] - false
     * [1, 2] [5, 10] [10, 15] - true
    * */
    public boolean hasGap(int[][] n) {
       for (int i = 0; i < n.length - 1; i++) {
           if (n[i+1][0] > n[i][1]) {
               return true;
           }
       }
       return false;
    }
}
