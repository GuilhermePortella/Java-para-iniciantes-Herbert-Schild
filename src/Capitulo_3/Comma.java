package Capitulo_3;

/**
 *
 * @author Guilherme
 */
public class Comma {

    //USE VIRGULAS EM UMA INSTRUÇÃO FOR
    public static void main(String[] args) {

        int i, x;

        for (i = 0, x = 10; i < x; i++, x--) {       //Duas variaveis  de controle no laço
            System.out.println("i and j: " + i + " - " + x);

        }
    }
}
