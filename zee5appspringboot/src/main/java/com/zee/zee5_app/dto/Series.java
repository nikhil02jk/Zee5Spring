package com.zee.zee5_app.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.exception.InvalidNameException;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor

@Entity 
@Table(uniqueConstraints = {@UniqueConstraint(columnNames="Name")},name="series")
public class Series implements Comparable<Series> {
	
	
	
	@Id
	private String id;
	
	@NotBlank
	private String name;
	
	@Max(value=70)
	private int ageLimit;
	
	@NotBlank
	private String trailer;
	
	@NotBlank
	private String cast;
	
	@NotBlank
	private String genre;
	
	
	@NotNull
	private String releaseDate;
	
	@NotBlank
	private String language;
	
	@Min(value=1)
	private int noOfEpisodes;
	
	
	
	@Override
	public int compareTo(Series o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}

}
