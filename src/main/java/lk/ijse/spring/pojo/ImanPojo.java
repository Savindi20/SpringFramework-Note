package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class ImanPojo {
    public ImanPojo() {
        System.out.println("Iman POJO");
    }


    public void imanDance(){
        System.out.println("la la la");
    }
}
