public class MainApp {
    public static void main(String[] args) {
        Wall wall=new Wall(5,4);
        System.out.println("Wall Area: "+wall.getArea());
        wall.setYukseklik(-1.5);
        System.out.println("Width: "+wall.getGenislik());
        System.out.println("Height: "+wall.getYukseklik());
        System.out.println("Wall Area: "+wall.getArea());

    }
}
