package br.kpsantiago.Challange.domain.repository;

import br.kpsantiago.Challange.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    boolean existsByAccountNumber(String accountNumber);
}
