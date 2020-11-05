public class Criteria {
	   public int minimumPrice;
	   public int maximumPrice;
	   public int minimumArea;
	   public int maximumArea;
	   public int minimumNumberOfBedrooms;
	   public int maximumNumberOfBedrooms;
	   
	   
	public Criteria(int minimumPrice, int maximumPrice, int minimumArea,
			int maximumArea, int minimumNumberOfBedrooms,
			int maximumNumberOfBedrooms) {
		super();
		this.minimumPrice = minimumPrice;
		this.maximumPrice = maximumPrice;
		this.minimumArea = minimumArea;
		this.maximumArea = maximumArea;
		this.minimumNumberOfBedrooms = minimumNumberOfBedrooms;
		this.maximumNumberOfBedrooms = maximumNumberOfBedrooms;
	}


	public int getMinimumPrice() {
		return minimumPrice;
	}


	public void setMinimumPrice(int minimumPrice) {
		this.minimumPrice = minimumPrice;
	}


	public int getMaximumPrice() {
		return maximumPrice;
	}


	public void setMaximumPrice(int maximumPrice) {
		this.maximumPrice = maximumPrice;
	}


	public int getMinimumArea() {
		return minimumArea;
	}


	public void setMinimumArea(int minimumArea) {
		this.minimumArea = minimumArea;
	}


	public int getMaximumArea() {
		return maximumArea;
	}


	public void setMaximumArea(int maximumArea) {
		this.maximumArea = maximumArea;
	}


	public int getMinimumNumberOfBedrooms() {
		return minimumNumberOfBedrooms;
	}


	public void setMinimumNumberOfBedrooms(int minimumNumberOfBedrooms) {
		this.minimumNumberOfBedrooms = minimumNumberOfBedrooms;
	}


	public int getMaximumNumberOfBedrooms() {
		return maximumNumberOfBedrooms;
	}


	public void setMaximumNumberOfBedrooms(int maximumNumberOfBedrooms) {
		this.maximumNumberOfBedrooms = maximumNumberOfBedrooms;
	}
	   
	

}
