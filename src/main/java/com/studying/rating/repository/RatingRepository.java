package com.studying.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.studying.rating.entity.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{
	
	// custom finder methods for tables which are in another schema/db
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);

}
