package com.alehyem.personalfinances.controllers;

import com.alehyem.personalfinances.dao.PortfolioDAO;
import com.alehyem.personalfinances.dao.exceptions.DAOException;
import com.alehyem.personalfinances.entity.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PortfolioController {

    @Autowired
    private PortfolioDAO portfolioDAO;

    @RequestMapping("/list")
    public String getList(Model model) {

        List<Portfolio> portfoliosList;
        try {
            portfoliosList = portfolioDAO.getAllPortfolios();
            model.addAttribute("portfoliosList", portfoliosList);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return "portfolios-list";
    }
}
