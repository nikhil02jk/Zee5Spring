package com.zee.zee5_app.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.exception.InvalidNameException;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity 
@Table(name="movie")
public class Movie implements Comparable<Movie>{
	
	

	
	@Id
	private String id;
	
	@NotBlank
	private String name;
	
	@Max(value=70)
	private int ageLimit;
	
	@NotBlank
	private String cast;
	
	@NotBlank
	private String genre;
	
	private float length;
	
	@NotBlank
	private String trailer;
	
	@NotNull
	private String releaseDate;
	
	@NotBlank
	private String language;
	
	
	
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}

}
