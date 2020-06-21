package lab20.types;

import lab20.AbstractData;
import lab20.Storable;
import lab20.Type;

public class NumericData extends AbstractData implements Storable <Number> {

    static Type type = Type.NUM;
    Double data;

    public NumericData(long id, Type type, Double data) {
        super(id);
        this.type = type;
        this.data = data;
    }



    @Override
    public void write(Number data) {
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Number read() {
        return this.data;
    }

    @Override
    public String toString() {
        return "NumericData{" +
                "type=" + type +
                ", data=" + data +
                '}';
    }
}
