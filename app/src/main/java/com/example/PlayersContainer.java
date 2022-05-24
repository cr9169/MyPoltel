package com.example.mypoltel;

import java.util.HashMap;

public class PlayersContainer {

    private HashMap players;

    public static void fillContainer(HashMap<String, NbaPlayer> Players)
    {
        // Lakers
        NbaPlayer lebronJ = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.SF,
                "6'9", 37, 6);
        NbaPlayer russellW = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.PG,
                "6'3", 33, 0);
        NbaPlayer carmeloA = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.PF,
                "6'7", 37, 7);
        NbaPlayer malikM = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.SG,
                "6'3", 23, 11);
        NbaPlayer averyB = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.SG,
                "6'3", 31, 20);
        NbaPlayer austinR = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.SG,
                "6'5", 23, 15);
        NbaPlayer tHT = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.SG,
                "6'4", 21, 5);
        NbaPlayer dwightH = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.C,
                "6'10", 36, 39);
        NbaPlayer anthonyD = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.PF,
                "6'10", 28, 3);
        NbaPlayer stanlyJ = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.PF,
                "6'6", 25, 14);
        NbaPlayer djA = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.PG,
                "5'11", 34, 4);
        NbaPlayer wayneE = new NbaPlayer("Lakers", Conference.West, Division.Pasific, Position.SG,
                "6'4", 34, 2);

        // Clippers
        NbaPlayer teranceM = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SF,
                "6'5", 25, 14);
        NbaPlayer ivicaZ = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.C,
                "7'0", 24, 40);
        NbaPlayer reggieJ = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.PG,
                "6'2", 31, 1);
        NbaPlayer lukeK = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SG,
                "6'5", 25, 5);
        NbaPlayer amirC = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SG,
                "6'7", 24, 7);
        NbaPlayer isaiahH = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.C,
                "7'0", 23, 55);
        NbaPlayer nicloasB = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.PF,
                "6'8", 33, 33);
        NbaPlayer marcusM = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.PF,
                "6'8", 32, 8);
        NbaPlayer brandonB = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SG,
                "6'7", 20, 4);
        NbaPlayer paulG = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SF,
                "6'8", 31, 13);
        NbaPlayer robertC = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SF,
                "6'7", 31, 23);
        NbaPlayer rodneyH = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SG,
                "6'8", 29, 22);
        NbaPlayer normanP = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SG,
                "6'3", 28, 24);
        NbaPlayer kawhiL = new NbaPlayer("Clippers", Conference.West, Division.Pasific, Position.SF,
                "6'7", 30, 2);

        // Celtics






        Players.put("Lebron James", lebronJ);
        Players.put("Russell Westbrook", russellW);
        Players.put("Malik Monk", malikM);
        Players.put("Avery Bradley", averyB);
        Players.put("Austin Reaves", austinR);
        Players.put("Talen Horton-Tucker", tHT);
        Players.put("Dwight Howard", dwightH);
        Players.put("Stanley Johnson", stanlyJ);
        Players.put("Wayne Ellington", wayneE);
        Players.put("Anthony Davis", anthonyD);
        Players.put("D.J. Augustin", djA);
        Players.put("Carmelo Anthony", carmeloA);

        Players.put("Terance Mann", teranceM);
        Players.put("Ivica Zubac", ivicaZ);
        Players.put("Reggie Jackson", reggieJ);
        Players.put("Luke Kennard", lukeK);
        Players.put("Amir Coffey", amirC);
        Players.put("Isaiah Hartenstein", isaiahH);
        Players.put("Nicolas Batum", nicloasB);
        Players.put("Marcus Morris", marcusM);
        Players.put("Brandon Boston Jr.", brandonB);
        Players.put("Paul George", paulG);
        Players.put("Robert Covington", robertC);
        Players.put("Rodney Hood", rodneyH);
        Players.put("Norman Powell", normanP);
        Players.put("Kawhi Leonard", kawhiL);




























        Players.put("Lebron James", lebronJ);
    }
}
