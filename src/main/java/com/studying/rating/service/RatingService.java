package com.studying.rating.service;

import java.util.List;

import com.studying.rating.entity.Rating;

public interface RatingService {

	public Rating createRating(Rating rating);
	
	public List<Rating> findAllRatings();
	
	public List<Rating> findAllByUserId(String userId);
	
	public List<Rating> findAllByHotelId(String hotelId);
	
}
