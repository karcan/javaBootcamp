package homework3.Concrete;

import java.util.ArrayList;

import homework3.Abstract.CategoryService;
import homework3.Entity.Category;

public class CategoryManager implements CategoryService {

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " : eklenmiştir.");
		
	}
	
	@Override
	public void addBulk(Category[] categories) {
		for (Category category : categories) {
			this.add(category);
		}		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getName() + " : güncellenmiştir.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName() + " : silinmiştir.");
		
	}

	@Override
	public ArrayList<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
