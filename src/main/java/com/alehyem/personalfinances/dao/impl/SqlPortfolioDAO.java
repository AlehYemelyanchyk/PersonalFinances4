package com.alehyem.personalfinances.dao.impl;

import com.alehyem.personalfinances.dao.PortfolioDAO;
import com.alehyem.personalfinances.entity.Portfolio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlPortfolioDAO implements PortfolioDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Portfolio> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Portfolio> query = session.createQuery("from Portfolio order by name", Portfolio.class);
        List<Portfolio> portfolioList = query.getResultList();
        return portfolioList;
    }

    @Override
    public List<Portfolio> findAllUserPortfolios(int userId) {
        return null;
    }

    @Override
    public Portfolio findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Portfolio.class, id);
    }

    @Override
    public void save(Portfolio object) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(object);
    }

    @Override
    public Portfolio update(Portfolio object) {
        return null;
    }

    @Override
    public void delete(Portfolio object) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Portfolio where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
