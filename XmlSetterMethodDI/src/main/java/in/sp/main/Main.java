package in.sp.main;

import in.sp.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        var context = new ClassPathXmlApplicationContext("appConfig.xml");
        Student s1=(Student) context.getBean("studentID1");
        s1.display();

    }
}
