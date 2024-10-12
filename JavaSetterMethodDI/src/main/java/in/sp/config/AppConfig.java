package in.sp.config;

import in.sp.bean.Address;
import in.sp.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Address address()
    {
        Address addr=new Address();
        addr.setCity("INDIA");
        addr.setPincode(2345);
        return addr;
    }

    @Bean("virat")
    public Student student()
    // public Student student(Address address)
    {
        Student stu=new Student();
        stu.setName("Virat");

        // wiring using method call (address() as argument)
        stu.setAddress(address());  //injecting address() into Student setter method

        //wiring using method parameter (bean as argument)
        //stu.setAddress(address);  //injecting address bean into Student setter method
        return stu;
    }


}
