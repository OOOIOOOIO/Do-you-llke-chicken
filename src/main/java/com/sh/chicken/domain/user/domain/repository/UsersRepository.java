package com.sh.chicken.domain.user.domain.repository;

import com.sh.chicken.domain.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {


    public Optional<Users> findByUsername(@Param("username") String username);
    public Optional<Users> findByUsernameAndPw(@Param("username") String username,
                                               @Param("pw") String pw);
}
