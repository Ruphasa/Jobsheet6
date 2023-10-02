import java.util.Scanner;
public class Pemilihan2Percobaan224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int sudut1, sudut2, sudut3, totSud;
        System.out.print("Masukan sudut 1 : ");
        sudut1 = input24.nextInt();
        System.out.print("Masukan sudut 2 : ");
        sudut2 = input24.nextInt();
        System.out.print("Masukan sudut 3 : ");
        sudut3 = input24.nextInt();
        totSud = sudut1 + sudut2 + sudut3;
        if (totSud==180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("segitiga tersebut adalah segitiga siku - siku");
            } else if(sudut1==60&&sudut2==60&&sudut3==60) {
                System.out.println("segitiga tersebut adalah segititga sama sisi");
            }else if (sudut1==sudut2||sudut1==sudut3||sudut2==sudut3) {
                System.out.println("segitiga tersebut adalah segititga sama kaki");
            }else{
                System.out.println("segitiga sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}
