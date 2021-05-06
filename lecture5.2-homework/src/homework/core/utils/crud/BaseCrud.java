package homework.core.utils.crud;

import java.util.List;
import java.util.function.Predicate;

public interface BaseCrud<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	T get(Predicate<T> predicate);
	List<T> getAll();
	List<T> getAll(Predicate<T> predicate);
}
