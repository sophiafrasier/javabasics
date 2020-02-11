public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getDiagonal(){
        return Math.sqrt((Math.pow(length, 2))+(Math.pow(width, 2)));
    }

    public String isSquare(){
        if(length == width){
            return "This rectangle is a square!";
        }else{
            return "This rectangle is not a square.";
        }
    }
}
