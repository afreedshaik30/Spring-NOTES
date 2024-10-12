package in.sp.bean;

import org.springframework.stereotype.Component;

@Component
public class ServiceB
{
    private ServiceA serviceA;

    public ServiceB(ServiceA serviceA)
    {
        this.serviceA=serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void executeConstrutorTask()
    {
        this.serviceA.performConstrutorTask();
    }

    public  void executeSetterTask()
    {
        this.serviceA.performSetterTask();
    }
}
