package in.sp.config;

import in.sp.bean.Address;
import in.sp.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
//    @Bean
//    public Address address()
//    {
//        Address addr=new Address();
//        addr.setCity("Vijayawada");
//        addr.setPincode(2468);
//        return addr;
//    }
//
//    @Bean
//    public Student student()
//    {
//        Student stu=new Student();
//        stu.setName("Afreedi");
//        stu.setRno(22);
//        //stu.setAddress(address()); //manual setter DI
//        return stu;
//    }

    @Bean
    public Address address()
    {
        return new Address("Andhra--Pradesh",1357);
    }

    @Bean Student student(Address addr)
    {
        return new Student("DIET" , 2002, addr);
    }
}
