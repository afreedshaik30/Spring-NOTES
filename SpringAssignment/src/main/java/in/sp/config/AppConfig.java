package in.sp.config;

import in.sp.bean.Person;
import in.sp.bean.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.sp.implementation","in.sp.services","in.sp.bean"})
public class AppConfig
{

}
