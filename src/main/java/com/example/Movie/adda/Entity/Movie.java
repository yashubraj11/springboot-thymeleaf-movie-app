package com.example.Movie.adda.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
@Column(columnDefinition ="TEXT")
private String image;
private String trailer;
private String rating;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getTrailer() {
	return trailer;
}
public void setTrailer(String trailer) {
	this.trailer = trailer;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
}
