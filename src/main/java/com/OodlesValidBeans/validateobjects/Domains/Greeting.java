package com.OodlesValidBeans.validateobjects.Domains;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NonNull;

@Data
public class Greeting {
//
//    @NotNull
//    @NotEmpty
    @NotBlank(message = "Message can't be blank")
    private String message;

//    @NotNull
//    @NotEmpty
    @NotBlank(message = "from can't be blank")
    private String from;

    @NotNull(message = "to can't be blank")
    @NotEmpty(message = "to can't be blank")
    private String to;

//    @AssertTrue(message )
//    boolean isUnsupported;
}
