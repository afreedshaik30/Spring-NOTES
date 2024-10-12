package in.sp.main;

import in.sp.bean.Student;
import in.sp.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student student=context.getBean(Student.class);
        System.out.println(student);
    }
}
