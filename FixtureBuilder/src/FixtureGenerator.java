import java.util.ArrayList;
import java.util.Collections;

public class FixtureGenerator {
    private ArrayList<String> teams;

    public FixtureGenerator(ArrayList<String> teams) {
        this.teams = teams;
        if (teams.size() % 2 != 0) {
            this.teams.add("Bay");
        }
    }

    public void generateFixture() {
        int teamCount = teams.size();
        int rounds = teamCount - 1;

        for (int round = 1; round <= rounds * 2; round++) {
            System.out.println("Round " + round);
            for (int i = 0; i < teamCount / 2; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teams.get(teamCount - 1 - i);

                    System.out.println(homeTeam + " vs " + awayTeam);
            }

            Collections.rotate(teams.subList(1, teams.size()), 1);
        }
    }
}

