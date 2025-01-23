
import java.util.ArrayList;

public class MagicSquare {
    private final ArrayList<ArrayList<Integer>> matrix;
    private final int target;

    public MagicSquare(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
        this.target = calculateRowSum(0);
    }

    private int calculateRowSum(int rowIndex) {
        int sum = 0;
        for (Integer value : matrix.get(rowIndex)) {
            sum += value;
        }
        return sum;
    }

    private int calculateColumnSum(int colIndex) {
        int sum = 0;
        for (ArrayList<Integer> row : matrix) {
            sum += row.get(colIndex);
        }
        return sum;
    }

    private int calculateMainDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.size(); i++) {
            sum += matrix.get(i).get(i);
        }
        return sum;
    }

    private int calculateSecondDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.size(); i++) {
            sum += matrix.get(i).get(matrix.size() - 1 - i);
        }
        return sum;
    }

    public boolean isMagicSquare() {
        // 检查所有行的和
        for (int i = 0; i < matrix.size(); i++) {
            if (calculateRowSum(i) != target) {
                return false;
            }
        }

        // 检查所有列的和
        for (int j = 0; j < matrix.get(0).size(); j++) {
            if (calculateColumnSum(j) != target) {
                return false;
            }
        }

        // 检查主对角线和副对角线
        return calculateMainDiagonalSum() == target && 
               calculateSecondDiagonalSum() == target;
    }

    public int getTarget() {
        return target;
    }
}
