import java.io.*;
import java.util.Scanner;

public class PhanTu<T extends Comparable<T>> {
    private T n;

    public boolean isGreaterThan(T a) {
        return n.compareTo(a) > 0;
    }

    public static void ReadAndWrite(String input, String output) throws IOException {
        try {
            File read = new File(input);
            FileReader fileReader = new FileReader(read);
            BufferedReader in = new BufferedReader(fileReader);
            String s = in.readLine();

            File write = new File(output);
            FileWriter fileWriter = new FileWriter(write);
            PrintWriter out = new PrintWriter(fileWriter);

            while (s != null) {
                out.println(s);
                s = in.readLine();
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner data = new Scanner(System.in);
        System.out.print("Input: ");
        String input = data.nextLine();
        System.out.print("Output: ");
        String output = data.nextLine();
        ReadAndWrite(input, output);
    }
}
