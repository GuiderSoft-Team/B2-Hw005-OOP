


public class Wall {

    private double width;
    private double heigth;

    public Wall() {
    }

    public Wall(double width, double heigth) {
        if (heigth>0)
            this.heigth=heigth;
        this.width = width;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {

        if (heigth > 0) {
            this.heigth=heigth;

        }else {
            this.heigth=0.0;
        }

    }
    public double getArea () {

        return width * heigth;
    }
}
