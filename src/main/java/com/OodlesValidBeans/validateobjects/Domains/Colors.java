package com.OodlesValidBeans.validateobjects.Domains;

import com.OodlesValidBeans.validateobjects.Validators.ColorValidation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Colors {

   @ColorValidation(message = "Color can't be be these")
   private String color;

   private String code;

}
