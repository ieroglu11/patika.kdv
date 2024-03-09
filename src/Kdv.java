import java.util.Scanner;
public class Kdv {
    public static void main(String[] args ) {

    double tutar , kdvOran , kdvTutar , kdvliTutar;
    Scanner input = new Scanner(System.in);

    System.out.print("Ücret tutarını giriniz: " );
    tutar =input.nextDouble();

    if(tutar <=1000) {
        kdvOran=0.18;
    }
    else {
        kdvOran=0.08;
    }
    kdvTutar = tutar * kdvOran;
    kdvliTutar = tutar + kdvTutar;

    System.out.println("Kdv'siz Tutar: " +" " + tutar);
    System.out.println("Kdv Oranı: " +" " + kdvOran);
    System.out.println("Kdv Tutarı:" +" " + kdvTutar);
    System.out.println("Kdv'li Tutar:" +" " + kdvliTutar);


    }
}
