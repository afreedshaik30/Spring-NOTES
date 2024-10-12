package in.sp.main;

import in.sp.bean.Parent;
import in.sp.bean.Student;
import in.sp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        var context=new AnnotationConfigApplicationContext(AppConfig.class);

        Student student=context.getBean("studentComponent",Student.class);
        student.setName("Afreed");
        System.out.println(student.getName());
        System.out.println(student.getAddress());

        System.out.println(" ----------------------------------- ");

        Parent parent=context.getBean("parentComponent",Parent.class);
        parent.display();

        context.close(); //to trigger or invoke  @PreDestroy method in Parent Component

        /*
          To use @PostConstruct or @PreDestroy we need a dependency
             ----> javax.annotation-api
         */
    }
}
