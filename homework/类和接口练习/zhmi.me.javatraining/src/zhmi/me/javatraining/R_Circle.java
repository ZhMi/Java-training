package zhmi.me.javatraining;

public class R_Circle extends Circle implements IRange
{
	Point point = new Point();

	public R_Circle(int i, Point p)
	{
		// TODO Auto-generated constructor stub
		this.point = p;
		this.setRadius(i);
	}

	public R_Circle()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean contains(Point p)
	{
		// TODO Auto-generated method stub
		double distance = this.point.distance(p);
		if(distance <= this.getRadius())
		{
			return true;
		}
		return false;
	}
}
