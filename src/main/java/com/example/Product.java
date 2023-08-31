package com.example;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	
	private int id;
	private String name;
	private int quantity;
	private double price;
		
}
