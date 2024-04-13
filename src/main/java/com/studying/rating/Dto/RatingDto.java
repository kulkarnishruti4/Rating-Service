package com.studying.rating.Dto;

public class RatingDto {
	
	private Long rating;
	private String feedback;
	private Long userId;
	private Long hotelId;
	private HotelDto hotel;
	
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
	public HotelDto getHotel() {
		return hotel;
	}
	public void setHotel(HotelDto hotel) {
		this.hotel = hotel;
	}
	

}
