package org.example.repository;

import org.example.models.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.Optional;

public interface UserRepository extends CouchbaseRepository<User, String> {
    // Define any custom queries or methods here

    User save(User user);

    Optional<User> findById(String id);
}

