package com.studying.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studying.rating.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{
	
	// custom finder methods for tables which are in another schema/db
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);

}
