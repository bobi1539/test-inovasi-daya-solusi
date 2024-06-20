package test.inovasi.daya.solusi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.inovasi.daya.solusi.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
