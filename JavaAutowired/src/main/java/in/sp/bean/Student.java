package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student
{
      private String name;
      private int rno;
      //@Autowired
      private Address address;

//      public void setName(String name)
//      {
//        this.name = name;
//      }
//
//      public void setRno(int rno)
//      {
//        this.rno = rno;
//      }
//
//      //@Autowired
//      public void setAddress(Address address)
//      {
//        this.address = address;
//      }

          @Autowired
          public Student(String name, int rno,Address address)
          {
              this.name=name;
              this.rno=rno;
              this.address=address;
          }


    public void display()
    {
        System.out.println("name: "+name);
        System.out.println("rno: "+rno);
        System.out.println("address: "+address);
    }
}
