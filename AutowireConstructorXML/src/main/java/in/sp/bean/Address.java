package in.sp.bean;

public class Address
{
    private String city;
    private int pinCode;

    Address(String city , int pinCode)
    {
        this.city=city;
        this.pinCode=pinCode;
    }

    @Override
    public String toString() {
        return "city = "+ city + " ,  pincode = "+pinCode;
    }
}
