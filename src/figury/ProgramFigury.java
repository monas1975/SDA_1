package figury;



import java.util.Scanner;



public class ProgramFigury {

    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println("Jaka figura: ");

        System.out.println("1. Prostokat");

        System.out.println("2. Kwadrat");

        System.out.println("3. Koło");

        int wybor = scanner.nextInt();



        Figury figuraDoPoliczenia = null;

        if (wybor == 1) {

            System.out.println("Podaj a");

            double a = scanner.nextDouble();

            System.out.println("Podaj b");

            double b = scanner.nextDouble();

            figuraDoPoliczenia = new Prostokat(a, b);

        } else if (wybor == 2) {

            System.out.println("Podaj bok");

            double bok = scanner.nextDouble();

            figuraDoPoliczenia = new Kwadrat(bok);

        }



        double obwod = figuraDoPoliczenia.obliczObwod();

        double pole = figuraDoPoliczenia.obliczPole();



        System.out.println("Obwod to: " + obwod);

        System.out.println("Pole to: " + pole);

    }

}