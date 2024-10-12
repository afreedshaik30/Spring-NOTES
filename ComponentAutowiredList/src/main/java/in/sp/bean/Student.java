package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Student
{
    @Value("${student.name}")
    private String name;

    //@Autowired   //filed injection
    private Address address;

//    @Autowired   //setter injection
//    public void setAddress(Address address)
//    {
//        this.address = address;
//    }

    @Autowired   //constructor injection
    public Student(Address address)
    {
        this.address=address;
    }

    private List<Subjects> subjects;
    @Autowired
    public void setSubjects(List<Subjects> subjects)
    {
        this.subjects = subjects;
    }

    public  void display()
    {
        System.out.println("name : "+name);
        System.out.println("address : "+address);
        System.out.println("subjects : "+subjects);
    }

}
