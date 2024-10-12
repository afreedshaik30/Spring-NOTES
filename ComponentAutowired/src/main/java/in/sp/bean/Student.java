package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
    @Value("${student.name}")
    private String name;

    //@Autowired
    private Address address;

    @Autowired
    public void setAddress(Address address)
    {
        this.address=address;
    }

//    @Autowired
//    public Student(Address address)
//    {
//        this.address = address;
//    }

    public void display()
    {
        System.out.println("name : "+name);
        System.out.println("address : "+address);
    }
}
