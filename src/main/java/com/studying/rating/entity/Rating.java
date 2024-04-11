package com.studying.rating.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RATING")
public class Rating {
	
	@jakarta.persistence.Id
	@Column(name = "RATING_ID")
	private String ratingId;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "RATING")
	private int rating;
	
	@Column(name = "HOTEL")
	private String hotelId;
	
	@Column(name = "FEEDBACK")
	private String feedback;

}
