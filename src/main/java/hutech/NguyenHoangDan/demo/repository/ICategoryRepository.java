package hutech.NguyenHoangDan.demo.repository;

import hutech.NguyenHoangDan.demo.enity.Category;
import hutech.NguyenHoangDan.demo.enity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Long> {
}
