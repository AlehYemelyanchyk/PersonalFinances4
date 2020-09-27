package com.alehyem.personalfinances.dao.impl;

import com.alehyem.personalfinances.dao.PortfolioDAO;
import com.alehyem.personalfinances.dao.exceptions.DAOException;
import com.alehyem.personalfinances.entity.Portfolio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class SqlPortfolioDAO implements PortfolioDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public List<Portfolio> getAllPortfolios() throws DAOException {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Portfolio> query = currentSession.createQuery("from Portfolio", Portfolio.class);
        List<Portfolio> portfolioList = query.getResultList();
        return portfolioList;
    }

    @Override
    public List<Portfolio> getAllUserPortfolios(int UserId) throws DAOException {
        return null;
    }

    @Override
    public Portfolio getPortfolio(int portfolioId) throws DAOException {
        return null;
    }

    @Override
    public void savePortfolio(Portfolio portfolio) throws DAOException {

    }

    @Override
    public void updatePortfolio(Portfolio portfolio, String[] params) throws DAOException {

    }

    @Override
    public void removePortfolio(int portfolioId) throws DAOException {

    }
}
