package ac.za.mzwakali.service.demography;

import ac.za.mzwakali.domain.demography.Race;
import ac.za.mzwakali.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, Integer> {

    Set<Race>getAll();
}
