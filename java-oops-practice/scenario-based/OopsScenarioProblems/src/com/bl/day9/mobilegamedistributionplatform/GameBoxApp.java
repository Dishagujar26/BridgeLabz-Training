package com.bl.day9.mobilegamedistributionplatform;

/*
 24. "GameBox – Mobile Game Distribution Platform"
Story: GameBox offers mobile games for download and purchase with features like demos,
reviews, and leaderboards.
Requirements:
● Game class: title, genre, price, rating.
● User class with list of owned games.
● Interface IDownloadable: download(), playDemo().
● Constructors to set up free or paid games.
● Use operators to apply seasonal offers.
● Encapsulation: user-owned game data protected.
● Inheritance: ArcadeGame, StrategyGame from Game.
● Polymorphism: playDemo() behaves differently per genre.
 */
import java.util.*;

public class GameBoxApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		User user = new User("Disha");

		ArcadeGame arcade = new ArcadeGame("SpeedRun", 300, 4.5);
		StrategyGame strategy = new StrategyGame("WarPlan", 500, 4.8);

		while (true) {
			System.out.println("1. View Games");
			System.out.println("2. Play Demo");
			System.out.println("3. Buy Game");
			System.out.println("4. View My Library");
			System.out.println("5. Apply Offer");
			System.out.println("6. Exit");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("1. SpeedRun (Arcade) ₹300");
				System.out.println("2. WarPlan (Strategy) ₹500");
				break;

			case 2:
				System.out.println("1. SpeedRun  2. WarPlan");
				int d = sc.nextInt();
				if (d == 1)
					arcade.playDemo();
				else
					strategy.playDemo();
				break;

			case 3:
				System.out.println("1. SpeedRun  2. WarPlan");
				int b = sc.nextInt();
				if (b == 1)
					user.buyGame(arcade);
				else
					user.buyGame(strategy);
				break;

			case 4:
				user.showLibrary();
				break;

			case 5:
				System.out.println("WarPlan after 20% discount: " + strategy.applyOffer(20));
				break;

			case 6:
				System.exit(0);
			}
		}
	}
}
