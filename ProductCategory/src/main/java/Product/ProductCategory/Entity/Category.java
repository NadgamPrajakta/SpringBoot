package Product.ProductCategory.Entity;

public class Category {
	
	String categoryId;
	String categoryName;
	String description;
	boolean active;
	
	public Category(String categoryId, String categoryName, String description, boolean active) {
		
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
		this.active = active;
		
	}
	
	public String getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	
	}
	
	public String getDescription() {
		return description;
		
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

}
