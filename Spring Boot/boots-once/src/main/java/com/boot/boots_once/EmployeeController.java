package com.boot.boots_once;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class EmployeeController {

    @RequestMapping("go")
    public String hello() {
        return "hello Universe";
    }
}
