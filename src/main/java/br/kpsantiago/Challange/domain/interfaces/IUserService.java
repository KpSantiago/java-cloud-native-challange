package br.kpsantiago.Challange.domain.interfaces;

import br.kpsantiago.Challange.domain.entities.User;

import java.util.List;

public interface IUserService
{
    void create(User user);
    List<User> getAll();
    User getById(Long id);
}
