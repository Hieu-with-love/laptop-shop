package devzeus.com.laptop_shop.repositories;

import devzeus.com.laptop_shop.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
