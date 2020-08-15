package pers.single.blog.user.dao;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import pers.single.blog.common.dto.User;

import javax.persistence.EntityManager;

@Repository
public class UserDao extends SimpleJpaRepository<User, String> {

    public UserDao(JpaEntityInformation<User, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    public UserDao(Class<User> domainClass, EntityManager em) {
        super(domainClass, em);
    }
}
