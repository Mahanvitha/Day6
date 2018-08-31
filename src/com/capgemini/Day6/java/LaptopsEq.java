package com.capgemini.Day6.java;

import java.util.Objects;

public class LaptopsEq {
		private String company;
		private String model;
		private String operatingSystem;
		private String processor;
		
		public LaptopsEq() {
			super();
		}
		
		
		public LaptopsEq(String company, String model, String operatingSystem, String processor) {
			super();
			this.company = company;
			this.model = model;
			this.operatingSystem = operatingSystem;
			this.processor = processor;
		}


		public String getCompany() {
			return company;
		}


		public void setCompany(String company) {
			this.company = company;
		}


		public String getModel() {
			return model;
		}


		public void setModel(String model) {
			this.model = model;
		}


		public String getOperatingSystem() {
			return operatingSystem;
		}


		public void setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
		}


		public String getProcessor() {
			return processor;
		}


		public void setProcessor(String processor) {
			this.processor = processor;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this == obj)
				return true;
			if(obj == null)
				return false;
			if(this.getClass() != obj.getClass())
				return false;
			
			LaptopsEq c2 = (LaptopsEq) obj;
			return this.company == c2.company && this.model == c2.model;
						
		}	

		@Override
		public int hashCode() {
			return Objects.hash(company,model);
		}

		public String toString() {
			return company+"\n"+model+"\n"+operatingSystem+"\n"+processor;
		}
		}
