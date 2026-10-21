package com.pluralsight;

import java.util.Scanner;

public class HighScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a game score: Home:Visitor|21:9

        System.out.print("Please enter the game score: ");
        String userInput = input.nextLine();
        System.out.println("You've entered: " + userInput);

        // Split using pipe and escaping thru \\ (changing literal from OR command)

        String[] tokens = userInput.split("\\|");
        String[] teams = tokens[0].split(":");
        String[] scoreStrings = tokens[1].split(":");
        String homeScoreStr = scoreStrings[0];
        String visitorScoreStr = scoreStrings[1];

        // Score team names
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        // Convert them from string to int
        int homeScore = Integer.parseInt(homeScoreStr);
        int visitorScore = Integer.parseInt(visitorScoreStr);

        // Finding out the winner or  if it's a tie
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Winner: Tie!");
        }

    }

}
