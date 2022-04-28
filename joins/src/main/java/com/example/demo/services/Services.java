package com.example.demo.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.example.ifaces.CrudRepository;

public class Services implements CrudRepository<LoanApplication> {
	
private Connection con;
	
		
	
	public Services(Connection con) {
		super();
		this.con = con;
	}

	
	public List<LoanApplication> findAll() {
		
		List<LoanApplication> loanList=new ArrayList<LoanApplication>();
		
		String sql="select a.customer_id,a.customer_name,a.phone_number,a.credit_score,b.application_number,b.customer_ref,b.loan_amount from moni_customer a,moni_loan_application b where a.customer_id=b.customer_ref and a.customer_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int customerId=rs.getInt(1);
				String customerName = rs.getString(2);
				long phoneNumber = rs.getLong(3);
				double creditScore=rs.getDouble(4);

				int applicationNumber=rs.getInt(5);
				int customerRef=rs.getInt(6);
				double loanAmount =rs.getDouble(7);
				Customer cus= new Customer(customerId, customerName, phoneNumber, creditScore);
				LoanApplication prod=new LoanApplication(applicationNumber, cus, loanAmount);
				loanList.add(prod);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();		
		}
		
		return loanList;
		
	}


	@Override
	public int add(LoanApplication obj) {
		int rowAdded =0;
		String sql1="insert into moni_loan_application values(?,?,?)";
		String sql2="insert into moni_customer values(?,?,?,?)";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql1);
		PreparedStatement pstmt2=con.prepareStatement(sql2))
{
			pstmt2.setInt(1, obj.getCustomer().getCustomerId());
			pstmt2.setString(2, obj.getCustomer().getCustomer_name());
			pstmt2.setLong(3, obj.getCustomer().getPhoneNumber());
			pstmt2.setDouble(4, obj.getCustomer().getCreditScore());
			
			pstmt.setInt(1, obj.getApplicationNumber());
			pstmt.setInt(2, obj.getCustomer().getCustomerId());
			pstmt.setDouble(3, obj.getLoanAmount());
			pstmt2.executeUpdate();
			rowAdded=pstmt.executeUpdate();
			
			}catch (SQLException e) {
			e.printStackTrace();		
		}
		return rowAdded;
	}


	@Override
	public Optional<LoanApplication> findById(int id) {
		
		Optional<LoanApplication> obj=Optional.empty();
		String sql="select c.customer_id,c.customer_name,c.phone_number,c.credit_score,l.application_number,l.customer_ref,l.loan_amount from moni_customer c full outer join moni_loan_application l on c.customer_id=l.customer_ref where c.customer_id=? ";

		try(PreparedStatement prepstmt=con.prepareStatement(sql)){
			prepstmt.setInt(1, id);
			ResultSet rs=prepstmt.executeQuery();
			if(rs.next()) {
				int customerId=rs.getInt(1);
				String customerName=rs.getString(2);
				long phoneNumber=rs.getLong(3);
				double creditScore=rs.getDouble(4);
				int applicationNumber=rs.getInt(5);
				double loanAmount=rs.getDouble(6);
				Customer customer=new Customer(customerId, customerName, phoneNumber, creditScore);
				LoanApplication loan=new LoanApplication(applicationNumber, customer, loanAmount);
				obj=Optional.of(loan);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}
		
	

}
