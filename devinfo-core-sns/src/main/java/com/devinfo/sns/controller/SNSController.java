package com.devinfo.sns.controller;


import com.devinfo.sns.domain.Shops;
import com.devinfo.sns.repository.ShopsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SNSController {

    private ShopsRepository shopsRepository;

    public SNSController(ShopsRepository shopsRepository) {
        this.shopsRepository = shopsRepository;
    }


    @GetMapping("/")
    public String main(){
        return "8080 SNS Connect";
    }

    @GetMapping("/sns")
    public List<Shops> getShops(){
        return shopsRepository.findAll();
    }

}
