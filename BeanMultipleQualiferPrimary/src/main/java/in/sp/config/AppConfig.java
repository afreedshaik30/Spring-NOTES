package in.sp.config;

import in.sp.bean.Address;
import in.sp.bean.Parent;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages= "in.sp.bean")
public class AppConfig
{
     @Bean(name="home")
     @Primary
     public Address homeAddress()
     {
         Address homeAddress=new Address();
         homeAddress.setCity("VUYYURU");
         homeAddress.setPinCode(123);
         return homeAddress;
     }

    @Bean(name="work")
    public Address workAddress()
    {
        Address workAddress=new Address();
        workAddress.setCity("Hyderabad");
        workAddress.setPinCode(456);
        return workAddress;
    }

    @Bean(name = "native")
    public Address nativeAddress() {
        Address nativeAddress=new Address();
        nativeAddress.setCity("SAUDI");
        nativeAddress.setPinCode(789);
        return nativeAddress;
    }
}
