import java.io.*;
import java.util.*;

public class PhanTu<T extends Comparable<T>> {
    private T value;

    public PhanTu(T n) {
        this.value = n;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isGreaterThan(T a) {
        return value.compareTo(a) > 0;
    }

    public static void ReadAndWrite(String input, String output) {
        List<Integer> list = new ArrayList<Integer>();
        try {
            File read = new File(input);
            Scanner data = new Scanner(read);
            while (data.hasNextInt()) {
                list.add(data.nextInt());
            }
            data.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Collections.sort(list);

        try {
            File write = new File(output);
            FileWriter fileWriter = new FileWriter(write);
            PrintWriter out = new PrintWriter(fileWriter);
            for (int i : list) {
                out.print(i + " ");
            }
            out.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Input: ");
        String input = data.nextLine();
        System.out.print("Output: ");
        String output = data.nextLine();
        ReadAndWrite(input, output);
    }
}
