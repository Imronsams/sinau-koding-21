import java.util.*;
public class Nilai_Mahasiswa{

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        List<Integer> nl = new ArrayList<>();
        List<String> nm = new ArrayList<>();
        int jumlah;
        String keterangan;
        System.out.print("MASUKKAN BANYAKNYA MAHASISWA : ");
        jumlah =input.nextInt();
        for(int a=1;a<=jumlah;a++){
            
            System.out.println("MAHASISWA KE : "+a);
            System.out.print("NAMA : ");
            nm.add(input.next());
            System.out.print("NILAI : ");
            nl.add(input.nextInt());
        }
        System.out.println("=======================");
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("=======================");
        System.out.println("No     || Nama     || Nilai     || Status");
        for(int i = 0; i < nl.size(); i++) {
            if(nl.get(i)>=65){
                keterangan = "LULUS";
            }
            else{
                keterangan = "TIDAK LULUS";
            }
        System.out.println((i+1)+"      ||"+nm.get(i)+"     ||"+nl.get(i)+"     || "+keterangan);
        }
    }
}