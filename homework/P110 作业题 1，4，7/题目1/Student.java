package homework;

public class Student
{
    int stuNum;
    String name;
    int age;
    double score;
    String school;

    public Student(int num, String stuName, int stuAge, double stuScore, String stuSchool)
    {
        this.stuNum = num;
        this.name = new String(stuName);
        this.age = stuAge;
        this.score = stuScore;
        this.school = new String(stuSchool);
    }

    int porintInf()
    {
        System.out.println("学号:" + this.stuNum);
        System.out.println("姓名:" + this.name);
        System.out.println("年龄:" + this.age);
        System.out.println("成绩:" + this.score);
        System.out.println("学校:" + this.school);
        System.out.println();
        return 0;
    }

    double getScore()
    {
        return this.score;
    }

}
