package com.studying.rating.service;

import java.util.List;


import com.studying.rating.Dto.RatingDto;
import com.studying.rating.entity.Rating;

public interface RatingService {

	public Rating createRating(RatingDto rating);
	
	public List<Rating> findAllRatings();
	
	public Rating getRatingByRatingId(Long ratingId);
	
	public List<Rating> findAllByUserId(Long userId);

	public List<Rating> findAllByHotelId(Long hotelId);
	
}
