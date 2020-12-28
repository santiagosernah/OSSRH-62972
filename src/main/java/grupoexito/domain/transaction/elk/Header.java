package grupoexito.domain.transaction.elk;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Header implements Serializable {
    private final String transactionId;
    private final String applicationId;
    private final Date transactionDate;
    private final FlexField flexField; //como tiparlo (Json)

}
