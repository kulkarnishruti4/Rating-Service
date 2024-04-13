package com.studying.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studying.rating.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long>{
	
	// custom finder methods for tables which are in another schema/db
	
	List<Rating> findByUserId(Long userId);
	
	List<Rating> findByHotelId(Long hotelId);

}
