package hutech.NguyenHoangDan.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import hutech.NguyenHoangDan.demo.enity.Category;
import hutech.NguyenHoangDan.demo.validator.annotation.ValidCategoryId;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != 0L;
    }
}
