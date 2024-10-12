package in.sp.main;

import in.sp.bean.Student;
import in.sp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main
{
    public static void main(String[] args)
    {
        var context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student s=context.getBean(Student.class);
        s.display();
    }
}
