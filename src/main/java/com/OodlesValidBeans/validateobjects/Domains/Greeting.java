package com.OodlesValidBeans.validateobjects.Domains;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
public class Greeting {

    @NotNull
    @NotEmpty
   private String message;

    @NotNull
    @NotEmpty
    private String from;

    @NotNull
    @NotEmpty
    private String to;

//    @AssertTrue(message )
//    boolean isUnsupported;
}
