package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    public Customer() {
        System.out.println("Customer: Instantiated");
    }


    public void GetCustomerName(){

        System.out.println("Customer Name is Sunil");
    }
}
