package zhmi.me.javatraining;

public class Circle
{
    private double radius;
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()
    {
        return Math.PI*2*radius;
    }
}
