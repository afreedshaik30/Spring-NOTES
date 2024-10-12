package in.sp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Appconfig.class);
        Student stu = context.getBean(Student.class);
        System.out.println(stu);
    }
}
