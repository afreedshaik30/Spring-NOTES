package in.sp.main;

import in.sp.bean.Student;
import in.sp.config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1= (Student) context.getBean("student1");
        System.out.println("student-1 : "+s1);

        Student s2= (Student) context.getBean("student2");
        System.out.println("student-2 : "+s2);
    }
}
