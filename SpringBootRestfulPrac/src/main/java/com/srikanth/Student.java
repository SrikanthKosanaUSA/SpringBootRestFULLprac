package com.srikanth;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
		
		private int StudentID;
		private String FirstName;
		private String LastName;
			
			public int getStudentID() {
				return StudentID;
			}
			public void setStudentID(int studentID) {
				StudentID = studentID;
			}
			public String getFirstName() {
				return FirstName;
			}
			public void setFirstName(String firstName) {
				FirstName = firstName;
			}
			public String getLastName() {
				return LastName;
			}
			public void setLastName(String lastName) {
				LastName = lastName;
			}
			
		
		}


