package zhmi.me.javatraining;

public class Rectangle
{
    private double width,height;
    
    public void setWidth(double w)
    {
        width=w;
    }
    public double getWidth()
    {
        return width;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(width+height);
    }
}
