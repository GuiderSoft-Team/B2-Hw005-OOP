public class MainApp {
    public static void main(String[] args) {

        Wall wall = new Wall(9,7);

        System.out.println("Area :"+wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth(6));

        System.out.println("height= " + wall.getHeight(7));

        System.out.println("Area := " + wall.getArea());





    }
}
