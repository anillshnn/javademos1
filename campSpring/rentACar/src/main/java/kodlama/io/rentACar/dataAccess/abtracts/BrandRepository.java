package kodlama.io.rentACar.dataAccess.abtracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepository {
    List<Brand> getAll();
}
