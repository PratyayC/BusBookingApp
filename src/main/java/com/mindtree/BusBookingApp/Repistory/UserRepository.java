package com.mindtree.BusBookingApp.Repistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.BusBookingApp.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> 
{

}
