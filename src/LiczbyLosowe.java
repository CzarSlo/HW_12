import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LiczbyLosowe {
    public static void main(String[] args) {

        TreeSet<Integer> num = new TreeSet<>();
        Random rand = new Random();

        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            int n = rand.nextInt(1000) + 0;  //50 is the maximum and the 1 is our minimum
            num.add(n);
            sum += n;

        }
        System.out.println("Zbiór wylosowanych 50 liczb: ");
        for (Integer integer : num) {
            System.out.print(integer + " ");
        }

        int avg = sum / 50;
        System.out.println("\n" + "Najmniejsza wylosowana liczba: " + num.first());
        System.out.println("Największa wylosowana liczba: " + num.last());
        System.out.println("Srednia: " + avg);

        System.out.println("Liczby większe od średniej: ");
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > avg) {
                System.out.print(next + " ");
            }
        }

    }
}

//          Treść zadania:
//    Stwórz zbiór i umieść w nim 50 losowych liczb z przedziału 0-1000.
//
//        Na ekranie wyświetl:
//
//        najmniejszą z liczb
//        największą z liczb
//        średnią ze wszystkich liczb
//        wszystkie liczby większe od średniej