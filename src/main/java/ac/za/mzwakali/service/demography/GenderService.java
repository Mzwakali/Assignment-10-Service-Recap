package ac.za.mzwakali.service.demography;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, Integer> {

    Set<Gender>getAll();
}
