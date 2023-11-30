package com.OodlesValidBeans.validateobjects.Service;

import com.OodlesValidBeans.validateobjects.Domains.Colors;
import com.OodlesValidBeans.validateobjects.Validators.ColorValidator;
import com.OodlesValidBeans.validateobjects.Validators.ObjectValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ColorService {


    public Colors getColor(Colors color) {
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
