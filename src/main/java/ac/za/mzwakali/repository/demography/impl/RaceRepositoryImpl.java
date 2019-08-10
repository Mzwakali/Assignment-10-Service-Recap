package ac.za.mzwakali.repository.demography.impl;

import ac.za.mzwakali.domain.demography.Race;
import ac.za.mzwakali.repository.demography.RaceRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl raceRepository = null;
    private Map<Integer, Race> races;

    public RaceRepositoryImpl(){
        races = new HashMap<>();
    }

    public static RaceRepositoryImpl getRaceRepository() {
        if (raceRepository == null){
            return new RaceRepositoryImpl();
        }
        return raceRepository;
    }

    @Override
    public Set<Race> getAll() {
        return new HashSet<>(races.values());
    }

    @Override
    public Race create(Race race) {
        races.put(race.getRaceId(), race);
        return race;
    }

    @Override
    public Race read(Integer id) {
        return races.get(id);
    }

    @Override
    public Race update(Race race) {
        Race raceUpdate = read(race.getRaceId());
        if (raceUpdate != null){
            races.replace(race.getRaceId(), race);
            return create(race);
        }
        return race;
    }

    @Override
    public void delete(Integer id) {
        Race raceDelete = read(id);

        if (raceDelete != null){
            races.remove(id,raceDelete);
        }

    }
}
