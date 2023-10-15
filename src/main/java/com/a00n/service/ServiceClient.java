/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.a00n.service;

import com.a00n.dao.IDao;
import com.a00n.entities.Client;
import com.a00n.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ay0ub
 */
public class ServiceClient implements IDao<Client> {

    @Override
    public boolean create(Client o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;

    }

    @Override
    public boolean delete(Client o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.remove(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Client o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Client getById(int id) {
        Client c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = session.get(Client.class, id);
        session.getTransaction().commit();
        return c;
    }

    @Override
    public List<Client> getAll() {
        List<Client> clients = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        clients = session.createSelectionQuery("from Client", Client.class).getResultList();
        session.getTransaction().commit();
        return clients;
    }

    public Client getByEmail(String email) {
        Client c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = session.createSelectionQuery("from Client where email = :email", Client.class).setParameter("email", email).uniqueResult();
        session.getTransaction().commit();
        return c;
    }

}
