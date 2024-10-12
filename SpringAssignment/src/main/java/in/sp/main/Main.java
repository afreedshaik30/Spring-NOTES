package in.sp.main;

import in.sp.bean.Person;
import in.sp.bean.Vehicle;
import in.sp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
       var context=new AnnotationConfigApplicationContext(AppConfig.class);
        Person person=context.getBean("personComponent", Person.class);
        person.getName();
        person.getVehicle().getVehicleService().moveVehicle();
        person.getVehicle().getVehicleService().playMusic();

        Vehicle vehicle=context.getBean("vehicleComponent", Vehicle.class);
        vehicle.getName();
        vehicle.getVehicleService().moveVehicle();
        vehicle.getVehicleService().playMusic();
    }
}
