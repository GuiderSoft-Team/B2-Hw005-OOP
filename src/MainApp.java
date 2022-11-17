public class MainApp {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeigth(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeigth());
        System.out.println("area= " + wall.getArea());
    }
}