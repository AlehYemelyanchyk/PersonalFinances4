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
    public List<Portfolio> findAllUserPortfolios(int UserId) {
        return null;
    }

    @Override
    public Portfolio findById(Integer integer) {
        return null;
    }

    @Override
    public Portfolio save(Portfolio object) {
        return null;
    }

    @Override
    public Portfolio update(Portfolio object) {
        return null;
    }

    @Override
    public void delete(Portfolio object) {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
