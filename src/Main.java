import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvli,kdvtutarı, kdv;
        Scanner ınput= new Scanner(System.in);
        System.out.print("Tutar giriniz=");
        tutar= ınput.nextDouble();
        kdv=(tutar>0)&&(tutar<=1000) ? 0.18 : 0.8;
        kdvtutarı=tutar*kdv;
        kdvli=kdvtutarı+tutar;
        System.out.println("kdv tutarı="+kdvtutarı);
        System.out.println("kdvli tutar="+kdvli);
        System.out.println("kdv oranı="+kdv);
    }
}