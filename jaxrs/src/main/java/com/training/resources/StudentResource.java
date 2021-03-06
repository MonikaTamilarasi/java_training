package com.training.resources;

import java.util.List;
import java.util.Optional;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.training.model.Student;
import com.training.services.StudentService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.StatusType;

@Path("/Students")

public class StudentResource {
	
		private static StudentService service=new StudentService();
	
		public StudentResource() {
		super();
	    }


		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Student> getAllStudent() {
			return service.getAll();
		}
		
//		@GET
//		@Produces(MediaType.APPLICATION_JSON)
//		public Student getMessage() {
//			Student ram=new Student(101, "Ramesh", 98);
//			return ram;
//		}
		
		@GET
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response findById(@PathParam("rollNumber")int id) {
		
			try { 
				Student entity=service.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
				return Response.ok(entity).build();
				}catch(RuntimeException e){
					e.printStackTrace();
					return Response.status(400,e.getMessage()).build();
				}
		}
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		public Response add(Student student){
			boolean result= service.add(student);
			if(result) {
				return Response.ok(student).status(201).build();
			}else {
				return Response.status(400,"Not created").build();
			}
		}
		
		@DELETE
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response remove(@PathParam("rollNumber")int id) {
			boolean result= service.remove(id);
			if(result) {
				return Response.status(204,"One record with id "+id+"is deleted").build();
			}else {
				return Response.status(400,"Not deleted").build();
			}
		}
		
		
		
		@PUT
		@Path("/{rollNumber}")
		@Produces(MediaType.APPLICATION_JSON)
		public Student updateById(@PathParam("rollNumber") int id , Student newStudent)
		{
		return service.update(id, newStudent);
		}
	
}
