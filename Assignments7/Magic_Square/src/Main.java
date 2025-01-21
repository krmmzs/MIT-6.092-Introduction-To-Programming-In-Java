import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static boolean testMagic(String pathName) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(pathName));
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        String line;
        while ((line = buffer.readLine()) != null) {
            ArrayList<Integer> row = new ArrayList<>();
            String[] parts = line.split("\t");
            for (String part : parts) {
                row.add(Integer.parseInt(part));
            }
            matrix.add(row);
        }
        buffer.close();

        int target = -1;
        for (ArrayList<Integer> row : matrix) {
            int curRowSum = 0;
            for (Integer value : row) {
                curRowSum += value;
            }
            if (target == -1) {
                target = curRowSum;
            } else if (target != curRowSum) {
                return false;
            }
        }

        System.out.println("target: " + target);
        for (int j = 0; j < matrix.get(0).size(); j ++) {
            int curColSum = 0;
            for (int i = 0; i < matrix.size(); i ++) {
                curColSum += matrix.get(i).get(j);
            }
            if (curColSum != target) {
                return false;
            }
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < matrix.size(); i ++) {
            mainDiagonalSum += matrix.get(i).get(i);
        }
        System.out.println("mainDiagonalSum: " + mainDiagonalSum);
        if (mainDiagonalSum != target) {
            return false;
        }

        int sencondDiagonalSum = 0;
        for (int i = 0; i < matrix.size(); i ++) {
            sencondDiagonalSum += matrix.get(i).get(matrix.get(0).size() - 1 - i);
        }
        System.out.println("sencondDiagonalSum: " + sencondDiagonalSum);
        if (sencondDiagonalSum != target) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "./src/Mercury.txt", "./src/Luna.txt"};
        for (String fileName : fileNames) {
            System.out.println(fileName + ": " + testMagic(fileName));
        }
    }
}