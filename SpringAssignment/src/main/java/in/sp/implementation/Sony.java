package in.sp.implementation;

import in.sp.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component(value = "sonyBean")
public class Sony implements Speakers
{

    @Override
    public void makeSound()
    {
        System.out.println(" ----> using SONY Speakers");
    }
}
