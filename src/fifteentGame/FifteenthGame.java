package fifteentGame;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FifteenthGame implements Serializable {

    public static final long serializableVersion = 2l;

    private int n;
    private int vertical;
    private int horizontal;
    private String temp;
    private String[][] game;


    public FifteenthGame(int n) {
        this.n = n;
        this.game = new String[n][n];
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String[][] getGame() {
        return game;
    }

    public void setGame(String[][] game) {
        this.game = game;
    }

    public String[][] createGame() {

        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {

                game[i][k] = String.valueOf(count++);
            }

        }

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {

                if (game[i][k].equals(String.valueOf(n * n))) {

                    game[i][k] = "*";
                }
            }
        }

        for (String[] a : game) {
            Collections.shuffle(Arrays.asList(game));
            for (String b : a) {
            }
            Collections.shuffle(Arrays.asList(a));
        }
        return game;

    }

    public void print() {

        for (String[] a : game) {
            for (String b : a) {
                System.out.printf("%3s ", b);
            }

            System.out.println();
        }
    }

    public String[][] move() {


        System.out.println("Take your move\n" +
                           "u -> up\n" +
                           "d -> down\n" +
                           "r -> right\n" +
                           "l -> left\n" +
                           "e -> exit");
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();

        System.out.println("");
        switch (enter) {
            case ("u"):

                for (int j = 0; j < n; j++) {
                    for (int e = 0; e < n; e++) {

                        if (game[j][e].equals("*")) {
                            vertical = j;
                            horizontal = e;
                        }

                    }

                }

                if ((vertical - 1) >= 0) {
                    temp = game[vertical - 1][horizontal];
                    game[vertical - 1][horizontal] = game[vertical][horizontal];
                    game[vertical][horizontal] = temp;
                } else System.out.println("Outside the field");
                break;

            case ("d"):
                for (int j = 0; j < n; j++) {
                    for (int e = 0; e < n; e++) {

                        if (game[j][e].equals("*")) {
                            vertical = j;
                            horizontal = e;
                        }

                    }

                }

                if (vertical + 1 < n) {
                    temp = game[vertical + 1][horizontal];
                    game[vertical + 1][horizontal] = game[vertical][horizontal];
                    game[vertical][horizontal] = temp;
                } else System.out.println("Outside the field");
                break;
            case ("r"):
                for (int j = 0; j < n; j++) {
                    for (int e = 0; e < n; e++) {

                        if (game[j][e].equals("*")) {
                            vertical = j;
                            horizontal = e;
                        }
                    }
                }

                if (horizontal + 1 < n) {
                    temp = game[vertical][horizontal + 1];
                    game[vertical][horizontal + 1] = game[vertical][horizontal];
                    game[vertical][horizontal] = temp;
                } else System.out.println("Outside the field");
                break;
            case ("l"):
                for (int j = 0; j < n; j++) {
                    for (int e = 0; e < n; e++) {

                        if (game[j][e].equals("*")) {
                            vertical = j;
                            horizontal = e;
                        }
                    }
                }

                if (horizontal - 1 >= 0) {
                    temp = game[vertical][horizontal - 1];
                    game[vertical][horizontal - 1] = game[vertical][horizontal];
                    game[vertical][horizontal] = temp;
                } else System.out.println("Outside the field");
                break;
            case ("e"):
                System.exit(1);
                break;
            default:
                System.out.println("Input error");

        }
        print();
        return game;
    }

    public boolean check() {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < game.length; i++) {
            for (int k = 0; k < game.length; k++) {
                list.add(game[i][k]);
            }
        }

        List<String> list2 = list.stream().sorted().skip(1).collect(Collectors.toList());
        list2.add("*");
       if (list.equals(list2)){
           System.out.println("You are winner!!!");
       }
        return list.equals(list2);

    }
    public void save(Object o) throws Exception {
        try (final FileOutputStream fos = new FileOutputStream("game.txt");
             final ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(o);
        }
    }

    public FifteenthGame read() throws Exception {
        FifteenthGame fifteenthGame = null;
        try (final FileInputStream fis = new FileInputStream("game.txt");
             final ObjectInputStream ois = new ObjectInputStream(fis)) {

                Object o = ois.readObject();
                if (o instanceof FifteenthGame) {
                    fifteenthGame = (FifteenthGame) o;

                }

            }
        return fifteenthGame;
    }
}