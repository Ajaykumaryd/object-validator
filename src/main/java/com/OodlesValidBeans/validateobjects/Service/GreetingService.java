package com.OodlesValidBeans.validateobjects.Service;

import com.OodlesValidBeans.validateobjects.Domains.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String save(Greeting greeting) {
        return "Greeting Message is "+greeting.getMessage()
                +"from "+greeting.getFrom()
                +"to "+greeting.getTo();
//                +"check if supported"+greeting.isUnsupported();
    }
}
