package homework3.Abstract;

import homework3.Entity.Category;
public interface CategoryService {
	void add(Category category);
	void addBulk(Category[] categories);
	void update(Category category);
	void delete(Category category);
}
