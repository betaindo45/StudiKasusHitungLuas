import java.util.Scanner;

public class Main {

    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = inp.nextInt();
        switch(pilihan){
            case 1:
                double sisi = inp.nextDouble();
                if(sisi != 0){
                    Persegi kotak = new Persegi();
                    kotak.setSisi(sisi);
                    kotak.printHasil();
                }
                break;
            case 2:
                double alas = inp.nextDouble();
                double tinggi = inp.nextDouble();

                Segitiga triangle = new Segitiga();
                triangle.setAlas(alas);
                triangle.setTinggi(tinggi);
                triangle.printHasil();

                break;
            case 3:
                double jariJari = inp.nextDouble();

                Lingkaran circle = new Lingkaran();
                circle.setJariJari(jariJari);
                circle.printHasil();

                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}