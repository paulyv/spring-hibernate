package com.pauli.varelius.spring.demo.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class terveController {

    @RequestMapping("/hei")
    @ResponseBody
    public String tervehdi(@RequestParam String nimi) {
        return "Hei " + nimi + ", mitä kuuluu?";
    }
}
