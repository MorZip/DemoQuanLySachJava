package hutech.NguyenHoangDan.demo.validator;

import hutech.NguyenHoangDan.demo.repository.IUserRepository;
import hutech.NguyenHoangDan.demo.validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import hutech.NguyenHoangDan.demo.repository.IUserRepository;
import hutech.NguyenHoangDan.demo.validator.annotation.ValidUsername;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}