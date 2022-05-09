package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;
import com.example.util.ConnectionFactory;

public class ProductService {
	
	
	private Connection con;
	
	
	public ProductService() {
		super();
		this.con = ConnectionFactory.getOracleConnection();
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
	
	
	public void usingTxn(Product prd1,Product prd2) {
		String sql="insert into moni_product values(?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			con.setAutoCommit(false);
			pstmt.setInt(1, prd1.getProductId());
			pstmt.setString(2, prd1.getProductName());
			pstmt.setDouble(3,prd1.getPrice());
			
			pstmt.setInt(1, prd2.getProductId());
			pstmt.setString(2, prd2.getProductName());
			pstmt.setDouble(3,prd2.getPrice());
			
			int rowAdded=pstmt.executeUpdate();

			if(prd2.getPrice()>prd1.getPrice()) {
			con.commit();
			}else {
				con.rollback();
			}
			
			System.out.println("Row Added : "+rowAdded);
			
		}catch (Exception e) {
				e.printStackTrace();			
		}
		
	}
	
//	public void usingTxnWithCatchBlock(Product prd1,Invoice prd2) {
//		String addProductsql="insert into moni_product values(?,?,?)";
//		String addInvoicesql="insert into moni_invoice values(?,?,?,?)";
//
//		try(PreparedStatement pstmt=con.prepareStatement(addProductsql);
//				PreparedStatement pstmt2=con.prepareStatement(addInvoicesql)){
//			
//			con.setAutoCommit(false);
//			pstmt.setInt(1, prd1.getProductId());
//			pstmt.setString(2, prd1.getProductName());
//			pstmt.setDouble(3,prd1.getPrice());
//			
//			int productAddCount=pstmt.executeUpdate();
//			
//			pstmt2.setInt(1,prd2.getInvoiceNumber());
//			pstmt2.setString(2, prd2.getInvoiceName());
//			pstmt2.setDouble(3, prd2.getQuantity());
//			pstmt2.setInt(4, prd2.getProductref());
//			
//			int invoiceAdded=pstmt2.executeUpdate();
//			
//			con.commit();
//			System.out.println("Row Added : "+productAddCount+","+invoiceAdded);
//			
//		}catch (Exception e) {
//				e.printStackTrace();
//				
//				try {
//					con.rollback();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//		}
//		
//	}

}
