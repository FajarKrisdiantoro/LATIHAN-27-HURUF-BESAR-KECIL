/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpbogit27;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat : ");
        String teks = input.nextLine();
        
        System.out.println("====Hasil Formating====");
        // Mengubah menjadi huruf besar
        String hurufBesar = teks.toUpperCase();
        System.out.println("Huruf Besar: " + hurufBesar);

        // Mengubah menjadi huruf kecil
        String hurufKecil = teks.toLowerCase();
        System.out.println("Huruf Kecil: " + hurufKecil);

    }
    
}
