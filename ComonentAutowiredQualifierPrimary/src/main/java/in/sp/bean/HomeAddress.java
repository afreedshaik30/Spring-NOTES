package in.sp.bean;

import org.springframework.stereotype.Component;

@Component("homeAddress")  //bean name for @qualifier  if @Bean method name or @Bean(name="")
public class HomeAddress implements Address
{
    @Override
    public String getAddress()
    {
      return "Vuyyuru";
    }
}
