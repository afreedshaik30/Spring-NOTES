package in.sp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@PropertySource("application.properties")
public class Student {
    @Value("${student.description:Recent CSE graduate, java dev}")
    private String stuDescription;

    @Value("${student.name}")
    private String stuName;

    @Value("${student.rno}")
    private int stuRno;

    @Value("${student.languages}")
    private String[] stuLang;

    @Value("#{7+7}")
    private int result;

    @Override
    public String toString() {
        return "Student{" +
                "stuDescription='" + stuDescription + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuRno=" + stuRno +
                ", stuLang=" + Arrays.toString(stuLang) +
                ", result=" + result +
                '}';
    }
}
