package ac.za.mzwakali.factory.demography;

import ac.za.mzwakali.domain.demography.Race;

public class RaceFactory {

    public static Race buildRace(int raceId, String raceDesc){
        return new Race.Builder()
                .raceId(raceId)
                .raceDesc(raceDesc)
                .build();
    }
}
