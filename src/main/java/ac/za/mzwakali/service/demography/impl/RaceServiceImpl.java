package ac.za.mzwakali.service.demography.impl;

import ac.za.mzwakali.domain.demography.Race;
import ac.za.mzwakali.repository.demography.RaceRepository;
import ac.za.mzwakali.repository.demography.impl.RaceRepositoryImpl;
import ac.za.mzwakali.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private static RaceServiceImpl raceService = null;
    private RaceRepository raceRepository;

    public RaceServiceImpl(){
        raceRepository = RaceRepositoryImpl.getRaceRepository();
    }

    public static RaceServiceImpl getRaceService(){
        if (raceService == null){
            return new RaceServiceImpl();
        }
        return raceService;
    }

    @Override
    public Set<Race> getAll() {
        return raceRepository.getAll();
    }

    @Override
    public Race create(Race race) {
        return raceRepository.create(race);
    }

    @Override
    public Race read(Integer id) {
        return raceRepository.read(id);
    }

    @Override
    public Race update(Race race) {
        return raceRepository.update(race);
    }

    @Override
    public void delete(Integer id) {
        raceRepository.delete(id);

    }
}
