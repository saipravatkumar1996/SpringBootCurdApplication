package com.hexaphor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaphor.entity.Role;

@Repository
public interface Role_Repository extends JpaRepository<Role, String> {

}
