public class Wall {
    private double height;
    private double width;

    public Wall(double height, double width) throws LengthException {
        setHeight(height);
        setWidth(width);
    }

    public Wall() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws LengthException{
        if (height<=0) throw new LengthException("Length must be a positive number.");
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws LengthException{
        if (width<=0) throw new LengthException("Length must be a positive number.");
        this.width = width;
    }

    public double getArea(){
        return width*height;
    }
}
