public class MainApp {
    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);

        System.out.println("Alan= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("Genişlik= " + wall.getWidth());

        System.out.println("Yükseklik= " + wall.getHeight());

        System.out.println("Alan= " + wall.getArea());

    }
}
