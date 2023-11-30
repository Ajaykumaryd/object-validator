package com.OodlesValidBeans.validateobjects.Domains;

import com.OodlesValidBeans.validateobjects.Validators.FootballClubValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "football_club")
public class FootballClub {

    @Id                                      //dehradun football club     // dehradun club football
    private String id;

     @Pattern(regexp = ".*football.*[a-zA-Z0-9]+.*",message = "Name must include 'football' and consist of alphanumeric characters")
//     @Size(max = 20,min = 1)
     private String name;

     private String stadium;

     @FootballClubValidation(message = "Football club can only be associated either in FIFA or UEFA")
     private String association;

}
