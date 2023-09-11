package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.ImanPojo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();


        ImanPojo iman1 = ctx.getBean(ImanPojo.class);
        ImanPojo iman2 = ctx.getBean(ImanPojo.class);
        System.out.println(iman1);
        System.out.println(iman2);

        iman1.imanDance();
    }
}
