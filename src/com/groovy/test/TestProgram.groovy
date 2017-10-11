package com.groovy.test;
import groovy.json.JsonSlurper; 
class TestProgram {

	static void main(String[] args) {
		
		println("Hello World");
		
		def name = "Gopi";
	
		println("Hello World"+name);
		
		
		  def lst = [1,2,3,4, 22, 23, 43, 424, 24];
	      lst.each {println it}
	      println("The list will only display those numbers which are divisible by 2")
	      lst.each{num -> if(num % 2 == 0) println num}
	      
	        println("-----------------")
	      def jsonSlurper = new JsonSlurper()
	      def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}') 
			
	      println(object.name);
	      println(object.ID);
		
	}

}
