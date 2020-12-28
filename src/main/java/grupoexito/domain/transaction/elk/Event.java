package grupoexito.domain.transaction.elk;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder(toBuilder = true)
public class Event<T> implements Serializable {
    private final Header header;
    private transient T data;
}
