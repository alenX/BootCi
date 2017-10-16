package org.wangss.bootci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wangss.bootci.domain.Ci;
import org.wangss.bootci.service.ICiService;

@RestController
@RequestMapping("ci")
public class CiController {

    @RequestMapping("hi")
    public String hello(){
        return "hi";
    }

    @Autowired
    private ICiService ciService;
    @GetMapping("get/{id}")
    public Ci findCiById(@PathVariable(value = "id") Long id){
        return ciService.findCiById(id);
    }
}
