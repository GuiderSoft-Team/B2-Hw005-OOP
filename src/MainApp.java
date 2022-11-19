public class MainApp {
    public static void main(String[] args) {
        Wall duvar =new Wall(5,4);
        System.out.println("Alan : "+duvar.getAlan());
        duvar.setYukseklik(-1.5);
        System.out.println("Genişlik : "+duvar.getGenislik());
        System.out.println("Yükseklik : "+duvar.getYukseklik());
        System.out.println("Alan :  " +duvar.getAlan());

    }
}
