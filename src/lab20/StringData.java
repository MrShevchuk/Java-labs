package lab20;

import java.lang.reflect.Type;

public class StringData  extends AbstractData {

    Type type;
    String data;

    public <T extends AbstractData & Storable> StringData (Integer id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.read().toString();
    }
}
