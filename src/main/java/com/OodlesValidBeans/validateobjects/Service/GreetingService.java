package com.OodlesValidBeans.validateobjects.Service;

import com.OodlesValidBeans.validateobjects.Domains.Greeting;

import com.OodlesValidBeans.validateobjects.ObjectValidator;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final ObjectValidator validator;
    public String save(Greeting greeting){
            var violations = validator.validate(greeting);
            if(!violations.isEmpty()){
                  return String.join("|",violations);
            }
        return "Greeting Message is "+greeting.getMessage()
                +"from "+greeting.getFrom()
                +"to "+greeting.getTo();
//                +"check if supported"+greeting.isUnsupported();
    }

}
