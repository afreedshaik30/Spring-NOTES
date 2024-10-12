package in.sp.main;

import in.sp.bean.ServiceA;
import in.sp.bean.ServiceB;
import in.sp.bean.Student;
import in.sp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Main
{
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s1 = context.getBean(Student.class);
        s1.display();
//Setter
//        ServiceA beanA =context.getBean(ServiceA.class);
//        ServiceB beanB =context.getBean(ServiceB.class);
//        ServiceB.setServiceA(beanA);
//        ServiceB.executeSetterTask();


//Construtor
//        ServiceA beanA =context.getBean(ServiceA.class);
//        ServiceB beanB =new ServiceB(beanA);
//        ServiceB.executeConstrutorTask();
    }
}

