package demos.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demos.springboot.model.Category;
import demos.springboot.model.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
