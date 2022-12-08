import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        int r,angle ;
        double pi = 3.14,alan,cevre;



        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Yarıçapı giriniz:");
        r = input.nextInt();
        System.out.print("Lütfen daire diliminin açısını giriniz:");
        angle = input.nextInt();
        alan = (angle/360)*r*r*pi;
        cevre = (angle/360)*2*pi*r +r+r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " +cevre);

    }
}
