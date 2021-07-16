package me.kodysimpson.inversionofcontrolspring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component(value = "kitchenService") // Mark as bean
//Spring default name is in camel case kitchenService
public class KitchenService {

    public void cookFood() {
        System.out.println("Sss... *food cooking*");
    }
}
