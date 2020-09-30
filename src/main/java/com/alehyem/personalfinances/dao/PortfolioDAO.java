package com.alehyem.personalfinances.dao;

import com.alehyem.personalfinances.dao.exceptions.DAOException;
import com.alehyem.personalfinances.entity.Portfolio;

import java.util.List;

public interface PortfolioDAO extends CrudDAO<Portfolio, Integer> {

    List<Portfolio> findAllUserPortfolios(int UserId) throws DAOException;
}
