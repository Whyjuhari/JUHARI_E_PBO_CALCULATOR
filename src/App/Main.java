// PROGRAM KALKULATOR SEDERHANA, YANG HANYA MENERIMA 2 OPERAND YANG DI INPUTKAN OLEH USER.
// BY JR PROGRAMMING 
// ):

package App;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        // Memanggil class Scanner Untuk meminta input dari user.        
        Scanner userInput = new Scanner(System.in);
        
        // Membuat objek pada class Calculator.
        Calculator simple = new Calculator();
        
        System.out.println("======================");
        System.out.println("====PROGRAM START=====");
        System.out.println("======================");
        
        boolean next = true;
        while (next) {            
            
            
            // Meminta Input angka dari user.
            System.out.print("Input angka pertama : ");
            simple.setOperan1(userInput.nextInt());
            System.out.print("Input angka kedua   : ");
            simple.setOperan2(userInput.nextInt());

            System.out.println("Pilih Operator : ");
            System.out.println("1. Tambah  (+)");
            System.out.println("2. Kurang  (-)");
            System.out.println("3. Kali    (*)");
            System.out.println("4. Bahagi  (/)");
            System.out.println("5. Modulus (%)");

            System.out.print("Pilih : ");
            int operasi = userInput.nextInt();


            switch (operasi) {
                case 1:
                    System.out.println("Hasil Jumlah  = " + simple.getTambah());
                    break;
                case 2:
                    System.out.println("Hasil Kurang  = " + simple.getKurang());
                    break;
                case 3:
                    System.out.println("Hasil Kali    = " + simple.getKali());
                    break;
                case 4:
                    System.out.println("Hasil Bahagi  = " + simple.getBagi());
                    break;
                case 5:
                    System.out.println("Hasil Modulus = " + simple.getModulus());
                    break;
                default:
                    System.out.println("Operasi yang anda pilih tidak ada!");
            }
            
            System.out.print("Do u want to continue?[Y/n] : ");
            String stop = userInput.next().toLowerCase();
            
            switch (stop) {
                case "y":
                    next = true;
                    break;
                case "n":
                    next = false;
                    System.out.println("======================");
                    System.out.println("====PROGRAM FINISH====");
                    System.out.println("======================");
                    break;
            }
        }
    }
}
