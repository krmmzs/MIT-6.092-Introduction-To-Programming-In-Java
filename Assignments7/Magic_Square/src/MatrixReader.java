
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MatrixReader {
    public static ArrayList<ArrayList<Integer>> readMatrix(String pathName) throws IOException {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        try (BufferedReader buffer = new BufferedReader(new FileReader(pathName))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                ArrayList<Integer> row = new ArrayList<>();
                String[] parts = line.split("\t");
                for (String part : parts) {
                    row.add(Integer.parseInt(part));
                }
                matrix.add(row);
            }
        }
        
        return matrix;
    }
}
