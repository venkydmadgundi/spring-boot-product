package com.example.simple.web.model;
import java.util.List;

public class ProductResponse {
	
	private int numberPage;
	private int totalCount;
	private List<Product> productList;

	public ProductResponse(int totalCount, int numberPage, List<Product> productList){
		this.totalCount = totalCount;
		this.numberPage = numberPage;
		this.productList = productList;
	}

	public int getNumberPage()   
	{  
		return numberPage;  
	}
	
	public void setNumberPage(int numberPage)   
	{  
		this.numberPage = numberPage;  
	}

	public int getTotalCount()   
	{  
		return totalCount;  
	}
	
	public void setTotalCount(int totalCount)   
	{  
		this.totalCount = totalCount;  
	}

	public List<Product> getProductList()   
	{  
		return productList;  
	}
	
	public void setProductList(List<Product> productList)   
	{  
		this.productList = productList;  
	}

}
