package tekup.soap.Calculatrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import tekup.soap.wsdl.*;

import java.util.List;

@Service
public class CalculatriceService  implements ICalculatriceService {


    @Autowired
    private  CalculatriceRepository calculatriceRepository;

    @Override
    public CalculatriceEntity add(int number1, int number2) {
        Calculator calculator = new Calculator(); //created service object
        CalculatorSoap calculatorServiceSOAP = calculator.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result =calculatorServiceSOAP.add(number1,number2);

        CalculatriceEntity calculatriceEntity =new CalculatriceEntity();
        calculatriceEntity.setFirstNumber(number1);
        calculatriceEntity.setSecondNumber(number2);
        calculatriceEntity.setType("Add");
        calculatriceEntity.setResult(result);
        return this.calculatriceRepository.save(calculatriceEntity) ;
    }
    @Override
    public CalculatriceEntity substract(int number1,int number2) {
        Calculator calculator = new Calculator(); //created service object
        CalculatorSoap calculatorServiceSOAP = calculator.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result =calculatorServiceSOAP.subtract(number1,number2);

        CalculatriceEntity calculatriceEntity =new CalculatriceEntity();
        calculatriceEntity.setFirstNumber(number1);
        calculatriceEntity.setSecondNumber(number2);
        calculatriceEntity.setType("substract");
        calculatriceEntity.setResult(result);
        return this.calculatriceRepository.save(calculatriceEntity) ;    }

    @Override
    public CalculatriceEntity Division(int number1,int number2) {
        Calculator calculator = new Calculator(); //created service object
        CalculatorSoap calculatorServiceSOAP = calculator.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result =calculatorServiceSOAP.divide(number1,number2);

        CalculatriceEntity calculatriceEntity =new CalculatriceEntity();
        calculatriceEntity.setFirstNumber(number1);
        calculatriceEntity.setSecondNumber(number2);
        calculatriceEntity.setType("Divide");
        calculatriceEntity.setResult(result);
        return this.calculatriceRepository.save(calculatriceEntity) ;
    }
    @Override
    public CalculatriceEntity Multiplication(int number1,int number2) {
        Calculator calculator = new Calculator(); //created service object
        CalculatorSoap calculatorServiceSOAP = calculator.getCalculatorSoap(); //create SOAP object (a port of the service)
        int result =calculatorServiceSOAP.multiply(number1,number2);

        CalculatriceEntity calculatriceEntity =new CalculatriceEntity();
        calculatriceEntity.setFirstNumber(number1);
        calculatriceEntity.setSecondNumber(number2);
        calculatriceEntity.setType("Multiply");
        calculatriceEntity.setResult(result);
        return this.calculatriceRepository.save(calculatriceEntity) ;
    }

    @Override
    public List<CalculatriceEntity> findAll() {
        return this.calculatriceRepository.findAll();
    }

    @Override
    public CalculatriceEntity findById(Long id) {
        return this.calculatriceRepository.findById(id).get();
    }

}