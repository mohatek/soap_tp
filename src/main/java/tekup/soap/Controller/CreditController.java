package tekup.soap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tekup.soap.Credit.Credit;
import tekup.soap.Credit.ICreditService;

@RestController
@RequestMapping("/api/v1/credit")
public class CreditController {
    @Autowired
    private ICreditService creditService;
    @PostMapping ("/GénereCredit")
    private Credit GénereCredit() {
         return this.creditService.GénereCredit();
    }
}
