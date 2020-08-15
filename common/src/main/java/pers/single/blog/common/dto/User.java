package pers.single.blog.common.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "login_last")
    private Integer loginLast;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;

    public User(String username, String password, Integer loginLast, String email, String telephone) {
        this.username = username;
        this.password = password;
        this.loginLast = loginLast;
        this.email = email;
        this.telephone = telephone;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginLast() {
        return loginLast;
    }

    public void setLoginLast(Integer loginLast) {
        this.loginLast = loginLast;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
