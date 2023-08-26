package classAndObject;

public class studentclass {
    static class student {
        String name;
        int rno;
        double percent;
    }

    public static void main(String[] args) {
       student s1 = new student();
       s1.name = "chetan";
       s1.rno = 70;
       s1.percent = 90.2;
       System.out.println("name : "+ s1.name + "   Roll No : "+ s1.rno +"   percent : "+ s1.percent );

       student s2 = new student();
       s2.name = "akash";
       s2.rno = 71;
       s2.percent = 85.2;
       System.out.println("name : "+ s2.name + "   Roll No : "+ s2.rno +"   percent : "+ s2.percent );

        student s3 = new student();
        s3.name = "vinay";
        s3.rno = 72;
        s3.percent = 80.2;
        System.out.println("name : "+ s3.name + "   Roll No : "+ s3.rno +"   percent : "+ s3.percent );

    }
}
