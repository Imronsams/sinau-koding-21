/**
 *
 * @author M M
 */
import java.util.*;
public class LuasdanKelilingBangunDatarInterface implements MainInterfaceBangunDatar {

    public static void main(String args[]) {
        LuasdanKelilingBangunDatarInterface BangunDatar = new LuasdanKelilingBangunDatarInterface();
        BangunDatar.pilihan();
    }
    @Override
    public void pilihan(){
    
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
            public void persegi(){
                System.out.println("++++LUAS DAN KELILING PERSEGI++++");
                System.out.println("JIKA DIKETAHUI SISI PERSEGI ADALAH : "+sisi);
                double luas = sisi * sisi;
                double keliling = sisi * 4;
                System.out.println("MAKA LUAS PERSEGI ADALAH : "+luas);
                System.out.println("DAN KELILING PERSEGI ADALAH : "+keliling);
                System.out.println("TERIMAKASIH TELAH MENGGUNAKAN SISTEM KAMI");
                pilihan();
            }
            @Override
            public void persegipanjang(){
                System.out.println("++++LUAS DAN KELILING PERSEGI PANJANG++++");
                System.out.println("JIKA DIKETAHUI PANJANG PERSEGI ADALAH : "+panjang);
                System.out.println("DAN DIKETAHUI LEBAR PERSEGI ADALAH : "+lebar);
                double luas = panjang * lebar;
                double keliling = 2 * (panjang+lebar);
                System.out.println("MAKA LUAS PERSEGI PANJANG ADALAH : "+luas);
                System.out.println("DAN KELILING PERSEGI PANJANG ADALAH : "+keliling);
                System.out.println("TERIMAKASIH TELAH MENGGUNAKAN SISTEM KAMI");
                pilihan();
            }
            @Override
            public void segitiga(){
            System.out.println("++++LUAS DAN KELILING SEGITIGA++++");
            System.out.println("JIKA DIKETAHUI ALAS SEGITIGA ADALAH : "+alas);
            System.out.println("DAN DIKETAHUI TINGGI SEGITIGA ADALAH : "+tinggi);
            double luas = (alas * tinggi)/2;
            System.out.println("MAKA LUAS SEGITIGA ADALAH : "+luas);
            System.out.println("JIKA DIKETAHUI SISI PERTAMA SEGITIGA ADALAH : "+sisi1);
            System.out.println("JIKA DIKETAHUI SISI KEDUA SEGITIGA ADALAH : "+sisi2);
            System.out.println("JIKA DIKETAHUI SISI KETIGA SEGITIGA ADALAH : "+sisi3);
            double keliling = sisi1+sisi2+sisi3;
            System.out.println("MAKA KELILING SEGITIGA ADALAH : "+keliling);
            System.out.println("TERIMAKASIH TELAH MENGGUNAKAN SISTEM KAMI");
            pilihan();
        }
}
