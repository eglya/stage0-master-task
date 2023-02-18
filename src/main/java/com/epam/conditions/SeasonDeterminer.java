package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String season = "";
        switch (monthNumber) {
            case 1, 2, 12:
                season = "Winter";
                break;
            case 3, 4, 5:
                season = "Spring";
                break;
            case 6, 7, 8:
                season = "Summer";
                break;
            case 9, 10, 11:
                season = "Fall";
                break;
            default:
                season = "Wrong month number";
        }
        System.out.println(season);
    }
}
