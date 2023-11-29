package com.OodlesValidBeans.validateobjects.Service;

import com.OodlesValidBeans.validateobjects.Domains.Greeting;

import com.OodlesValidBeans.validateobjects.Validators.ObjectValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
