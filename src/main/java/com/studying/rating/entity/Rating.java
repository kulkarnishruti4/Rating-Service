package com.studying.rating.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "RATING")
@Data
public class Rating {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "RATING_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ratingId;
	
	@Column(name = "RATING")
	private Long rating;
	
	@Column(name = "FEEDBACK")
	private String feedback;
	
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "HOTEL_ID")
	private Long hotelId;
	
	public Rating() {
	}
	
	public Rating(Long rating , String feedback, Long userId, Long hotelId) {
		this.rating = rating;
		this.feedback = feedback;
		this.userId = userId;
		this.hotelId = hotelId;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	
	

}
