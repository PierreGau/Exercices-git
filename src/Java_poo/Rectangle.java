package Java_poo;

public class Rectangle
{
    private double width;
    private double height;

    //Attention ne pas mettre Perimeter et area en variables, ça brise la règle du 1 fonction, 1 utilité
    private double Perimeter;
    private double area;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        Perimeter = (width + height) * 2;
        area = width * height;
    }

    public boolean equals(Rectangle rect)
    {
        if(rect == null)
            return false;

        return height == rect.height && width == rect.getWidth();
    }
    public Rectangle(Rectangle rectangle) {
        width = rectangle.width;
        height = rectangle.height;

        Perimeter = (width + height) * 2;
        area = width * height;
    }

    public Rectangle() {
        this.width = 0;
        this.height = 0;
        Perimeter = 0;
        area =0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        Perimeter = (width + height) * 2;
        area = width * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        Perimeter = (width + height) * 2;
        area = width * height;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public double getArea() {
        return area;
    }


}
