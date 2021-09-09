package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.model.Car;
import web.DAO.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping ("/cars")
    public String GetCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {

        Integer localCount = ((count == null) || (count >= 5)) ? 5 : count;
        List<Car> listCars = carService.getCars(localCount);
        model.addAttribute("Cars", listCars);
        return "cars";
    }
}
