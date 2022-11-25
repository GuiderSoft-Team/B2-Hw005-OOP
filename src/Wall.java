public class Wall {
    public double width;
    public double height;
    public double area;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        if (width < 0) {
            width=0.0;
        }
        return width;
    }

    public void setWidth(double width) {
        this.width = width;

    }

        public double getHeight () {
            if (height < 0) {
                height = 0.0;

            }  return height;
        }
        public void setHeight(double height){
            this.height = height;
            }

    public double getArea(){
        return  area=width*height;
    }

    }

