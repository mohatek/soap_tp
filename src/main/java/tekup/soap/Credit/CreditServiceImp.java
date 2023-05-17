package tekup.soap.Credit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CreditServiceImp implements ICreditService {

    @Override
    public Credit GénereCredit() {
        RestTemplate rest = new RestTemplate();
        Credit result = rest.getForObject("https://random-data-api.com/api/v2/credit_cards", Credit.class);
        return result;
    }

}