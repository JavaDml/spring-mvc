package web.DAO.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.DAO.model.Car;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> getCars(Integer count) {
        TypedQuery<Car> query=sessionFactory.getCurrentSession().createQuery("FROM Car");
        query.setMaxResults(count);
        return query.getResultList();
    }
}
