package grupoexito.domain.transaction.elk;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Header<T> implements Serializable {
    private final String transactionId;
    private final String applicationId;
    private final Date transactionDate;
    private final T flexField; //como tiparlo (Json)

}
