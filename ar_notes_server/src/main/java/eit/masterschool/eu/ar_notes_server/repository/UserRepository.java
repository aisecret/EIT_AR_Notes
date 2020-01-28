package eit.masterschool.eu.ar_notes_server.repository;

import eit.masterschool.eu.ar_notes_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    List<User> findAllByOrderByIdAsc();

}