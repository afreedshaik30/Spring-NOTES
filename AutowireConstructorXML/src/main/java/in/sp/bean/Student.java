package in.sp.bean;

public class Student
{
    private String name;
    private Address address;

    Student(String name, Address address)
    {
        this.name=name;
        this.address=address;
    }

    public void display()
    {
        System.out.println("name : "+name);
        System.out.println("address : "+address);
    }
}
