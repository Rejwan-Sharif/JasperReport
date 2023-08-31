package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDA {
	
	PreparedStatement pst;
	Connection con;
	
	@Autowired
	Product product;
	
	public List<Product>getData(){
		
		List<Product>pList = new ArrayList<>();
	  
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "nh123456");
			pst = con.prepareStatement("select * from product");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {	
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setQuantity(rs.getInt(3));
				product.setPrice(rs.getDouble(4));
				pList.add(product);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return pList;
		
	}
	
	
	
	

}
