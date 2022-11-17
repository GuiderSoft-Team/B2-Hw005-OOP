public class MainApp {
    public static void main(String[] args) {
        Wall wall;
        try {
            wall = new Wall(5,4);
            System.out.println("Area = " + wall.getArea());
            System.out.println("Width = " + wall.getWidth());
            wall.setHeight(-1.5);
            System.out.println("Height = " + wall.getHeight());
            System.out.println("Area = " + wall.getArea());
        } catch (LengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
