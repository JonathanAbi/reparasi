
package reparasi;
import java.util.Scanner;
public class Reparasi {

   
    public static void main(String[] args) {
        int item1 = 0,item2 = 0,item3 = 0,item4 = 0,ttl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih merk mobil anda");
        System.out.println("1. Lamborghini");
        System.out.println("2. Toyota");
        System.out.println("3. Aston Martin");
        System.out.println("4. Hummer");
        System.out.println("5. Honda");
        int merk = sc.nextInt();
        System.out.println("Pilih bagian yang ingin direparasi");
        System.out.println("1 untuk Ya");
        System.out.println("2 untuk Tidak");
        System.out.println("Bumper");
        int bumper = sc.nextInt();
        System.out.println("Spion");
        int spion = sc.nextInt();
        System.out.println("Body");
        int body = sc.nextInt();
        System.out.println("Mesin");
        int mesin = sc.nextInt();
        
        switch (merk) {
            case 1:
                if(bumper == 1){
                   item1 = 100000;
                   }else{
                   item1 = 0;
                }if(spion ==1){
                    item2 = 30000;
                   }else{
                   item2 = 0;
                }if(body ==1){
                    item3 = 200000;
                   }else{
                    item3 = 0;
                }if(mesin == 1){
                    item4 = 300000;
                   }else{
                    item4 = 0;
                }break;
            case 2:
                if(bumper == 1){
                   item1 = 10000;
                  }else{
                   item1 = 0;
                }if(spion ==1){
                   item2 = 5000;
                  }else{
                   item2 = 0;
                }if(body ==1){
                   item3 = 50000;
                  }else{
                   item3 = 0;
                }if(mesin == 1){
                   item4 = 30000;
                  }else{
                   item4 = 0;
                }break;
            case 3:
                if(bumper == 1){
                    item1 = 20000;
                  }else{
                    item1 = 0;
                }if(spion ==1){
                    item2 = 40000;
                  }else{
                    item2 = 0;
                }if(body ==1){
                    item3 = 100000;
                  }else{
                    item3 = 0;
                }if(mesin == 1){
                    item4 = 200000;
                  }else{
                    item4 = 0;
                }break;
            case 4:
                if(bumper == 1){
                    item1 = 30000;
                  }else{
                    item1 = 0;
                }if(spion ==1){
                    item2 = 3000;
                  }else{
                    item2 = 0;
                }if(body ==1){
                    item3 = 90000;
                  }else{
                    item3 = 0;
                }if(mesin == 1){
                    item4 = 150000;
                  }else{
                    item4 = 0;
                }break;
            case 5:
                if(bumper == 1){
                    item1 = 40000;
                  }else{
                    item1 = 0;
                }if(spion ==1){
                    item2 = 1000;
                  }else{
                    item2 = 0;
                }if(body ==1){
                    item3 = 40000;
                  }else{
                    item3 = 0;
                }if(mesin == 1){
                    item4 = 10000;
                  }else{
                    item4 = 0;
                }break;
            default:
                break;
        }
            ttl = 10000 + item1 + item2 + item3 + item4;
            System.out.println("Total Pembayaran= " + ttl);
      }   
   }
