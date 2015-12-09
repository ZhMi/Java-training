package homework;

public class Test
{
    public static void main(String[] agrs)
    {
        Student student1 = new Student(116, "张三", 20, 90.5, "xupt");
        student1.porintInf();
        Student student2 = new Student(106, "李四", 17, 70.5, "xupt");
        student2.porintInf();
        double aveScore = (student1.getScore() + student2.getScore()) / 2;
        System.out.println("平均成绩:" + aveScore);
    }
}
