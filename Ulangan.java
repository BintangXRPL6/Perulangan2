package ulangan;
/*
Bintang Aji Wibowo  
X-RPL6
Absen: 10
*/
import java.util.Scanner;
public class Ulangan 
{    
    public static void main(String[] args) 
    {
        boolean ulang = true;
        while (ulang)
        {
        String pilihans = null;
        float bil_1, bil_2, total;
        Scanner input = new Scanner(System.in);
        System.out.println("---------Program Kalkulator---------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        
        boolean ulang3 = true;
        while (ulang3)
        {
        System.out.print("\nPilih Operasi: ");int pilihan = input.nextInt();
        switch (pilihan)
            {
                case 1 :
                    System.out.print("Masukan bilangan pertama: ");bil_1 = input.nextFloat();
                    System.out.print("Masukan bilangan pertama: ");bil_2 = input.nextFloat();
                    total = bil_1 + bil_2;
                    System.out.println("//////Proses//////");
                    System.out.println("Hasil Akhir: "+total);
                    ulang3 = false;
                    break;
                case 2 :
                    System.out.print("Masukan bilangan pertama: ");bil_1 = input.nextFloat();
                    System.out.print("Masukan bilangan pertama: ");bil_2 = input.nextFloat();
                    total = bil_1 - bil_2;
                    System.out.println("//////Proses//////");
                    System.out.println("Hasil Akhir: ");
                    ulang3 = false;
                    break;
                case 3 :
                    System.out.print("Masukan bilangan pertama: ");bil_1 = input.nextFloat();
                    System.out.print("Masukan bilangan pertama: ");bil_2 = input.nextFloat();
                    total = bil_1 * bil_2;
                    System.out.println("//////Proses//////");
                    System.out.println("Hasil Akhir: ");
                    ulang3 = false;
                    break;
                case 4 :
                    System.out.print("Masukan bilangan pertama: ");bil_1 = input.nextFloat();
                    System.out.print("Masukan bilangan pertama: ");bil_2 = input.nextFloat();
                    total = bil_1 / bil_2;
                    System.out.println("//////Proses//////");
                    System.out.println("Hasil Akhir: ");
                    ulang3 = false;
                    break;
                case 5 : 
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default : System.out.println("Pilihan tidak ada!");
            }
        }
        boolean ulang2 = true;
            while (ulang2) 
            {
        System.out.println("Ingin mengulanginya lagi?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        pilihans = input.next();
        
        
                if (pilihans.equalsIgnoreCase("Yes")) 
                {
                    ulang2 = false;
                    System.out.println("Ok");
                }else if (pilihans.equalsIgnoreCase("No")) 
                {
                    ulang2 = false;
                    ulang = false;
                    System.out.println("Terimakasih");
                }else   
                {
                    System.out.println("Pilihan Tidak ada!");
                }
            }
        }//Perulangan program
    }//AKhir dari PSVM
}//Akhir dari class
