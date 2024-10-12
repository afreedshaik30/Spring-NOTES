package in.sp.main;

import in.sp.bean.Parent;
import in.sp.bean.Student;
import in.sp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1=context.getBean(Student.class);
        Student s2=context.getBean(Student.class);
        s1.displayStudent();
        s2.displayStudent();
        System.out.println("-------> "+(s1==s2)); //SAME reference location
        //same bean instance is returns everytime
        //Constructor called once

        System.out.println(" ----------------------------- ");

        Parent p1=context.getBean(Parent.class);
        Parent p2=context.getBean(Parent.class);
        p1.displayParent();
        p2.displayParent();
        System.out.println("-------> "+(p1==p2)); //Different reference location
        //new bean instance is returns everytime
        //Constructor called more than once


    }
}
