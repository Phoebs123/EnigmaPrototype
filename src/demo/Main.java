package demo;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    char charTilInt, c;
    int intTilChar, i;

    void inputBogstav() {
        System.out.print("Indtast et bogstav (A-Å) der skal konverteres til et tal: ");
        charTilInt = in.next().charAt(0);
    }


    int bogstavTilTal (int i) {
        String alfabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int tal = alfabet.indexOf(charTilInt);
        return tal;
    }

    void inputTal() {
        System.out.print("Indtast et tal (1-29) der skal konverteres til et bogstav: ");
        intTilChar = in.nextInt();
    }

    char talTilBogstav (char c) {
        String alfabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        char bogstav = alfabet.charAt(intTilChar);
        return bogstav;

    }

    void go () {
        inputBogstav();
        int intTal = bogstavTilTal(i);
        inputTal();
        char charBogstav = talTilBogstav(c);
        System.out.println(intTal);
        System.out.println(Character.toUpperCase(charBogstav));
        //koder - return begge . uppercase
    }

    public static void main(String[] args) {
        new Main().go();
	// konvertere bogstav til tal (skal modtage char og returnere int)
        // og tal til bogstaver (skal modtage int og returnere char). char(store bogstaver) og int
        //mellemrum = 0. Char ' ' = 0; A = 1, Å = 29. (index of)

    }
}
