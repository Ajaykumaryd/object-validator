package com.OodlesValidBeans.validateobjects.Repository;

import com.OodlesValidBeans.validateobjects.Domains.FootballClub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballClubRepository extends JpaRepository<FootballClub,Integer> {
}
