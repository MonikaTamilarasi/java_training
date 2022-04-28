package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductService {
	private Connection con;
	
		
	
	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	
	public int deleteById(int id) {
		String sql="delete from moni_product where product_id=?";
		
		int rowsDeleted=0;
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setInt(1,id);
			rowsDeleted =pstmt.executeUpdate();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return rowsDeleted;
	}
	
	
	public Optional<Product> findById(int id) {
		String sql="select* from moni_product where product_id=?";
		
		 Optional<Product> obj=Optional.empty();
		try 
			(PreparedStatement pstmt=con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			ResultSet result=pstmt.executeQuery();
			
			if(result.next()) {
				int productId=result.getInt("product_id");
				String productName=result.getString("product_name");
				double price =result.getDouble("price");
				Product prod=new Product(productId,productName,price);
				obj=Optional.of(prod);
			}

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}
	
	
	
	public int addProduct(Product product) {
		int rowAdded=0;
		String sql="insert into moni_product values(?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3,product.getPrice());
			rowAdded =pstmt.executeUpdate();
			
			
			}catch (SQLException e) {
			e.printStackTrace();		
		}
		return rowAdded;
	}
	
	
	public int updatePriceByName(String productName,double newPrice) {
		int rowUpdated=0;
		
		String sql="update moni_product set price=? where product_name=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setString(2,productName);
			pstmt.setDouble(1,newPrice);
			rowUpdated=pstmt.executeUpdate();
			
			
			}catch (SQLException e) {
			e.printStackTrace();		
		}
		return rowUpdated;
	}
	
	
	public List<Product> findAll(){
		List<Product> productList=new ArrayList<Product>();
		
		String sql="select * from moni_product";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int productId=rs.getInt("product_id");
				String productName=rs.getString("product_name");
				double price =rs.getDouble("price");
				Product prod=new Product(productId,productName,price);
				productList.add(prod);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();		
		}
		
		return productList;
		
	}
}
