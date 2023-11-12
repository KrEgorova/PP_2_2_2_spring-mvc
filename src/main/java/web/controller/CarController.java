package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDAO;


@Controller
public class CarController {
    private CarsDAO carsDAO;

    @Autowired
    public CarController(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carsDAO.getCarsByNumber(count));
        return "cars";
    }
}
