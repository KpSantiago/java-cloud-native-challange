package br.kpsantiago.Challange.services;

import br.kpsantiago.Challange.domain.entities.User;
import br.kpsantiago.Challange.domain.interfaces.IUserService;
import br.kpsantiago.Challange.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user)
    {
        userRepository.save(user);
    }

    @Override
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id)
    {
        return userRepository.findById(id).orElseGet(() -> null);
    }
}
