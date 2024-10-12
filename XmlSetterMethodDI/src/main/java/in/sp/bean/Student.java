package in.sp.bean;

public class Student 
{
    private int sRno;
    private String sName;
    private Address address;

    public void setsRno(int sRno) 
    {
        this.sRno = sRno;
    }

    public void setsName(String sName) 
    {
        this.sName = sName;
    }

    public void setAddress(Address address) 
    {
        this.address = address;
    }
    
    public void display()
    {
        System.out.println("sName : "+sName);
        System.out.println("sRno : "+sRno);
        System.out.println("address : "+address);
    }
}
