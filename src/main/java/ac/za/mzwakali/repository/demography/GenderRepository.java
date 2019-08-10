package ac.za.mzwakali.repository.demography;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, Integer> {
    Set<Gender>getAll();
}
