package ub.nosql.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NosqlEComApplication {

	public static void main(String[] args) {
		SpringApplication.run(NosqlEComApplication.class, args);
		
	}
	

	public static String apiKey= "AIzaSyBexitixHOmw5hDEDXELRZmg2cCTUWP-6U";
	public static String authDomain= "nosql-ee947.firebaseapp.com";
	public static String databaseURL= "https://nosql-ee947.firebaseio.com";
	public static String projectId= "nosql-ee947";
	public static String storageBucket= "nosql-ee947.appspot.com";
	public static String messagingSenderId= "41955525961";

}
