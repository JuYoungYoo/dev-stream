package com.devinfo.video.controller;


import com.devinfo.video.domain.Shops;
import com.devinfo.video.repository.ShopsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private ShopsRepository shopsRepository;

    public DemoController(ShopsRepository shopsRepository) {
        this.shopsRepository = shopsRepository;
    }

    @GetMapping("/")
    public String main(){
        return "Video Connect";
    }

    @GetMapping("/youtube")
    public String getShops(){
        try{
            shopsRepository.findAll();
            return "Video DB connect";
        }catch (Exception e){
            e.printStackTrace();
            return "Video DB fail";
        }
    }

}
