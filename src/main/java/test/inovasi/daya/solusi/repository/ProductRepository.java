package test.inovasi.daya.solusi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.inovasi.daya.solusi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
