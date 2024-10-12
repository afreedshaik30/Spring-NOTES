package in.sp.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WorkAddress  implements Address
{
    @Override
    public String getAddress()
    {
        return "Hyderabad";
    }
}
