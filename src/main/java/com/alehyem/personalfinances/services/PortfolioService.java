package com.alehyem.personalfinances.services;

import com.alehyem.personalfinances.entity.Portfolio;
import org.hibernate.service.spi.ServiceException;

import java.util.List;

public interface PortfolioService extends CrudService<Portfolio, Integer> {
    List<Portfolio> findAllUserPortfolios(int UserId) throws ServiceException;
}
