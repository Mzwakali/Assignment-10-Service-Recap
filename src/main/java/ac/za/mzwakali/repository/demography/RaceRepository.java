package ac.za.mzwakali.repository.demography;

import ac.za.mzwakali.domain.demography.Race;
import ac.za.mzwakali.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, Integer> {
    Set<Race> getAll();
}
