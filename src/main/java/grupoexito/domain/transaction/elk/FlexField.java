package grupoexito.domain.transaction.elk;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class FlexField implements Serializable {
    private final String key;
    private final String value;
    private final List list;
}
