package com.capston.wiwe.repository;

import com.capston.wiwe.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByNickname(String nickname);

    Optional<User> findByUserName(String userName);
    boolean existsByUserName(String userName);

    boolean existsByNickname(String nickname);
}
