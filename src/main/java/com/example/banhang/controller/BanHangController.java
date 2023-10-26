package com.example.banhang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanHangController {
    @GetMapping("index")
    public String index() {
        return "Cuong test";
    }
}
