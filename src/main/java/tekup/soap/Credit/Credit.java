package tekup.soap.Credit;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Credit {

    private Long id;
    private String uid;
    private String credit_card_number;
    private String credit_card_expiry_date;
    private String credit_card_type;

}
