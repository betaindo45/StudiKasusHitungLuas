public class Persegi {
    private double sisi;
    private double hasilLuas;

    Persegi(){
    }

    void setSisi(double sisi){
        this.sisi = sisi;
    }

    void printHasil(){
        hasilLuas = sisi*sisi;
        System.out.println((int)hasilLuas);
    }

}
