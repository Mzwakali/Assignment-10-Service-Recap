package ac.za.mzwakali.repository.demography.impl;

import ac.za.mzwakali.domain.demography.Race;
import ac.za.mzwakali.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    private RaceRepositoryImpl raceRepository = null;
    private Race race;

    @Before
    public void setUp() throws Exception {
        raceRepository = RaceRepositoryImpl.getRaceRepository();
        race = RaceFactory.buildRace(4,"Indian");
    }

    @Test
    public void create() {
        assertNotNull(raceRepository.create(race));
    }

    @Test
    public void read() {
        assertNull(raceRepository.read(race.getRaceId()));
    }

    @Test
    public void update() {
        assertNotNull(raceRepository.update(race));
    }

    @Test
    public void delete() {
        raceRepository.delete(race.getRaceId());
    }
}