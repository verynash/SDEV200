/*
 * Author:  Zachary Barrett
 * Date:    02/25/2024
 * This program sets up a GUI application to view the Game of the 
 * Year award winners of 2023. There are multiple categories and
 * each category has a list of games nominated. 
 */

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Category> categories = new ArrayList<Category>();
        // Create all games
        Game baldursGate3 = new Game("Baldur's Gate III", "Larian Studios", "September 3, 2023", 96, "Adventure RPG");
        Game alanWake2 = new Game("Alan Wake II", "Remedy Entertainment / Epic Games Publshing", "October 27, 2023", 89, "Survival Horror");
        Game legendOfZelda = new Game("The Legend of Zelda: Tears of the Kingdom", "Nintendo", "May 12, 2023", 96, "RPG");
        Game spiderman2 = new Game("Marvel's Spider-Man 2", "Insomniac Games / Sony Interactive Entertainment", "Octover 20, 2023", 90, "Action RPG");
        Game residentEvil4  = new Game("Resident Evil 4", "Capcom", "March 24, 2023", 93, "Survival Horror");
        Game superMarioBrosWonder = new Game("Super Mario Bro. Wonder", "Nintendo", "October 20, 2023", 92, "Platformer");
        Game cyberpunk2077 = new Game("Cyberpunk 2077: Phantom Liberty", "CD Projekt Red", "September 26, 2023", 86, "Action RPG");
        Game finalFantasy16 = new Game("Final Fantasy XVI", "Square Enix", "June 22, 2023", 87, "Action RPG");
        Game hiFiRush = new Game("Hi-Fi Rush", "Tango Gameworks / Bethesda Softworks", "January 25, 2023", 87, "Platform Fighter");
        Game liesOfP = new Game("Lies of P", "Round 8 Studio / Neowiz", "September  19, 2023", 80, "Adventure RPG");
        Game deadSpace = new Game("Dead Space", "Motive Studios / Electronic Arts", "January 27, 2023", 89, "Survival Horror");
        Game diablo4 = new Game("Diablo IV", "Blizzard Entertainment", "June 6, 2023", 86, "Hack and Slash Adventure RPG");
        Game forzaMotorsport = new Game("Forza Motorsport", "Turn 10 Studios / XBOX Game Studios", "October 10, 2023", 84, "Racing");
        Game mortalKombat1 = new Game("Mortal Kombat 1", "NetherRealm Studios / Warner Bros. Games", "September 19, 2023", 83, "Fighter");
        Game streetFighter6 = new Game("Street Fighter 6", "Capcom", "June 2, 2023", 92, "Fighter");
        Game armoredCore6 = new Game("Armored Core VI: Fires  of Rubicon", "FromSoftware / Bandai Namco Entertainment", "August 25, 2023", 86, "Action");
        Game deadIsland2 = new Game("Dead Island 2", "Dambuster Studios / Deep Silver", "April 21, 2023", 73, "Survival FPS");
        Game ghostrunner2 = new Game("Ghostrunner 2", "One More Level / 505 Games", "October 26, 2023", 80, "Platformer");
        Game remnant2 = new Game("Remnant 2", "Gunfire Games / Gearbox Publishing", "July 25, 2023", 80, "Action RPG");
        Game seaOfStars = new Game("Sea of Stars", "Sabotage Studio", "August 29, 2023", 87, "RPG");
        Game starfield = new Game("Starfield", "Bethesda Game Studios", "September 6, 2023", 83, "RPG");
        Game godOfRock = new Game("God of Rock", "Modus Games", "April 18, 2023", 62, "Rhythm Fighter");
        Game nickAllStarBrawl2 = new Game("Nickelodeon All-Star Brawl 2", "Fair Play Labs / GameMill Entertainment", "November 7, 2023", 77, "Platform Fighter");
        Game pocketBravery = new Game("Pocket Bravery", "Statera Studio / PQube", "August 31, 2023", 70, "Fighter");
        Game disneyIllusionIsland = new Game("Disney Illusion Island", "Dlala Studios / Disney Electronic Content", "July 28, 2023", 73, "Platformer");
        Game partyAnimals = new Game("Party Animals", "Recreate Games / Source Technology", "September 20, 2023", 76, "Party Fighter");
        Game pikmin4 = new Game("Pikmin 4", "Nintendo", "July 21, 2023", 87, "Adventure RTS");
        Game sonicSuperstars = new Game("Sonic Superstars", "Sega", "October 17, 2023", 73, "Platform Fighter");
        Game advanceWars = new Game("Advance Wars 1+2: Re-Boot Camp", "WayForward / Nintendo", "April 21, 2023", 83, "Strategy");
        Game citiesSkylines2 = new Game("Cities: Skylines II", "Collosal Order / Paradox Interactive", "October 24, 2023", 74, "City-building Simulation");
        Game companyOfHeroes3 = new Game("Company of Heroes 3", "Relic Entertainment / Sega", "February 23, 2023", 81, "RTS");
        Game fireEmblemEngage = new Game("Fire Emblem Engage", "Intelligent Systems / Nintendo", "January 20, 2023", 80, "Tactical RPG");
        Game eaSportsFC24 = new Game("EA Sports FC 24", "EA Vancouver / EA Romania / EA Sports", "September 29, 2023", 75, "Sports");
        Game f123 = new Game("F1 23", "Codemasters / EA Sports", "June 16, 2023", 82, "Racing");
        Game hotWheelsUnleashed2 = new Game("Hot Wheels Unleashed 2: Turbocharged", "Milestone", "October 19, 2023", 77, "Racing");
        Game theCrewMotorfest = new Game("The Crew Motorfest", "Ubisoft", "September 14, 2023", 76, "Racing");
        Game finalFantasy7Rebirth = new Game("Final Fantasy VII", "Square Enix", "February 29, 2024", 92, "Action RPG");
        Game hades2 = new Game("Hades II", "Supergiant Games", "Unreleased", 0, "Roguelike Hack-and-Slasher");
        Game likeADragonInfiniteWealth = new Game("Like a Dragon: Infinite Wealth", "Ryu Ga Gotoku Studio / Sega", "January 26, 2024", 89, "Action RPG");
        Game starWarsOutlaws = new Game("Star Wars Outlaws", "Massive Entertainment / Ubisoft", "Unreleased", 0, "Adventure RPG");
        Game tekken8 = new Game("Tekken 8", "Bandai Namco Entertainment", "January 26, 2024", 90, "Fighter");
        
        
        
        
        // Create categories and add games to categories
        Category gameOfTheYear = new Category("Game of the Year",
            "Recognizing a game that delivers the absolute best experience across all creative and technical fields", baldursGate3);
        gameOfTheYear.addGames(baldursGate3, alanWake2, legendOfZelda, spiderman2, residentEvil4, superMarioBrosWonder);
        Category bestNarrative = new Category("Best Narrative", "For outstanding storytelling and narrative development", alanWake2);
        bestNarrative.addGames(baldursGate3, cyberpunk2077, finalFantasy16, spiderman2);
        Category bestArtDirection = new Category("Best Art Direction", "For outstanding creative and/or technical achievement in artistic design and animation.", alanWake2);
        bestArtDirection.addGames(alanWake2, hiFiRush, legendOfZelda, liesOfP, superMarioBrosWonder);
        Category bestAudioDesign = new Category("Best Audio Design", "Recognizing the best in-game audio and sound design.", hiFiRush);
        bestAudioDesign.addGames(alanWake2, deadSpace, hiFiRush, spiderman2, residentEvil4);
        Category innovationInAccessibility = new Category("Innovation in Accessibility", "Recognizing software and/or hardware that is pushing the medium forward by adding features, technology and content to help games be played and enjoyed by an even wider audience.", forzaMotorsport);
        innovationInAccessibility.addGames(diablo4, forzaMotorsport, hiFiRush, spiderman2, mortalKombat1, streetFighter6);
        Category bestActionGame = new Category("Best Action Game", "For the best game in the action genre focused primarily on combat.", armoredCore6);
        bestActionGame.addGames(armoredCore6, deadIsland2, ghostrunner2, hiFiRush, remnant2);
        Category bestRPG = new Category("Best Role Playing Game", "For the best game designed with rich player character customization and progression, including massively multiplayer experiences.", baldursGate3);
        bestRPG.addGames(baldursGate3, finalFantasy16, liesOfP, seaOfStars, starfield);
        Category bestFightingGame = new Category("Best Fighting Game", "For the best game designed primarily around head-to-head combat.", streetFighter6);
        bestFightingGame.addGames(streetFighter6, godOfRock, mortalKombat1, nickAllStarBrawl2, pocketBravery);
        Category bestFamilyGame = new Category("Best Family Game", "For the best game appropriate for family play, irrespective of genre or platform.", superMarioBrosWonder);
        bestFamilyGame.addGames(superMarioBrosWonder, disneyIllusionIsland, partyAnimals, pikmin4, sonicSuperstars);
        Category bestSimStrategyGame = new Category("Best Sim / Strategy Game", "Best game focused on real time or turn-based simulation or strategy gameplay, irrespective of platform.", pikmin4);
        bestSimStrategyGame.addGames(pikmin4, advanceWars, citiesSkylines2, companyOfHeroes3, fireEmblemEngage);
        Category bestSportsRacingGame = new Category("Best Sports / Racing Game", "For the best traditional and non-traditional sports and racing game.", forzaMotorsport);
        bestSportsRacingGame.addGames(forzaMotorsport, eaSportsFC24, f123, hotWheelsUnleashed2, theCrewMotorfest);
        Category mostAnticipatedGame = new Category("Most Anticipated Game", "Recognizing an announced game that has demonstrably illustrated potential to push the gaming medium forward.", finalFantasy7Rebirth);
        mostAnticipatedGame.addGames(finalFantasy7Rebirth, hades2, likeADragonInfiniteWealth, starWarsOutlaws, tekken8);


        
        
        
        
        
        
        
        categories.add(gameOfTheYear);
        categories.add(bestNarrative);

        System.out.println(categories);
        GridPane pane = new GridPane();

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Game of the Year Awards");
        primaryStage.setScene(scene);
        primaryStage.show();;
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
