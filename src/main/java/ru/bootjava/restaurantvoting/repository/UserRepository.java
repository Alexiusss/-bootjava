package ru.bootjava.restaurantvoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bootjava.restaurantvoting.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
