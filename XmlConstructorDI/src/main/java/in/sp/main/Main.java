package in.sp.main;

import in.sp.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        var context=new ClassPathXmlApplicationContext("appConfig.xml");
        Student s1=context.getBean("studentID", Student.class);
        s1.display();
    }
}
