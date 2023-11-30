package com.OodlesValidBeans.validateobjects.Service;

import com.OodlesValidBeans.validateobjects.Domains.FootballClub;
import com.OodlesValidBeans.validateobjects.Repository.FootballClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FootballClubService {

    @Autowired
    FootballClubRepository footballClubRepository;


    public String add(FootballClub footballClub) {
        String randomClubId = UUID.randomUUID().toString();
        FootballClub footballClub1=new FootballClub();
        footballClub1.setId(randomClubId);
        footballClub1.setName(footballClub.getName());
        footballClub1.setStadium(footballClub.getStadium());
        footballClub1.setAssociation(footballClub.getAssociation());
        footballClubRepository.save(footballClub1);
        return "football club added";
    }

}
