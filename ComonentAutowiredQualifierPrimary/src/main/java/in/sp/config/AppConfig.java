package in.sp.config;

import in.sp.bean.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Student.class)
public class AppConfig
{

}
