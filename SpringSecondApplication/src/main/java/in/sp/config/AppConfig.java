package in.sp.config;

import in.sp.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    Student student1()
    {
        Student std=new Student();
        std.setRollno(1);
        std.setName("Devara");
        std.setBranch("IT");
        return std;
    }

    @Bean
    Student student2()
    {
        Student s=new Student();
        s.setRollno(2);
        s.setName("Pushpa2");
        s.setName("MECH");
        return s;
    }
}