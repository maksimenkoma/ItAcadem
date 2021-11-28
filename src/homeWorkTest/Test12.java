package homeWorkTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {


        String str = null;

        try
                (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
            String s = "?Write! text to character files using a default buffer size." +
                       " Encoding from characters to bytes, uses either a specified charset or the platform " +
                       "default charset.";
            bw.write(s);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try (
                BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {

                str = s;

            }

        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }

        String[] str2 = str.split("\\s+");
        String[] str3 = (str.replaceAll("[a-zA-Z0-9А-Яа-я]", " ")).split("\\s+");

        System.out.println("Количество слов " + str2.length + "\n " +
                           "Количество знаков припенания " + str3.length + "\n " +
                           "Общее колество " + (str2.length + str3.length));
    }


}
