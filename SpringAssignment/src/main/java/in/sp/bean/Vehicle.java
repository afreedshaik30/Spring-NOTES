package in.sp.bean;

import in.sp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleComponent")
public class Vehicle
{
    private String name="AUDI";

    public void getName()
    {
        System.out.println(name);
    }

    private  final VehicleService vehicleService;

    @Autowired   //constructor injection
    public Vehicle(VehicleService vehicleService)
    {
        this.vehicleService = vehicleService;
    }

    public VehicleService getVehicleService()
    {
        return vehicleService;
    }
}
