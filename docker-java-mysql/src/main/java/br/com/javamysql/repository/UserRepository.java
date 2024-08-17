package br.com.javamysql.repository;

import br.com.javamysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("from Users where firstName = : firstName")
    public user findByFirstName(@Param("firstName")){

    }
}
