package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSucessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String SellerName;
	private Long visited;
	private long deals;
	
	public SaleSucessDTO() {
	}

	

	public SaleSucessDTO(Seller seller, Long visited, long deals) {
		SellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}



	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}



	public Long getVisited() {
		return visited;
	}



	public void setVisited(Long visited) {
		this.visited = visited;
	}



	public long getDeals() {
		return deals;
	}



	public void setDeals(long deals) {
		this.deals = deals;
	}
	 
}
