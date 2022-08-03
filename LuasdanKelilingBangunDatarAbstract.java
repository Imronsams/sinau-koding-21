/**
 *
 * @author M M
 */
import java.util.*;
public class LuasdanKelilingBangunDatarAbstract extends MainAbstractBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LuasdanKelilingBangunDatarAbstract BangunDatar = new LuasdanKelilingBangunDatarAbstract();
        BangunDatar.pilihan();
    }
    
    @Override
    void pilihan(){
    
            Scanner input = new Scanner(System.in);
            
            int pilih;
            
            do {
            
            System.out.println("*****MENU HITUNG LUAS DAN KELILING*****");
            
            System.out.println("1.BANGUN DATAR PERSEGI");
            
            System.out.println("2.BANGUN DATAR PERSEGI PANJANG");
            
            System.out.println("3.BANGUN DATAR SEGITIGA");
            
            System.out.println("0.KELUAR");
            
            System.out.print("MASUKKAN PILIHAN ANDA (0/1/2/3) : ");
            
            pilih =input.nextInt();
            
            switch(pilih) {
            case 1: 
                persegi();
                break;
            case 2:
                persegipanjang();
                break;
            case 3:
                segitiga();
                break;  
            }
            System.exit(0);
            }
            
            while ((pilih!=0)||(pilih>3));
            
            System.out.println("TIDAK TERDAPAT PILIHAN TERSEBUT, PILIH KEMBALI");
            
            }
            @Override
            void persegi(){
                Scanner pilih = new Scanner(System.in);

                Scanner input = new Scanner(System.in);
                    
                int pilihan;
                
                double sisi,luas,keliling;
                
                do {
                
                System.out.println("++++MENGHITUNG LUAS DAN KELILING PERSEGI++++");
                
                System.out.println("1.LUAS PERSEGI");
                
                System.out.println("2.KELILING PERSEGI");
                
                System.out.println("0.KEMBALI KE MENU UTAMA");
                
                System.out.print("MASUKKAN PILIHAN ANDA (0/1/2) : ");
                
                pilihan =pilih.nextInt();
                
                switch(pilihan) {
                case 1: 
                    System.out.print("MASUKKAN SISI =");
                
                    sisi = input.nextDouble();
                    
                    luas = sisi * sisi;
                
                    System.out.println("LUAS PERSEGI ="+luas);
                    break;
                case 2:
                    System.out.print("MASUKKAN SISI =");
                
                    sisi = input.nextDouble();
                    
                    keliling = sisi * 4;
                
                    System.out.println("KELILING PERSEGI ="+keliling);
                    break;
                }
                pilihan();
            }
            while ((pilihan!=0)||(pilihan>2));
    
                    System.out.println("TIDAK TERDAPAT PILIHAN, PILIH KEMBALI");
            }
    @Override
    void persegipanjang(){
                Scanner pilih = new Scanner(System.in);

                Scanner input = new Scanner(System.in);    

                int pilihan;

                double panjang,lebar,luas,keliling;

                do {

                System.out.println("++++MENGHITUNG LUAS DAN KELILING PERSEGI PANJANG++++");

                System.out.println("1.LUAS PERSEGI PANJANG");

                System.out.println("2.KELILING PERSEGI PANJANG");

                System.out.println("0.KEMBALI KE MENU UTAMA");

                System.out.print("MASUKKAN PILIHAN ANDA (0/1/2) : ");

                pilihan =pilih.nextInt();

                switch(pilihan) {
                case 1: 
                    System.out.print("MASUKKAN PANJANG =");

                    panjang = input.nextDouble();
    
                    System.out.print("MASUKKAN LEBAR =");
    
                    lebar = input.nextDouble();
    
                    luas = panjang * lebar;

                    System.out.println("LUAS PERSEGI PANJANG ="+luas);
                    break;
                case 2:
                    System.out.print("MASUKKAN PANJANG =");

                    panjang = input.nextDouble();
    
                    System.out.print("MASUKKAN LEBAR =");
    
                    lebar = input.nextDouble();
    
                    keliling = 2 * (panjang+lebar);

                    System.out.println("KELILING PERSEGI ="+keliling);
                    break;
                }
                pilihan();
            }
            while ((pilihan!=0)||(pilihan>2));
    
                    System.out.println("TIDAK TERDAPAT PILIHAN, PILIH KEMBALI");
            }

    @Override
    void segitiga(){
            Scanner pilih = new Scanner(System.in);

            Scanner input = new Scanner(System.in);    

            int pilihan;

            double alas,tinggi,luas,keliling,sisi1,sisi2,sisi3;

        do {

            System.out.println("++++MENGHITUNG LUAS DAN KELILING SEGITIGA++++");

            System.out.println("1.LUAS SEGITIGA");

            System.out.println("2.KELILING SEGITIGA");

            System.out.println("0.KEMBALI KE MENU UTAMA");

            System.out.print("MASUKKAN PILIHAN ANDA (0/1/2) : ");

            pilihan =pilih.nextInt();

        switch(pilihan) {
            case 1: 
                System.out.print("MASUKKAN ALAS =");

                alas = input.nextDouble();
    
                System.out.print("MASUKKAN TINGGI =");
    
                tinggi = input.nextDouble();
    
                luas = (alas * tinggi)/2;

                System.out.println("LUAS SEGITIGA ="+luas);
            break;
            case 2:
                System.out.print("MASUKKAN SISI 1 =");

                sisi1 = input.nextDouble();
    
                System.out.print("MASUKKAN SISI 2 =");
    
                sisi2 = input.nextDouble();
    
                System.out.print("MASUKKAN SISI 3 =");
    
                sisi3 = input.nextDouble();

                keliling = sisi1+sisi2+sisi3;

                System.out.println("KELILING SEGITIGA ="+keliling);
            break;
            }
            pilihan();
        }
        while ((pilihan!=0)||(pilihan>2));

                System.out.println("TIDAK TERDAPAT PILIHAN, PILIH KEMBALI");
        }
    }
