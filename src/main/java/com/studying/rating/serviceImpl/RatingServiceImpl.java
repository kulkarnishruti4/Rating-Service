package com.studying.rating.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studying.rating.entity.Rating;
import com.studying.rating.repository.RatingRepository;
import com.studying.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository repo;

	@Override
	public Rating createRating(Rating rating) {
		return repo.save(rating);
	}

	@Override
	public List<Rating> findAllRatings() {
		return repo.findAll();
	}

	@Override
	public List<Rating> findAllByUserId(String userId) {
		return repo.findByUserId(userId);
	}

	@Override
	public List<Rating> findAllByHotelId(String hotelId) {
		return repo.findByHotelId(hotelId);
	}

}
