package grupoexito.domain.transaction.elk;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class TransactionELK<T> implements Serializable {

    private final String transactionId;
    private final String integrationName;
    private final String domainName;
    private final String operation;
    private final String type;
    private final Date timeStamp;
    private final Message<T> event;
    private final String status;
    private final String trace;
    private final Integer messagesIn;
    private final Integer messagesBlocks;
    private final Integer messagesOut;
    private final Integer messagesError;
    private final Integer messagesFilter;
    private final Integer response_time;
    private final String mensaje_resultado;

}
