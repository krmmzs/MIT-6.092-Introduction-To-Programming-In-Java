import java.io.IOException;

public class Main {
    public static boolean testMagic(String pathName) throws IOException {
        MagicSquare magicSquare = new MagicSquare(MatrixReader.readMatrix(pathName));
        System.out.println("Target sum: " + magicSquare.getTarget());
        return magicSquare.isMagicSquare();
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "./src/Mercury.txt", "./src/Luna.txt"};
        for (String fileName : fileNames) {
            System.out.println(fileName + ": " + testMagic(fileName));
        }
    }
}
