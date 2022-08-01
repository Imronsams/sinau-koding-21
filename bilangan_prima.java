public class bilangan_prima {
    public static void main(String[] args) {
    int bilangan;
        System.out.println("----------------------------------------------");
        for (int i=1; i<=50; i++){
            bilangan=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bilangan=bilangan+1;
                }
            }
            if (bilangan==2){
                System.out.println(i+" adalah bilangan prima");
            } 
            else {
                System.out.println(i+" adalah bilangan bukan prima");
            } 
        }    
   }
}