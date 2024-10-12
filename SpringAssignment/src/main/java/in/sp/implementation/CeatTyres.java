package in.sp.implementation;

import in.sp.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CeatTyres implements Tyres
{
    @Override
    public void rotateWheel()
    {
        System.out.println("====> using CEAT tyres");
    }
}
