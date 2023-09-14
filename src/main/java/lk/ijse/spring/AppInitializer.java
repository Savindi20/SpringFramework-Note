package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.Customer;
import lk.ijse.spring.pojo.DBConnection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //Context Invocation
        Customer c1 = ctx.getBean(Customer.class);
        Customer c2 = ctx.getBean(Customer.class);
        System.out.println(c1);
        System.out.println(c2);
        c1.getCustomerName();

        DBConnection db1 = ctx.getBean(DBConnection.class);
        DBConnection db2 = ctx.getBean(DBConnection.class);
        System.out.println(db1);
        System.out.println(db2);

        BasicDataSource bean1 = ctx.getBean(BasicDataSource.class);
        BasicDataSource bean2 = ctx.getBean(BasicDataSource.class);
        System.out.println(bean1);
        System.out.println(bean2);

        ctx.close();
    }
}
