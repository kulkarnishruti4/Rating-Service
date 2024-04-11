package com.studying.rating.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("USER_RATINGS")
public class Rating {
	
	@Id
	private String ratingId;
	
	private String userId;
	private int rating;
	private String hotel;
	private String feedback;

}
