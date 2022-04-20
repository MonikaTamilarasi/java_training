package com.example;

import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferentClasses {

	public static void main(String[] args) {
		
		//1.Creating util date
		java.util.Date date1=new java.util.Date();
		//java.util.Date date2=new java.util.Date(10203098789);
		System.out.println(date1);
		
		
		//2.util to SQL date
		java.sql.Date date2=new java.sql.Date(date1.getTime());
		System.out.println(date2);
		
		
		//3.SQl Date to Localdate
		LocalDate localdate=date2.toLocalDate();
		System.out.println(localdate.getDayOfWeek());
		System.out.println(localdate.getMonthValue());
		
		
		//local date to sql date
		java.sql.Date sqlDate2= java.sql.Date.valueOf(localdate);
		System.out.println("SQL date 2:"+sqlDate2);

	}

}
