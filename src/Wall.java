public class Wall {

    private double width;
    private double height;


    public Wall() {
        this(5, 4);
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth(int i) {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight(int i) {
        return height;
    }

    public void setHeight(double v) {
        this.height = height;
    }



    public double getArea() {return height*width;}

    @Override
    public String toString() {
        return String.format("Wall:[%s %d x %d x %d]");
    }


}




