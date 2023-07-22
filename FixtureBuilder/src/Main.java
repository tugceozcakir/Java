import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teamsEvenScenario = new ArrayList<>();
        teamsEvenScenario.add("Galatasaray");
        teamsEvenScenario.add("Bursaspor");
        teamsEvenScenario.add("Fenerbahçe");
        teamsEvenScenario.add("Beşiktaş");
        teamsEvenScenario.add("Başakşehir");
        teamsEvenScenario.add("Trabzonspor");

        FixtureGenerator fixtureGeneratorEvenScenario = new FixtureGenerator(teamsEvenScenario);
        fixtureGeneratorEvenScenario.generateFixture();

        System.out.println("----------------------------------");

        ArrayList<String> teamsOddScenario = new ArrayList<>();
        teamsOddScenario.add("Galatasaray");
        teamsOddScenario.add("Bursaspor");
        teamsOddScenario.add("Fenerbahçe");
        teamsOddScenario.add("Beşiktaş");
        teamsOddScenario.add("Başakşehir");
        teamsOddScenario.add("Boluspor");
        teamsOddScenario.add("TrabzonSpor");

        FixtureGenerator fixtureGeneratorOddScenario = new FixtureGenerator(teamsOddScenario);
        fixtureGeneratorOddScenario.generateFixture();
    }
}