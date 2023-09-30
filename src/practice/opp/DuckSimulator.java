package practice.opp;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DuckSimulator {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis bebek yang kamu lihat:");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Rubber Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Red Head Duck");
        int pilih_bebek = scanner.nextInt();

        Duck duck = null;

         switch (pilih_bebek) {
             case 1 -> duck = new MallardDuck();
             case 2 -> duck = new RubberDuck();
             case 3 -> duck = new DecoyDuck();
             case 4 -> duck = new RedHeadDuck();
             default -> {
                 System.out.println("Pilih sesuai nomor yang tersedia");
                 return;
             }
         }
        if (duck != null) {
            // Menampilkan perilaku bebek yang dipilih
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
        } else {
            System.out.println("Tidak ada bebek yang dipilih.");
        }
     }
}

    

