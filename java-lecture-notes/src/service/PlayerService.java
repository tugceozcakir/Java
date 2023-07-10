package service;

import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Team;

public class PlayerService {
 

    public void addTeam(Player player, Team team) {
        if (player.getTeamList() != null) {
            player.getTeamList().add(team);
        } else {
            List<Team> teamList = new ArrayList();
            teamList.add(team);
            player.setTeamList(teamList);
        }
    }
}

