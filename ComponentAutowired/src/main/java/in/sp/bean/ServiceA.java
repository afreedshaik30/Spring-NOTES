package in.sp.bean;

import org.springframework.stereotype.Component;

@Component
public class ServiceA
{
    public  void performSetterTask()
    {
        System.out.println("Using Setter method");
    }

    public void performConstrutorTask()
    {
        System.out.println("Using Construtor method");
    }
}
