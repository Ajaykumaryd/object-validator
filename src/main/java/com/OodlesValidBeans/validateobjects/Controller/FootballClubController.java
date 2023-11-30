package com.OodlesValidBeans.validateobjects.Controller;

import com.OodlesValidBeans.validateobjects.Domains.FootballClub;
import com.OodlesValidBeans.validateobjects.Service.FootballClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
@RequestMapping("/club")
public class FootballClubController {

         @Autowired
         private FootballClubService footballClubService;
         @PostMapping
         public String add(@RequestBody FootballClub footballClub){
         String res=footballClubService.add(footballClub);
         return res;


    }

}
