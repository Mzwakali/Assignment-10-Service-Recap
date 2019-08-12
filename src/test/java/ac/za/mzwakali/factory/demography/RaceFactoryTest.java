package ac.za.mzwakali.factory.demography;

import ac.za.mzwakali.domain.demography.Race;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    private Race race;

    @Before
    public void setUp() throws Exception {
        race = RaceFactory.buildRace(4,"Indian");
    }

    @Test
    public void buildRace() {
        assertNotNull(race);
    }
}