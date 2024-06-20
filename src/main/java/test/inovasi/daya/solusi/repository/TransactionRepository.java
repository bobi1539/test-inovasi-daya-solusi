package test.inovasi.daya.solusi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.inovasi.daya.solusi.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
