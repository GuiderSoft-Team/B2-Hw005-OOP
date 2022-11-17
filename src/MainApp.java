public class MainApp {
    public static void main(String[] args) {

        Wall wall=new Wall(5,4);
        System.out.println("area="+wall.getArea());
        System.out.println("width="+wall.getWidth(6));
        System.out.println("height="+wall.getHeight(7));
        System.out.println("area="+wall.getArea());
    }
}
