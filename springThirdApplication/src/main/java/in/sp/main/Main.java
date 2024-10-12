package in.sp.main;

import in.sp.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("appConfig.xml");
        Student student=context.getBean(Student.class);
        System.out.println(student);

    }
}
