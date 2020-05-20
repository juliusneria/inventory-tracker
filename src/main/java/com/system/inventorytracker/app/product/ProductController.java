package com.system.inventorytracker.app.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by juliusneria on 18/10/2017.
 */
@Controller    // This means that this class is a Controller
@RequestMapping(path="/product") // This means URL's start with /demo (after Application path)
public class ProductController {

    @GetMapping(path="/all")
    @ResponseBody
    public String getAllPatient () {
        return "get all user";
    }

    @PostMapping(path="/addPatient")
    @ResponseBody
    public String addPatient () {
        return "get all user";
    }

    @GetMapping(path="/getPatient")
    @ResponseBody
    public String getPatient () {
        return "get all user";
    }

    @PutMapping(path="/editPatient")
    @ResponseBody
    public String editPatient () {
        return "get all user";
    }

    @DeleteMapping(path="/deletePatient")
    @ResponseBody
    public String deletePatient () {
        return "get all user";
    }

}