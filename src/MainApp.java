public class MainApp {
    public static void main(String[] args) {

        Wall wall=new Wall(5,4);
        System.out.println("Area= " +wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width= " +wall.getWidth());
        System.out.println("Height= " +wall.getHeight());
        System.out.println("Area= " +wall.getArea());

    }

}
