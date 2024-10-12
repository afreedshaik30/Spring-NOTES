package in.sp.config;

import in.sp.bean.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "in.sp.bean")
@PropertySource("classpath:application.properties")
public class AppConfig
{

//    @Bean
//    public Subjects subjects()
//    {
//        Subjects sub=new Subjects();
//           List<String> subjects=new ArrayList<>();
//           subjects.add("java" );
//           subjects.add("reactJS");
//           subjects.add("springBoot");
//        sub.setSubjects(subjects);
//      return sub;
//    }

    @Bean
    public Subjects subjects()
    {
        List<String> subjects = Arrays.asList("telugu", "hindi", "english");
        Subjects sub=new Subjects(subjects);
        return sub;
    }
}
