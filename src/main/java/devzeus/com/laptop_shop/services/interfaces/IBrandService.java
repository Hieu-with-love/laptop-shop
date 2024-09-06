package devzeus.com.laptop_shop.services.interfaces;

import devzeus.com.laptop_shop.dtos.requests.BrandDTO;
import devzeus.com.laptop_shop.models.Brand;

import java.util.List;

public interface IBrandService {
    Brand createBrand(BrandDTO brandDTO);
    Brand updateBrand(BrandDTO brandDTO, Long brandId);
    void deleteBrand(Long brandId);
    List<Brand> getAllBrands();
    Brand getBrandById(Long brandId);
}
