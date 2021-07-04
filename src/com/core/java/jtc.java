package com.core.java;

       class a{
    	   int a=10;
    	   static int b=20;
       {
    	   System.out.println(a);
    	   System.out.println(b);
    	  System.out.println("IB in CLASS A");
       }
     static {
    	   System.out.println("******");
    	   System.out.println(b);
    	  System.out.println("STATIC in CLASS A");
    	  System.out.println("******");
       }

       }
		public class jtc {
		
			public static void main(String[] args) {
				
				a a1= new a();
				a a2= new a();
				a a3= new a();
			}
		}
