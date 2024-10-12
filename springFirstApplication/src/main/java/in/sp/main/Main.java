package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("appConfig.xml");

        Student s1= (Student) context.getBean("studentId1");
        System.out.println("s1 : "+s1);

        Student s2= (Student) context.getBean("studentId2");
        System.out.println("s2 : "+s2);
    }
}
