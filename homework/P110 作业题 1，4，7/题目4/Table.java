package homework;

public class Table
{
    String tableName;
    double tableWeight;
    double breadth;
    double length;
    double height;

    Table(String Name, double Weight, double tableBreadth, double tableLength, double tableHeight)
    {
        this.tableName = new String(Name);
        this.tableWeight = Weight;
        this.breadth = tableBreadth;
        this.length = tableLength;
        this.height = tableHeight;
    }

    int printInf()
    {
        System.out.println("桌子名:" + this.tableName);
        System.out.println("重量:" + this.tableWeight);
        System.out.println("宽:" + this.breadth);
        System.out.println("长:" + this.length);
        System.out.println("高:" + this.height);
        System.out.println();
        return 0;
    }
}
