package in.sp.services;

import in.sp.interfaces.Speakers;
import in.sp.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService
{
    @Autowired //field injection
    @Qualifier("sonyBean")
    private Speakers speakers;

    public void playMusic()
    {
        speakers.makeSound();
    }

    private Tyres tyres;

    @Autowired  //setter injection
    public void setTyres(@Qualifier("apolloBean") Tyres tyres) {
        this.tyres = tyres;
    }

    public  void moveVehicle()
    {
        tyres.rotateWheel();
    }
}
