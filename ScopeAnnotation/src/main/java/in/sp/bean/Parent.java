package in.sp.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Parent
{
    public Parent(){
        System.out.println("Parent Bean is created ---- PROTOTYPE SCOPE");
    }

    private String name="ASHA";
    public  void displayParent()
    {
        System.out.println("name : "+name);
    }
}
