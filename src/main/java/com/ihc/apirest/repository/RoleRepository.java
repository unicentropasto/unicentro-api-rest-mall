package com.ihc.apirest.repository;

import com.ihc.apirest.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long>
{
  
}