package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count",required = false) Integer count, Model model ){

        ArrayList<Car> carOut = new ArrayList();
        Car car = new Car();
        carOut = car.getCarList();

        System.out.println(count);
        //if (count == null || count > carOut.size())  {
            System.out.println(carOut.toString());
            model.addAttribute("rez", carOut.subList(0, ((count == null || count > carOut.size()) ? carOut.size() : count)));
            return "cars";

    }

}
