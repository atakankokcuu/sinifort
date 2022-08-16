import java.util.Scanner;

public class dersler {
    public static void main(String[] args) {
        boolean deger = true;
        int turkce, matematik, fizik, kimya, muzik;
        int tu=0;
        int ma=0;
        int fi=0;
        int ki=0;
        int mu=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("turkce notunu girin= ");
        turkce = scanner.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("türkçe değeri 0ile 100 arasında değil ortalamaya katılmayacak");

        } else {
             tu = turkce;
        }


        System.out.print("matematik notunu girin= ");
        matematik = scanner.nextInt();
        if (matematik < 0 || matematik > 100) {
            System.out.println("matematik değeri 0ile 100 arasında değil ortalamaya katılmayacak");

        } else {
             ma = matematik;
        }




        System.out.print("fizik notunu girin= ");
        fizik = scanner.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("fizik değeri 0ile 100 arasında değil ortalamaya katılmayacak");

        } else {
             fi = fizik;
        }


        System.out.print("kimya notunu girin= ");
        kimya = scanner.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("kimya değeri 0ile 100 arasında değil ortalamaya katılmayacak");

        } else {
             ki = kimya;
        }


        System.out.print("muzik notunu girin= ");
        muzik = scanner.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("muzik değeri 0ile 100 arasında değil ortalamaya katılmayacak");

        } else {
             mu = muzik;
        }
        double ortalama =(tu+ma+fi+ki+mu)/5;
        System.out.print("ortalamanız= "+ortalama);
    }
}
