package homeWorkAssessment;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task9 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> lines2 = new ArrayList<>();

        Path file1 = Paths.get("E:\\in1.txt");
        Path file2 = Paths.get("E:\\in2.txt");
        Path out = Paths.get("E:\\out.txt");

        for (int i = 0; i < 1000; i++) {
            lines.add(String.valueOf(new Random().nextInt(100000)));
            lines2.add(String.valueOf(new Random().nextInt(100000)));
        }
        Files.write(file1, lines, StandardCharsets.UTF_8);
        Files.write(file2, lines2, StandardCharsets.UTF_8);

        Path path = Path.of("E:\\in1.txt");
        List<String> lines3 = Files.readAllLines(path);

        Path path2 = Path.of("E:\\in2.txt");
        List<String> lines4 = Files.readAllLines(path2);

        List<Integer> temp = new ArrayList<>();

        for (String a : lines3) {
            temp.add(Integer.parseInt(a));

        }
        for (String a : lines4) {
            temp.add(Integer.parseInt(a));

        }
        Collections.sort(temp);

        ArrayList<String> outArraySort2 = new ArrayList<>();
        for (Integer a : temp) {
            outArraySort2.add((String.valueOf(a)));

        }

        Files.write(out, outArraySort2, StandardCharsets.UTF_8);

    }
}
