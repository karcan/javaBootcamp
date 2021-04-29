package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.constant.Message;
import homework.model.Category;

public class CategoryService {
	
	List<Category> _categories;
	
	public CategoryService() {
		this._categories = new ArrayList<Category>();
		
		this._categories.add(new Category(1,"Java"));
		this._categories.add(new Category(2,"C#"));

	}
	
	public void add(Category category) {
		
		this._categories.add(category);
		System.out.println(category.getName() + " "  + Message.Added);
	}
	
	public void update(Category category) {
		
		int courseIndex = this._categories.indexOf(category);
		
		this._categories.set(courseIndex, category);
		System.out.println(category.getName() + " " + Message.Updated);
	}
	
	public void delete(Category category) {
		
		int courseIndex = this._categories.indexOf(category);
		
		this._categories.remove(courseIndex);
		System.out.println(category.getName() + " " + Message.Deleted);
	}
	
	public Category getById(int id) {
		return this._categories.stream().filter(c -> c.getId() == id).findFirst().get();
	}
	
	public List<Category> getAll() {
		return _categories;
	}
}
