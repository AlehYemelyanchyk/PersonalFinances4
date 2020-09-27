package com.alehyem.personalfinances.dao;

import com.alehyem.personalfinances.dao.exceptions.DAOException;
import com.alehyem.personalfinances.entity.Portfolio;

import java.util.List;

public interface PortfolioDAO {

    List<Portfolio> getAllPortfolios() throws DAOException;

    List<Portfolio> getAllUserPortfolios(int UserId) throws DAOException;

    Portfolio getPortfolio(int portfolioId) throws DAOException;

    void savePortfolio(Portfolio portfolio) throws DAOException;

    void updatePortfolio(Portfolio portfolio, String[] params) throws DAOException;

    void removePortfolio(int portfolioId) throws DAOException;

}
