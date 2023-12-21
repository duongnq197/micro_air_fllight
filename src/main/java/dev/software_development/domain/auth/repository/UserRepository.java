package dev.software_development.domain.auth.repository;

import dev.software_development.domain.auth.entity.User;

public interface UserRepository {

    User findByUsername(String username);

}
