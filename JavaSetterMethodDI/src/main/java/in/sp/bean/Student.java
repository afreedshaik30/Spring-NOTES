package in.sp.bean;

public class Student
{
    private String name;
    private Address address;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public  void display()
    {
        System.out.println("name : "+name);
        System.out.println("address : "+address);
    }
}
