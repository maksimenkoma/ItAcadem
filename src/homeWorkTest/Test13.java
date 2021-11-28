package homeWorkTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test13 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            fileOut = new FileOutputStream("file2.txt");
            fileIn = new FileInputStream("file2.txt");

            for (int i = 0; i <= 30; i++) {
                fileOut.write(new Random().nextInt(100));
            }
            int a;
            while ((a = fileIn.read()) != -1) {
                list.add(a);
            }


        } finally {
            if (fileOut != null) {
                fileOut.close();
            }
            if (fileIn != null) {
                fileIn.close();
            }

            list.forEach(System.out::println);

            System.out.println("Cреднее арифметическое "+ list.stream().collect(Collectors.averagingInt(Integer::intValue)));
        }


    }
}
