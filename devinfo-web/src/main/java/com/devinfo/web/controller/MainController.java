package com.devinfo.web.controller;

import com.devinfo.sns.domain.SNS;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String main(){
        // API include test
        SNS sns = SNS.builder()
                .name("juyoung")
                .title("제목")
                .content("content")
                .build();

        System.out.println(sns.getContent() + " / " + sns.getTitle() + "/ " + sns.getName());
        return "main";
    }
}
