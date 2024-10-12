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
        return new Address("Vuyyuru",521165);
    }

    @Bean("asha")
    public Student student()
    {
        return new Student("asha",address());
    }


//    @Bean("asha")
//    public Student student(Address address)
//    {
//        Student stu=new Student("asha",address);
//        return stu;
//    }
}
