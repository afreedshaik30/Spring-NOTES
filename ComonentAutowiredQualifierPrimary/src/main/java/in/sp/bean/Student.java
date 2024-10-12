package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import javax.annotation.PostConstruct;

@Component
public class Student
{
    private String name;
    private Address address;

//    @PostConstruct
//    public void init()
//    {
//        this.name="ASHA BEGUM";
//    }

    @Autowired
    public Student(@Value("ASHA") String name , @Qualifier("homeAddress") Address address)
    {
         this.name=name;
         this.address=address;
    }

    public  void display()
    {
        System.out.println("name : "+name);
        System.out.println("address : "+address.getAddress());
    }
}
