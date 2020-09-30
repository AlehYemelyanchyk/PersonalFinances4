package com.alehyem.personalfinances.controllers;

import com.alehyem.personalfinances.entity.Portfolio;
import com.alehyem.personalfinances.services.PortfolioService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @RequestMapping("/list")
    public String getList(Model model) {

        List<Portfolio> portfoliosList;
        try {
            portfoliosList = portfolioService.findAll();
            model.addAttribute("portfoliosList", portfoliosList);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return "portfolios/list";
    }
}
