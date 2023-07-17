class Solution {
    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int remainingCoins = n;
        int currentRow = 1;

        while (remainingCoins >= currentRow) {
            remainingCoins -= currentRow;
            completeRows++;
            currentRow++;
        }

        return completeRows;
    }

}