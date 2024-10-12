package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="personComponent")
public class Person
{
    private String name="Afreedi";
    public void  getName()
    {
        System.out.println(name);
    }

    private final Vehicle vehicle;
    @Autowired   //constructor injection
    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
