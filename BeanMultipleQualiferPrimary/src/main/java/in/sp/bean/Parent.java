package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "parentComponent")
public class Parent
{
    private String name;
    private Address address;

    @PostConstruct
    public void init()
    {
        this.name="ASHA BEGUM";
    }

    @Autowired
    public void setAddress(@Qualifier("native") Address address)
    {
        this.address=address;
    }

    public void display()
    {
        System.out.println("name : "+name);
        System.out.println("address : "+address);
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("BEFORE bean is destroying ......!");
    }
}
