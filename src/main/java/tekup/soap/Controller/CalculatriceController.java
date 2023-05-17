package tekup.soap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tekup.soap.Calculatrice.CalculatriceEntity;
import tekup.soap.Calculatrice.ICalculatriceService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/calculatrice")
public class CalculatriceController {
    @Autowired
    private ICalculatriceService calculatriceService;

    @PostMapping("/add/{number1}/{number2}")
    public CalculatriceEntity add(@PathVariable int number1, @PathVariable int number2 ) {
        return calculatriceService.add(number1,number2);
    }

    @PostMapping("/soustract/{number1}/{number2}")
    public CalculatriceEntity soustract(@PathVariable int number1, @PathVariable int number2 ){
        return calculatriceService.substract(number1,number2);
    }
    @PostMapping("/multiplication/{number1}/{number2}")
    public CalculatriceEntity Multiplication(@PathVariable int number1, @PathVariable int number2 ){
        return calculatriceService.Multiplication(number1,number2);
    }

    @PostMapping("/division/{number1}/{number2}")
    public CalculatriceEntity Division(@PathVariable int number1, @PathVariable int number2) {
        return calculatriceService.Division(number1,number2);
    }


    @GetMapping("/findAll")
    public List<CalculatriceEntity> findAll() {
        return calculatriceService.findAll();
    }

    @GetMapping("/findById/{id}")
    public CalculatriceEntity findById(@PathVariable Long id) {
        return calculatriceService.findById(id);
    }


}
