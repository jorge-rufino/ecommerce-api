package com.rufino.ecommerceapi.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("price")
	private BigDecimal price;
	
	@JsonProperty("category")
	private String category;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("image")
	private String image;
	
}
