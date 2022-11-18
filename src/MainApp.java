import WallQuestion.Wall;

public class MainApp {
    public static void main(String[] args) {

        Wall walli=new Wall(5,4);
        System.out.println("WallArea = "+walli.getArea());
        walli.setHeight(-5);
        System.out.println("Width = "+walli.getWidth());
        System.out.println("Height = "+walli.getHeight());
        System.out.println("WallArea = "+walli.getArea());


    }
}
