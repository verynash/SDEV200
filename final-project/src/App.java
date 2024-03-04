/*
 * Author:  Zachary Barrett
 * Date:    02/25/2024
 * This program sets up a GUI application to view the Game of the 
 * Year award winners of 2023. There are multiple categories and
 * each category has a list of games nominated. 
 */

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Category> categories = new ArrayList<Category>();
        // Create all games
        Game baldursGate3 = new Game("Baldur's Gate III", "Larian Studios", "September 3, 2023", 96, "Adventure RPG", "./images/baldursGate3.jpg");
        Game alanWake2 = new Game("Alan Wake II", "Remedy Entertainment / Epic Games Publshing", "October 27, 2023", 89, "Survival Horror", "./images/alanWake2.jpg");
        Game legendOfZelda = new Game("The Legend of Zelda: Tears of the Kingdom", "Nintendo", "May 12, 2023", 96, "RPG", "./images/legendOfZelda.jpg");
        Game spiderman2 = new Game("Marvel's Spider-Man 2", "Insomniac Games / Sony Interactive Entertainment", "Octover 20, 2023", 90, "Action RPG", "./images/spiderman2.jpeg");
        Game residentEvil4  = new Game("Resident Evil 4", "Capcom", "March 24, 2023", 93, "Survival Horror", "./images/residentEvil4.jpg");
        Game superMarioBrosWonder = new Game("Super Mario Bro. Wonder", "Nintendo", "October 20, 2023", 92, "Platformer", "./images/superMarioBrosWonder.png");
        Game cyberpunk2077 = new Game("Cyberpunk 2077: Phantom Liberty", "CD Projekt Red", "September 26, 2023", 86, "Action RPG", "./images/cyberpunk2077.jpg");
        Game finalFantasy16 = new Game("Final Fantasy XVI", "Square Enix", "June 22, 2023", 87, "Action RPG", "./images/finalFantasy16.png");
        Game hiFiRush = new Game("Hi-Fi Rush", "Tango Gameworks / Bethesda Softworks", "January 25, 2023", 87, "Platform Fighter", "./images/hiFiRush.jpg");
        Game liesOfP = new Game("Lies of P", "Round 8 Studio / Neowiz", "September 19, 2023", 80, "Adventure RPG", "./images/liesOfP.jpg");
        Game deadSpace = new Game("Dead Space", "Motive Studios / Electronic Arts", "January 27, 2023", 89, "Survival Horror", "./images/deadSpace.jpg");
        Game diablo4 = new Game("Diablo IV", "Blizzard Entertainment", "June 6, 2023", 86, "Hack and Slash Adventure RPG", "./images/diablo4.png");
        Game forzaMotorsport = new Game("Forza Motorsport", "Turn 10 Studios / XBOX Game Studios", "October 10, 2023", 84, "Racing", "./images/forzaMotorsport.png");
        Game mortalKombat1 = new Game("Mortal Kombat 1", "NetherRealm Studios / Warner Bros. Games", "September 19, 2023", 83, "Fighter", "./images/mortalKombat1.jpeg");
        Game streetFighter6 = new Game("Street Fighter 6", "Capcom", "June 2, 2023", 92, "Fighter", "./images/streetFighter6.jpg");
        Game armoredCore6 = new Game("Armored Core VI: Fires  of Rubicon", "FromSoftware / Bandai Namco Entertainment", "August 25, 2023", 86, "Action", "./images/armoredCore6.jpg");
        Game deadIsland2 = new Game("Dead Island 2", "Dambuster Studios / Deep Silver", "April 21, 2023", 73, "Survival FPS", "./images/deadIsland2.jpg");
        Game ghostrunner2 = new Game("Ghostrunner 2", "One More Level / 505 Games", "October 26, 2023", 80, "Platformer", "./images/ghostrunner2.jpg");
        Game remnant2 = new Game("Remnant 2", "Gunfire Games / Gearbox Publishing", "July 25, 2023", 80, "Action RPG", "./images/remnant2.jpg");
        Game seaOfStars = new Game("Sea of Stars", "Sabotage Studio", "August 29, 2023", 87, "RPG", "./images/seaOfStars.jpg");
        Game starfield = new Game("Starfield", "Bethesda Game Studios", "September 6, 2023", 83, "RPG", "./images/starfield.jpg");
        Game godOfRock = new Game("God of Rock", "Modus Games", "April 18, 2023", 62, "Rhythm Fighter", "./images/godOfRock.png");
        Game nickAllStarBrawl2 = new Game("Nickelodeon All-Star Brawl 2", "Fair Play Labs / GameMill Entertainment", "November 7, 2023", 77, "Platform Fighter", "./images/nickAllStarBrawl2.jpg");
        Game pocketBravery = new Game("Pocket Bravery", "Statera Studio / PQube", "August 31, 2023", 70, "Fighter", "./images/pocketBravery.jpg");
        Game disneyIllusionIsland = new Game("Disney Illusion Island", "Dlala Studios / Disney Electronic Content", "July 28, 2023", 73, "Platformer", "./images/disneyIllusionIsland.jpg");
        Game partyAnimals = new Game("Party Animals", "Recreate Games / Source Technology", "September 20, 2023", 76, "Party Fighter", "./images/partyAnimals.jpg");
        Game pikmin4 = new Game("Pikmin 4", "Nintendo", "July 21, 2023", 87, "Adventure RTS", "./images/pikmin4.jpg");
        Game sonicSuperstars = new Game("Sonic Superstars", "Sega", "October 17, 2023", 73, "Platform Fighter", "./images/sonicSuperstars.png");
        Game advanceWars = new Game("Advance Wars 1+2: Re-Boot Camp", "WayForward / Nintendo", "April 21, 2023", 83, "Strategy", "./images/advanceWars.jpg");
        Game citiesSkylines2 = new Game("Cities: Skylines II", "Collosal Order / Paradox Interactive", "October 24, 2023", 74, "City-building Simulation", "./images/citiesSkylines2.png");
        Game companyOfHeroes3 = new Game("Company of Heroes 3", "Relic Entertainment / Sega", "February 23, 2023", 81, "RTS", "./images/companyOfHeroes3.jpg");
        Game fireEmblemEngage = new Game("Fire Emblem Engage", "Intelligent Systems / Nintendo", "January 20, 2023", 80, "Tactical RPG", "./images/fireEmblemEngage.jpg");
        Game eaSportsFC24 = new Game("EA Sports FC 24", "EA Vancouver / EA Romania / EA Sports", "September 29, 2023", 75, "Sports", "./images/eaSportsFC24.jpg");
        Game f123 = new Game("F1 23", "Codemasters / EA Sports", "June 16, 2023", 82, "Racing", "./images/f123.jpg");
        Game hotWheelsUnleashed2 = new Game("Hot Wheels Unleashed 2: Turbocharged", "Milestone", "October 19, 2023", 77, "Racing", "./images/hotWheelsUnleashed2.jpg");
        Game theCrewMotorfest = new Game("The Crew Motorfest", "Ubisoft", "September 14, 2023", 76, "Racing", "./images/theCrewMotorfest.jpg");
        Game finalFantasy7Rebirth = new Game("Final Fantasy VII", "Square Enix", "February 29, 2024", 92, "Action RPG", "./images/finalFantasy7Rebirth.png");
        Game hades2 = new Game("Hades II", "Supergiant Games", "Unreleased", 0, "Roguelike Hack-and-Slasher", "./images/hades.jpg");
        Game likeADragonInfiniteWealth = new Game("Like a Dragon: Infinite Wealth", "Ryu Ga Gotoku Studio / Sega", "January 26, 2024", 89, "Action RPG", "./images/likeADragonInfiniteWealth.jpg");
        Game starWarsOutlaws = new Game("Star Wars Outlaws", "Massive Entertainment / Ubisoft", "Unreleased", 0, "Adventure RPG", "./images/starWarsOutlaws.jpeg");
        Game tekken8 = new Game("Tekken 8", "Bandai Namco Entertainment", "January 26, 2024", 90, "Fighter", "./images/tekken8.jpg");
        
        
        
        
        // Create categories and add games to categories
        Category gameOfTheYear = new Category("Game of the Year", "Recognizing a game that delivers the absolute best experience across all creative and technical fields", baldursGate3);
        gameOfTheYear.addGames(baldursGate3, alanWake2, legendOfZelda, spiderman2, residentEvil4, superMarioBrosWonder);
        Category bestNarrative = new Category("Best Narrative", "For outstanding storytelling and narrative development", alanWake2);
        bestNarrative.addGames(baldursGate3, cyberpunk2077, finalFantasy16, spiderman2);
        Category bestArtDirection = new Category("Best Art Direction", "For outstanding creative and/or technical achievement in artistic design and animation.", alanWake2);
        bestArtDirection.addGames(alanWake2, hiFiRush, legendOfZelda, liesOfP, superMarioBrosWonder);
        Category bestAudioDesign = new Category("Best Audio Design", "Recognizing the best in-game audio and sound design.", hiFiRush);
        bestAudioDesign.addGames(alanWake2, deadSpace, hiFiRush, spiderman2, residentEvil4);
        Category innovationInAccessibility = new Category("Innovation in Accessibility", "Recognizing software and/or hardware that is pushing the medium forward by adding features, technology and content.", forzaMotorsport);
        innovationInAccessibility.addGames(diablo4, forzaMotorsport, hiFiRush, spiderman2, mortalKombat1, streetFighter6);
        Category bestActionGame = new Category("Best Action Game", "For the best game in the action genre focused primarily on combat.", armoredCore6);
        bestActionGame.addGames(armoredCore6, deadIsland2, ghostrunner2, hiFiRush, remnant2);
        Category bestRPG = new Category("Best Role Playing Game", "For the best game designed with rich player character customization and progression.", baldursGate3);
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

        // Add categories to Arraylist categories
        categories.add(gameOfTheYear);
        categories.add(bestNarrative);
        categories.add(bestArtDirection);
        categories.add(bestAudioDesign);
        categories.add(innovationInAccessibility);
        categories.add(bestActionGame);
        categories.add(bestRPG);
        categories.add(bestFightingGame);
        categories.add(bestFamilyGame);
        categories.add(bestSimStrategyGame);
        categories.add(bestSportsRacingGame);
        categories.add(mostAnticipatedGame);

        // Create pane
        BorderPane mainPane = new BorderPane();
        FlowPane pane = new FlowPane();
        pane.setPrefSize(1000, 750);

        
        // For each category, create a GridPane that will be placed
        // within the FlowPane
        for (int i = 0; i < categories.size(); i++) {
            Category currentCategory = categories.get(i);

            // Create Borderpane
            BorderPane borderPane = new BorderPane();
            
            // Create GridPane
            GridPane gridPane = new GridPane();
            gridPane.setPrefSize(250, 250);
            gridPane.setPadding(new Insets(12));
            
            // Create imageView for category winner
            Image image = new Image(categories.get(i).categoryWinner.imageURL);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(100); // Set a max height
            imageView.setPreserveRatio(true); // Maintain image ratio
            
            // Create labels
            String categoryName = categories.get(i).getCategoryName();
            Label lbCategoryName = new Label(categoryName);
            lbCategoryName.setFont(new Font("Arial", 16)); // Change font for header
            lbCategoryName.setStyle("-fx-font-weight: bold"); // Make text bold
            String gameName = categories.get(i).getWinner().getGameName();
            Label lbGameName = new Label(gameName);
            lbGameName.setStyle("-fx-font-weight: bold; -fx-font-size: 12");
            String description = categories.get(i).getCategoryDescription();
            Label lbDescription = new Label(description);
            lbDescription.setWrapText(true); // Wrap description text
            lbDescription.setTextAlignment(TextAlignment.CENTER); // Center text
            
            // Create button and handle click
            Button btnNominees = new Button("Nominees");
            btnNominees.setOnMouseClicked(e -> {
                CreateNomineeScene(currentCategory, primaryStage);
                primaryStage.close();
            });
            
            // Add image, labels, and button to GridPane
            gridPane.add(lbCategoryName, 0, 0);
            gridPane.add(imageView, 0, 1);
            gridPane.add(lbGameName, 0, 2);
            gridPane.add(lbDescription, 0, 3);
            
            // Align the image and labels
            GridPane.setHalignment(lbCategoryName, HPos.CENTER);
            GridPane.setHalignment(imageView, HPos.CENTER);
            GridPane.setHalignment(lbGameName, HPos.CENTER);
            GridPane.setHalignment(lbDescription, HPos.CENTER);
            GridPane.setHalignment(btnNominees, HPos.CENTER);
            
            // Add GridPane to BorderPane, add BorderPane to FlowPane
            borderPane.setCenter(gridPane);
            borderPane.setBottom(btnNominees);
            pane.getChildren().add(borderPane);
            
            // Align the buttons to feel more natural
            BorderPane.setMargin(gridPane, new Insets(0, 0, -42, 0));
            BorderPane.setAlignment(btnNominees, Pos.CENTER);
        }
        
        // Create Header and style
        Label lbGOTY = new Label("Game of the Year Awards");
        lbGOTY.setFont(new Font("Arial", 28));
        lbGOTY.setStyle("-fx-font-weight: bold");

        // Place panes into mainPane
        mainPane.setTop(lbGOTY);
        mainPane.setCenter(pane);
        BorderPane.setAlignment(lbGOTY, Pos.CENTER);
        
        // Create scene
        Scene scene = new Scene(mainPane);
        primaryStage.setTitle("Game of the Year Awards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void CreateNomineeScene(Category category, Stage stage) {
        // Create stage
        Stage gameStage = new Stage();

        // Create pane
        BorderPane borderPane = new BorderPane();

        // Create header
        VBox headerVBox = new VBox();
        Label lbCategory = new Label(category.getCategoryName()); 
        Label lbCategoryDesc = new Label(category.getCategoryDescription());
        
        // Style header
        lbCategory.setFont(new Font("arial", 28));
        lbCategory.setStyle("-fx-font-weight: bold");
        lbCategoryDesc.setFont(new Font("arial", 16));
        lbCategoryDesc.setStyle("-fx-font-style: italic");
        
        // Place header labels in VBox and align
        headerVBox.getChildren().addAll(lbCategory, lbCategoryDesc);
        headerVBox.setAlignment(Pos.CENTER);

        // Create games hbox
        HBox gamesHBox = new HBox(12);
        // Loop through games and create a GridPane for each
        for (int i = 0; i < category.games.size(); i++) {
            GridPane gridPane = new GridPane();
            Game game = category.games.get(i);

            // Extract attributes from current Game
            String imageURL =  game.getImageURL();
            String name = game.getGameName();
            String developer = game.getDeveloper();
            String releaseDate = game.getReleaseDate();
            int rating = game.getRating();
            String description = game.getDescription();

            // Place attributes in labels and imageViews
            Image image = new Image(imageURL);
            ImageView imageView = new ImageView(image);
            Label lbName = new Label(name);
            Label lbDeveloper = new Label("Created by: " + developer);
            Label lbReleaseDate = new Label("Released: " + releaseDate);
            Label lbRating = new Label("Metacritic Rating: " + rating);
            Label lbDescription = new Label("Genre: " + description);

            // Style imageViews
            imageView.setFitHeight(250);
            imageView.setPreserveRatio(true);
            GridPane.setHalignment(imageView, HPos.CENTER);

            // Add some styling to labels
            lbName.setFont(new Font("Arial", 12));
            lbName.setStyle("-fx-font-weight: bold");
            lbName.setWrapText(true);
            GridPane.setHalignment(lbName, HPos.CENTER);
            lbDeveloper.setWrapText(true);

            // Create Comments button
            Button commentButton = new Button("Comments");
            commentButton.setOnMouseClicked(e -> {
                CreateCommentScene(game);
            });



            // Place labels and imageViews and button into Gridbox
            gridPane.add(imageView, i, 0);
            gridPane.add(lbName, i, 1);
            gridPane.add(lbDeveloper, i, 2);
            gridPane.add(lbReleaseDate, i, 3);
            gridPane.add(lbRating, i, 4);
            gridPane.add(lbDescription, i, 5);
            gridPane.add(commentButton, i, 6);

            // Add GridPane to HBox
            gamesHBox.getChildren().add(gridPane);

        }

        // Create return button
        Button btnReturn = new Button("WINNERS");
        btnReturn.setOnMouseClicked(e -> {
            start(stage);
            gameStage.close();
        });
        
        // Add panes to BorderPane
        borderPane.setTop(headerVBox);
        borderPane.setCenter(gamesHBox);
        borderPane.setBottom(btnReturn);

        // Fix alignments and aesthetics
        BorderPane.setAlignment(btnReturn, Pos.CENTER);
        BorderPane.setMargin(gamesHBox, new Insets(12, 8, 20, 8));
        BorderPane.setMargin(btnReturn, new Insets(16));

        // Create Scene
        Scene gameScene = new Scene(borderPane);
        gameStage.setTitle(category.getCategoryName());
        gameStage.setScene(gameScene);
        gameStage.show();        

    }

    public void CreateCommentScene(Game game) {
        // Create stage
        Stage commentStage = new Stage();

        // Create pane
        BorderPane borderPane = new BorderPane();

        // Create Header
        Label lbGame = new Label(game.getGameName());

        // Style Header
        lbGame.setFont(new Font("arial", 28));
        lbGame.setStyle("fx-font-weight: bold");

        // Create HBox for comments
        VBox commentsVBox = new VBox();

        // Create comments
        for (int i = 0; i < game.comments.size(); i++) {
            if (game.comments.get(i) == null)
                break;
            VBox vBox = new VBox();
            Comment comment = game.comments.get(i);

            // Create label for comment attributes
            Label lbUser = new Label(comment.getUser());
            Label lbComment = new Label(comment.getComment());

            // Add labels to VBox
            vBox.getChildren().addAll(lbUser, lbComment);

            // Add Vbox to VBox
            commentsVBox.getChildren().add(vBox);
        }

        // Create GridPane for adding comments
        GridPane gridPane = new GridPane();

        // Create form for adding a comment
        Label lbUser = new Label("Username");
        TextField tfUser = new TextField("Enter username");
        Label lbComment = new Label("Comment");
        TextArea taComment = new TextArea("Enter your comment here: ");
        
        // Create and handle addCommentButton
        Button addCommentButton = new Button("Add Comment");
        addCommentButton.setOnMouseClicked(e -> {
            Comment comment = new Comment(tfUser.getText(), taComment.getText());
            game.addComment(comment);
            commentStage.close();
            CreateCommentScene(game);
        });

        // Add form and button to GridPane
        gridPane.add(lbUser, 0, 0);
        gridPane.add(tfUser, 0, 1);
        gridPane.add(lbComment, 0, 2);
        gridPane.add(taComment, 0, 3);
        gridPane.add(addCommentButton, 0, 4);       

        // Add panes to BorderPane
        borderPane.setTop(lbGame);
        borderPane.setCenter(commentsVBox);
        borderPane.setBottom(gridPane);

        // Style BorderPane
        BorderPane.setMargin(commentsVBox, new Insets(8, 0, 8, 0));

        // Create Scene
        Scene commentScene = new Scene(borderPane);
        commentStage.setTitle(game.getGameName());
        commentStage.setScene(commentScene);
        commentStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
