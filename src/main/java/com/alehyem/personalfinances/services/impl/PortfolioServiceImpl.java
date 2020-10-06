package com.alehyem.personalfinances.services.impl;

import com.alehyem.personalfinances.dao.PortfolioDAO;
import com.alehyem.personalfinances.entity.Portfolio;
import com.alehyem.personalfinances.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    private PortfolioDAO portfolioDAO;

    @Override
    @Transactional
    public List<Portfolio> findAll() {
        return portfolioDAO.findAll();
    }

    @Override
    @Transactional
    public List<Portfolio> findAllUserPortfolios(int userId) {
        return portfolioDAO.findAllUserPortfolios(userId);
    }

    @Override
    @Transactional
    public Portfolio findById(Integer id) {
        return portfolioDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Portfolio object) {
        portfolioDAO.save(object);
    }

    @Override
    @Transactional
    public Portfolio update(Portfolio object) {
        return portfolioDAO.update(object);
    }

    @Override
    @Transactional
    public void delete(Portfolio object) {
        portfolioDAO.delete(object);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        portfolioDAO.deleteById(id);
    }
}
