package service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.Award;
import model.AwardCategoryEnum;
import model.AwardTypeEnum;
import model.Team;

public class TeamService {
      public Team createTeam(String teamName, String nickName, String colors, String coach, String president,
                           String stadiumName, BigDecimal budget, String currency, String country){

        Team team = new Team();
        team.setName(teamName);
        team.setNickName(nickName);
        team.setCoach(coach);
        team.setBudget(budget);
        team.setColors(colors);
        team.setPresident(president);
        team.setStadiumName(stadiumName);
        team.setCurrency(currency);
        team.setCountry(country);

        return team;
    }

    public void addAwardToTeam(Team team, String name, int year, AwardTypeEnum awardTypeEnum, AwardCategoryEnum awardCategoryEnum){
        Award award = new Award();
        award.setName(name);
        award.setYear(year);
        award.setAwardCategory(awardCategoryEnum);
        award.setAwardType(awardTypeEnum);

        if(team.getAwards() != null){
            team.getAwards().add(award);
        } else {
            List<Award> awardList = new ArrayList<>();
            awardList.add(award);
            team.setAwards(awardList);
        }
     }
}
