package ac.za.mzwakali.service.demography.impl;

import ac.za.mzwakali.domain.demography.Race;
import ac.za.mzwakali.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceServiceImpl raceService;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.raceService = RaceServiceImpl.getRaceService();
        race = RaceFactory.buildRace(2,"black");

    }

    @Test
    public void getAll() {
        Set<Race> raceSet = raceService.getAll();
        Assert.assertNotNull(raceSet);
    }

    @Test
    public void create() {
        raceService.create(race);
        Race raceCreate = raceService.read(race.getRaceId());
        Assert.assertNotNull(raceCreate);
    }

    @Test
    public void read() {
        raceService.create(race);
        Race raceRead = raceService.read(race.getRaceId());
        Assert.assertNotNull(raceRead);
    }

    @Test
    public void update() {
        raceService.create(race);
        Race raceUpdate = raceService.read(race.getRaceId());
        race.setRaceDesc("Indian");
        raceService.update(race);
        Assert.assertEquals(race.getRaceId(), raceUpdate.getRaceId());
    }

    @Test
    public void delete() {
        raceService.create(race);
        Race raceDelete = raceService.read(race.getRaceId());
        Assert.assertNotNull(raceDelete);
        raceService.delete(race.getRaceId());
        Race rDeleted = raceService.read(race.getRaceId());
        Assert.assertNull(rDeleted);
    }
}