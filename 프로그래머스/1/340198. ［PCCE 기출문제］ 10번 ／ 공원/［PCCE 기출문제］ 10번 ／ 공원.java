import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;

        Arrays.sort(mats);

        for (int i = mats.length - 1; i >= 0; i--) {
            int matSize = mats[i];

            for (int r = 0; r <= rows - matSize; r++) {
                for (int c = 0; c <= cols - matSize; c++) {
                    if (canPlace(r, c, matSize, park)) {
                        return matSize;
                    }
                }
            }
        }

        return -1;
    }

    private boolean canPlace(int r, int c, int size, String[][] park) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        
        return true;
    }
}