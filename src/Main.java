
import java.util.Scanner;


public class Main {

     public static void main(String[] args) {

         //Patika.dev egitim kampi proje odevidir.
         //if else dongu kullanilmadan yapilmasi istenmektedir.

         int mat,fizik,kimya,turkce,tarih,muzik;
         int toplam;
         double sonuc;

         Scanner not = new Scanner(System.in);

         System.out.println("Matematik notunuzu giriniz = ");

         mat = not.nextInt();

         Scanner not2 = new Scanner(System.in);

         System.out.println("Fizik notunuzu giriniz = ");

         fizik = not2.nextInt();

         Scanner not3 = new Scanner(System.in);

         System.out.println("Kimya notunuzu giriniz = ");

         kimya = not3.nextInt();

         Scanner not4 = new Scanner(System.in);

         System.out.println("Turkce notunuzu giriniz = ");

         turkce = not4.nextInt();

         Scanner not5 = new Scanner(System.in);

         System.out.println("Tarih notunuzu giriniz = ");

         tarih = not5.nextInt();

         Scanner not6 = new Scanner((System.in));

         System.out.println("Muzik notunuzu giriniz = ");

         muzik = not6.nextInt();


         toplam = (mat + fizik + kimya + turkce + tarih + muzik);

         sonuc = toplam / 6;

         System.out.println("Sonuc = "+sonuc);

         boolean durum = sonuc>=60;

         String str = durum ? "Sinifi gecti":"Sinifta kaldi";

         System.out.println(str);








    }

}
