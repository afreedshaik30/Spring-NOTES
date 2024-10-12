package in.sp.bean;

public class Address
{
    private String city;
    private int pinCode;

    public void setCity(String city) {
        this.city = city;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "city = "+ city +" , pinCode = "+pinCode;
    }
}
