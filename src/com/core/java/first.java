package com.core.java;

			class students{
			
				int S_id;
				String  S_name;
				static String S_nation="INDIA";
			}

	
			public class first {
			public static void main(String[] args) {
			students f1= new students();
			f1.S_id=001;
			f1.S_name="HARDEEP SINGH";
			students f2= new students();
			f2.S_id=002;
			f2.S_name="DEEP SINGH";
			System.out.println(f1.S_id);
			System.out.println(f1.S_name);
			System.out.println(f1.S_nation);
			System.out.println(f2.S_id);
			System.out.println(f2.S_name);
			System.out.println(f2.S_nation);
			System.out.println();
			
			}
			}