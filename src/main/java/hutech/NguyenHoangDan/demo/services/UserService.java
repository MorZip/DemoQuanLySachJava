package hutech.NguyenHoangDan.demo.services;

import hutech.NguyenHoangDan.demo.enity.User;
import hutech.NguyenHoangDan.demo.repository.IUserRepository;
import hutech.NguyenHoangDan.demo.enity.User;
import hutech.NguyenHoangDan.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public void save(User user){ userRepository.save(user);}
}
