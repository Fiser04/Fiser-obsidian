package com.fiserovo.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //anotace - pridana informace kompileru
public class HomeControler {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
