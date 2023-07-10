import java.math.BigDecimal;
import java.util.ArrayList;

import model.AwardCategoryEnum;
import model.AwardTypeEnum;
import model.Player;
import model.Team;
import service.TeamService;
import service.PlayerService;


public class App {
    public static void main(String[] args) throws Exception {
        TeamService teamService = new TeamService();

        Team team = teamService.createTeam("Fenerbahçe", "FB","yellow-red","Okan Buruk",
                "Dursun Özbek", "Nef Arena", new BigDecimal(1000000), "USD", "Türkiye");

        teamService.addAwardToTeam(team, "Champions Cup", 2023, AwardTypeEnum.CUP, AwardCategoryEnum.INTERNATIONAL);
        teamService.addAwardToTeam(team, "League Cup", 2023, AwardTypeEnum.CUP, AwardCategoryEnum.NATIONAL);

        //System.out.println(team.toString());

        PlayerService playerService = new PlayerService();

        Player player = new Player("Arda", "Guler", 10, "xx", 2003, new ArrayList<>(), new ArrayList<>());

        Player newPlayer = playerService.createPlayer("Cristiano", "Ronaldo", 10, "djnk", 1990);
        System.out.println(newPlayer);

        playerService.addTeam(newPlayer, team);
        System.out.println(newPlayer);
    }
}

