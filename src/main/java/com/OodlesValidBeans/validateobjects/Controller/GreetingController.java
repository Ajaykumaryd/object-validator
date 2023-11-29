package com.OodlesValidBeans.validateobjects.Controller;

import com.OodlesValidBeans.validateobjects.Domains.Greeting;
import com.OodlesValidBeans.validateobjects.Service.GreetingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/greetings")
@RequiredArgsConstructor
public class GreetingController {


    private final GreetingService greetingService;

    @PostMapping
    public ResponseEntity<String>greetMessage(
            @RequestBody Greeting greeting
            ){
//         if(bindingResult.hasErrors()){
//             return ResponseEntity.
//                    badRequest()
//                     .body(
//                             bindingResult.getAllErrors()
//                                     .stream()
//                                     .map(ObjectError::getDefaultMessage)
//                                     .collect(Collectors.joining()));
//
//         }
        String res=greetingService.save(greeting);
        return ResponseEntity.accepted().body(res);
    }
}
