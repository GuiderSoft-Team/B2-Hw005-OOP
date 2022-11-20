public class Wall {
    private double width;
    private double height;


    public Wall (){

    }
    public Wall (double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height= height;
        }
    }
    public double getArea(){
        return height*width;
    }


    public void setHeigth() {
    }
}
