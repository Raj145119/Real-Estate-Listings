package application;

class House {
	
	
		   public String address;
		   public int price;
		   public int area;
		   public int numberOfBedrooms;

		   //constructor
		   public House(String addr, int p, int a, int bedroom) {
		       address = addr;
		       price = p;
		       area = a;
		       numberOfBedrooms = bedroom;
		   
		 }

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getArea() {
			return area;
		}

		public void setArea(int area) {
			this.area = area;
		}

		public int getNumberOfBedrooms() {
			return numberOfBedrooms;
		}

		public void setNumberOfBedrooms(int numberOfBedrooms) {
			this.numberOfBedrooms = numberOfBedrooms;
		}
		
		  //Compare price, area, and rooms
		public boolean satisfies(Criteria c) {
		       if ((price >= c.getMinimumPrice() && price <= c.getMaximumPrice())&&
		    		   (area >= c.getMinimumArea() && area <= c.getMaximumArea()) &&
		    		   (numberOfBedrooms >= c.getMinimumNumberOfBedrooms() && numberOfBedrooms <= c.getMaximumNumberOfBedrooms())
		    		   ) {
		           return true;
		       }
		       return false;
		   }
		   public String toString() {
		       return (address + " " + price + " " + area + " " + numberOfBedrooms);
		   }
	   
}

