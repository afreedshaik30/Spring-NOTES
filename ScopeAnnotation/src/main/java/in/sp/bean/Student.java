package in.sp.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")  //By default Spring make scope as singleton no need to mention
public class Student
{
    public Student()
    {
        System.out.println("Student Bean is created ---- SINGLETON SCOPE");
    }

    private String name="Afreed";
    public void displayStudent()
    {
        System.out.println("name : "+name);
    }
}
