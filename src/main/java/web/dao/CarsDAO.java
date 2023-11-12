package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("model1", 1111, 100));
        cars.add(new Car("model2", 2222, 200));
        cars.add(new Car("model3", 3333, 300));
        cars.add(new Car("model4", 4444, 400));
        cars.add(new Car("model5", 5555, 500));
    }

    public List<Car> getCarsByNumber(int number) {
        return cars.stream().limit(number).toList();
    }
}
