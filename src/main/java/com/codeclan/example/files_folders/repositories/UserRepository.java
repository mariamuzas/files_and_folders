package com.codeclan.example.files_folders.repositories;

import com.codeclan.example.files_folders.models.Folder;
import com.codeclan.example.files_folders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}

