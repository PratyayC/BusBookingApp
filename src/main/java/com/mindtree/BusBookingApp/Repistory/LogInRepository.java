package com.mindtree.BusBookingApp.Repistory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.BusBookingApp.Entity.LogIn;
@Repository
public interface LogInRepository extends JpaRepository<LogIn, String>
{
	@Query("SELECT u FROM LogIn u WHERE id = ?1 AND password = ?2")
	Optional<LogIn> findByPassword(String id, String password);
}
