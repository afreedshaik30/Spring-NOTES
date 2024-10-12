package in.sp.main;

import in.sp.bean.Student;
import in.sp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        var context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student s=context.getBean(Student.class);
        s.display();
    }
}

/*
      @Component("") or (value="")
      @Bean("") or (name="")

     @Qualifier("beanName") can be
      top of fileds
      top of setter method
      as a constructor parameter
      as a @bean method parameter

      @Primary
       top of @Bean Method in @Configuration
       top of @Component class

       we can specifiy the both to a single class or bean.

       @Value()
        top of fileds
        top of setter method
        as a constructor parameter

        @Autowired
          on fileds
          on setter method
          on constructor

       autowire="byName/byType/Constructor" , autowire-candidate=false for opposite class
       setter      ---> bean,    ---> class,id
                        property ---> name , value
                        byName   ---> id of injecting bean is same as filed in Source/dependent class
                                             private Address address;
                                                 id="address"
                        byType   ---> based on TYPE of bean
                                         In case of multiple beans of same type
                                         USE autowire-candidate="false" for opposite classes

       constructor ---> constructor-args ,index="0/1/2"
 */