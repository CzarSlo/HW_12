import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejka {
    public static void main(String[] args) {

        Queue<Integer> numbers = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 10 liczb:");

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            numbers.offer(scan.nextInt());
        }

        System.out.println("Suma podanych liczb wynosi: ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next + "+");
            sum += next;
        }

        System.out.println("...= " + sum);

    }

}
//          Treść zadania:
//    Korzystając z kolejki wczytaj od użytkownika 10 liczb a następnie wyświetl na ekranie wynik dodawania w postaci:
//
//        a+b+c+…+j = suma
//
//        W zadaniu wykorzystaj kolejki.
