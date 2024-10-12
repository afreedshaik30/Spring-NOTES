package in.sp.bean;

public class Address
{
    private String city;
    private int pincode;

//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setPincode(int pincode) {
//        this.pincode = pincode;
//    }

    public Address(String city, int pincode)
    {
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString()
    {
        return "city = "+city +" , pincode =  "+pincode;
    }
}
