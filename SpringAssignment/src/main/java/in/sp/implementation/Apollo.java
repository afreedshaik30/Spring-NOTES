package in.sp.implementation;

import in.sp.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component(value = "apolloBean")
public class Apollo implements Tyres
{

    @Override
    public void rotateWheel()
    {
        System.out.println(" ----> using Apollo Tyres");
    }
}
