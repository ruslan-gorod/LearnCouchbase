package org.example.repository;

import org.example.models.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CouchbaseRepository<User, String> {

    User save(User user);

    Optional<User> findById(String id);

    Optional<User> findByEmail(String email);

    List<User> findBySportSportName(String sportName);

    List<User> findByEmailContainingOrFullNameContaining(String firstQuery, String secondQuery);
}

