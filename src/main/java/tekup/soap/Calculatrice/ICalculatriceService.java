package tekup.soap.Calculatrice;

import java.util.List;

public interface ICalculatriceService {


    public CalculatriceEntity add(int number1, int number2);
    public CalculatriceEntity substract(int number1,int number2);
    public CalculatriceEntity Division(int number1,int number2);
    public CalculatriceEntity Multiplication(int number1,int number2);
    public List<CalculatriceEntity> findAll();
    public CalculatriceEntity findById(Long id);
}
