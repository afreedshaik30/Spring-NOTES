package in.sp.implementation;

import in.sp.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoatSpeaker implements Speakers
{
    @Override
    public void makeSound()
    {
        System.out.println(" ====> using BOAT Speaker");
    }
}
