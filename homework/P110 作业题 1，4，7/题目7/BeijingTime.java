package homework;

public class BeijingTime
{
    int hour;
    int minute;
    int second;

    public BeijingTime(int h, int m, int s)
    {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    int printInf()
    {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
        return 0;
    }
}
