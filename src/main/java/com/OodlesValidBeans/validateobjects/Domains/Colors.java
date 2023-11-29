package com.OodlesValidBeans.validateobjects.Domains;

import com.OodlesValidBeans.validateobjects.Validators.ColorValidation;
import lombok.Data;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Colors {

   @ColorValidation()
   private String color;
   private String code;

}
