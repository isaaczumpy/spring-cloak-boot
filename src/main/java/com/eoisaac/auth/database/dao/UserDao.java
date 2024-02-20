package com.eoisaac.auth.database.dao;

import com.eoisaac.auth.database.DBSessionFactory;
import com.eoisaac.auth.database.models.CustomUserModel;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class UserDao {

    public Optional<CustomUserModel> getById(String id) {
        try (Session session = DBSessionFactory.getSession()) {
            if (session != null) {
                return session
                        .createQuery(
                                "from CustomUserModel where id = :id", CustomUserModel.class)
                        .setParameter("id", id)
                        .uniqueResultOptional();
            } else {
                System.out.println("Session not created");
                return Optional.empty();
            }
        }
    }

    public List<CustomUserModel> getAll() {
        try (Session session = DBSessionFactory.getSession()) {
            if (session != null) {
                return session
                        .createQuery("from CustomUserModel", CustomUserModel.class)
                        .list();
            } else {
                System.out.println("Session not created");
                return null;
            }
        }
    }
}

