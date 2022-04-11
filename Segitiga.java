public class Segitiga {
    private double alas;
    private double tinggi;
    private double hasilLuas;

    Segitiga(){
    }

    void setAlas (double alas){this.alas = alas;}

    void setTinggi(double tinggi){this.tinggi = tinggi;}

    void printHasil(){
        hasilLuas = alas*tinggi/2;
        if(hasilLuas % 1 == 0){
            System.out.printf("%.0f", hasilLuas);
        }else{
            System.out.println((int)hasilLuas);
        }
    }

}
