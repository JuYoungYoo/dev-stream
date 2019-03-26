package com.devinfo.sns.controller;


import com.devinfo.sns.domain.Shops;
import com.devinfo.sns.dto.ShopsRequestDto;
import com.devinfo.sns.repository.ShopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SNSController {

    private ShopRepository shopRepository;

    public SNSController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @GetMapping("/sns")
    public List<Shops> getShops(){
        return shopRepository.findAll();
    }

}
