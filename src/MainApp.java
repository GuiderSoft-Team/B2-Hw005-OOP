public class MainApp {
    public static void main(String[] args) {
    Wall wall=new Wall(5,4);
        System.out.println("area = " +wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width="+wall.getWidth());
        System.out.println("height= "+wall.getHeight());
        System.out.println("area= "+wall.getArea());

        /*
        TEST EXAMPLE



→ OUTPUT:

area= 20.0 width= 5.0 height= 0.0 area= 0.0

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 5 methods and 2 constructors.

NOTE: You have already MainApp class and main method to test your code.
         */


    }
}
