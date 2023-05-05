package gustavobryan.com.github.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gustavobryan.com.github.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
