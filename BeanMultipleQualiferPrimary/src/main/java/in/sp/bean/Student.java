package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "studentComponent")
public class Student
{
    private String name;
    private Address address;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    @Autowired
    public void setAddress(@Qualifier("work") Address address)
    {
        this.address=address;
    }

    public Address getAddress()
    {
        return address;
    }

}
