package com.training.model;

import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client=ClientBuilder.newClient();
		
		WebTarget target=client.target("http://localhost:8080/products");
		Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON);
		Response resp=builder.get();

		int ch = 3;
		if(ch==4) {
		Product[] list=resp.readEntity(Product[].class);
		for(Product eachProduct:list) {
		System.out.println(eachProduct);		
		}
		}
		//find all
		if(ch==1) {
			String object=resp.readEntity(String.class);
			System.out.println(object);
		}
		
		//find by id
		if(ch==2) {
			WebTarget findByIdTarget = target.path("/srch/96");
			Invocation.Builder builder2=findByIdTarget.request(MediaType.APPLICATION_JSON);
			Response findByResp=builder2.get();

			Product object=findByResp.readEntity(Product.class);
			System.out.println(object);
		}
		
		//for addding
		if(ch==3) {
			Product toAdd=new Product(95, "mmmm", 4000);
			Response response=builder.post( Entity.entity(toAdd, MediaType.APPLICATION_JSON));
			System.out.println(response);
		}
		
	}

}
