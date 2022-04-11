public class Lingkaran {

    private double jariJari;

    Lingkaran(){
    }

    void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

    void printHasil(){
        double luasLingkaran;
        if(jariJari % 7 == 0){
            double phiDua = 22/7;
            luasLingkaran = jariJari*jariJari* phiDua;
            System.out.print(luasLingkaran);
        }else{
            double phiSatu = 3.14;
            luasLingkaran = jariJari*jariJari* phiSatu;
            System.out.println((int) luasLingkaran);
        }
    }

}

