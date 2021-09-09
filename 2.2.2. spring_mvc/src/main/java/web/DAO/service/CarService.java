package web.DAO.service;


import web.DAO.model.Car;
import java.util.List;

public interface CarService {
    List<Car> getCars(Integer count);
}
