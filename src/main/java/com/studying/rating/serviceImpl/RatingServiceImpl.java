package com.studying.rating.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studying.rating.Dto.RatingDto;
import com.studying.rating.entity.Rating;
import com.studying.rating.exception.ResourceNotFoundException;
import com.studying.rating.repository.RatingRepository;
import com.studying.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository repo;

	@Override
	public Rating createRating(RatingDto ratingDto) {
		Rating rating = new Rating(ratingDto.getRating(), ratingDto.getFeedback(), ratingDto.getUserId(), ratingDto.getHotelId());
		return repo.save(rating);
	}

	@Override
	public List<Rating> findAllRatings() {
		return repo.findAll();
	}

	@Override
	public List<Rating> findAllByUserId(Long userId) {
		return repo.findByUserId(userId);
	}

	@Override
	public Rating getRatingByRatingId(Long ratingId) {
		return repo.findById(ratingId).orElseThrow(() -> new ResourceNotFoundException("Rating not found!"));
	}

	@Override public List<Rating> findAllByHotelId(Long hotelId) { 
		return repo.findByHotelId(hotelId); 
	}
	 

}
