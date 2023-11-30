package com.OodlesValidBeans.validateobjects.Controller;

import com.OodlesValidBeans.validateobjects.Domains.Colors;
import com.OodlesValidBeans.validateobjects.Service.ColorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/color")
public class ColorController {

    @Autowired
    private ColorService colorService;


    @GetMapping
    public Colors getColor(@RequestBody @Valid Colors color){
        return colorService.getColor(color);
    }












}
