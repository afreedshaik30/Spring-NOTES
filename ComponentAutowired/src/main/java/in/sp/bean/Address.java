package in.sp.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address
{
    @Value("${address.city}")
    private String city;
    @Value("${address.pinCode}")
    private int pinCode;

    @Override
    public String toString()
    {
        return "city = " + city +", pinCode=" + pinCode;
    }
}
