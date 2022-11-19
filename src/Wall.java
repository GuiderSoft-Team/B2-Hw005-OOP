public class Wall {
    private double genislik;
    private double yukseklik;

    public double getGenislik() {
        return genislik;
    }
    public void setGenislik(double genislik) {
        if (genislik<0){
            this.genislik=0;
        }else {
            this.genislik = genislik;
        }
    }
    public double getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(double yukseklik) {
        if (yukseklik<0){
            this.yukseklik=0;
        }else {
            this.yukseklik = yukseklik;
        }
    }
    public double getAlan(){
        return yukseklik*genislik;
    }
    public Wall() {
    }
    public Wall(double genislik, double yukseklik) {
        setGenislik(genislik);
        this.yukseklik = yukseklik;
    }

    }

