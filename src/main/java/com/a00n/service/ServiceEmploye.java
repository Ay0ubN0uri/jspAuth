/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.a00n.service;

import com.a00n.dao.IDao;
import com.a00n.entities.Employe;
import com.a00n.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ay0ub
 */
public class ServiceEmploye implements IDao<Employe> {

    @Override
    public boolean create(Employe o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;

    }

    @Override
    public boolean delete(Employe o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.remove(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Employe o) {
        return true;
    }

    @Override
    public Employe getById(int id) {
        Employe c = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        c = session.get(Employe.class, id);
        session.getTransaction().commit();
        return c;
    }

    @Override
    public List<Employe> getAll() {
        List<Employe> employes = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        employes = session.createSelectionQuery("from Employe", Employe.class).getResultList();
        session.getTransaction().commit();
        return employes;
    }
}
