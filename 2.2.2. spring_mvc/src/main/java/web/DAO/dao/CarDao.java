package web.DAO.dao;

import web.DAO.model.Car;
import java.util.List;

public interface CarDao {
    List<Car> getCars(Integer count);
}
