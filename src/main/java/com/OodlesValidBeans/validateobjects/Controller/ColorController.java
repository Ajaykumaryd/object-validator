package com.OodlesValidBeans.validateobjects.Controller;

import com.OodlesValidBeans.validateobjects.Domains.Colors;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/color")
public class ColorController {

    @GetMapping
    public Colors getColor(@RequestBody @Valid Colors color){
        Colors colorObj = new Colors();
        colorObj.setColor(color.getColor());
        if(color.getColor().equals("RED")){
            colorObj.setCode("R100");
        }else if(color.getColor().equals("GREEN")){
            colorObj.setCode("G200");
        }else{
            colorObj.setCode("B300");
        }
        return colorObj;

    }










}
