package in.sp.bean;

public class Address
{
    private String city;
    private int pincode;

    Address(String city, int pincode)
    {
        this.city=city;
        this.pincode=pincode;
    }

    public  String toString()
    {
        return "city = "+city +" , pincode = "+pincode;
    }
}
