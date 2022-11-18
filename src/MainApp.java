public class MainApp {
    public static void main(String[] args) {
        Wall wall1=new Wall(5,4);
        System.out.println("area= " + wall1.getArea());
        wall1.setHeight(-1.5);
        System.out.println("Width = " + wall1.getWidth());
        System.out.println("Height = " + wall1.getHeight());
        System.out.println("Area = " + wall1.getArea());
    }
}
