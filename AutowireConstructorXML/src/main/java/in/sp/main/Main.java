package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.bean.Student;
public class Main
{
    public static void main(String[] args)
    {
        var context = new ClassPathXmlApplicationContext("appConfig.xml");
        Student s=context.getBean(Student.class);
        s.display();
    }
}
