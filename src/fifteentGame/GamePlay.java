package fifteentGame;


import java.io.*;
import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) throws Exception {

        FifteenthGame fifteenthGame = new FifteenthGame(4);

        System.out.println("Game start, if you want starts new game enter -> 'g'\n" +
                           "download the game enter -> 'с'");


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals("g")){
            System.out.println("Good game!");
            fifteenthGame.createGame();

            fifteenthGame.print();

            while (!(fifteenthGame.check())) {
                fifteenthGame.move();
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("s -> save game\n" +
                                   "e -> exit game\n"+
                                   "n -> play on");
                String a = scanner2.nextLine();
                if (a.equals("s")) {
                    fifteenthGame.save(fifteenthGame);
                }else if(a.equals("e")){
                    System.exit(1);
                }else if(a.equals("n")){
                    fifteenthGame.move();
                }

            }

        }else if(s.equals("c")){
            FifteenthGame fifteenthGame1=fifteenthGame.read();
            while (!(fifteenthGame1.check())) {
                fifteenthGame1.move();
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("s -> save game\n" +
                                   "e -> exit game\n"+
                                   "n -> play on");
                String a = scanner2.nextLine();
                if (a.equals("s")) {
                    fifteenthGame1.save(fifteenthGame);
                }else if(a.equals("e")){
                    System.exit(1);
                } else if(a.equals("n")){
                fifteenthGame.move();
            }

            }
        }
    }

}