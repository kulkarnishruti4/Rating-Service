package com.studying.rating.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studying.rating.Dto.RatingDto;
import com.studying.rating.entity.Rating;
import com.studying.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService service;

	@PostMapping("/createRating")
	public ResponseEntity<Rating> create(@RequestBody RatingDto rating) {

		return ResponseEntity.status(HttpStatus.CREATED).body(service.createRating(rating));

	}

	@GetMapping("/getAllRatings")
	public ResponseEntity<List<Rating>> getAllRatings() {

		return ResponseEntity.ok(service.findAllRatings());
	}

	@GetMapping("/getRatingByRatingId/{ratingId}")
	public ResponseEntity<Rating> getRatingByRatingId(@PathVariable Long ratingId) {

		return ResponseEntity.ok(service.getRatingByRatingId(ratingId));

	}

	@GetMapping("/getRatingsByUserId/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable Long userId) {

		return ResponseEntity.ok(service.findAllByUserId(userId));
	}

	
	@GetMapping("/getRatingsByHotelId/{hotelId}") 
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable Long hotelId) {
	  
	  return ResponseEntity.ok(service.findAllByHotelId(hotelId));
	  
	}

}
