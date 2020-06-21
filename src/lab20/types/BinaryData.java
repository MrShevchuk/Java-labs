package lab20.types;

import lab20.AbstractData;
import lab20.Storable;
import lab20.Type;

import java.util.Arrays;

public class BinaryData extends AbstractData implements Storable <BinaryData> {

    static Type type = Type.BIN;
    BinaryData [] arrBin;

    public BinaryData(long id, Type type, BinaryData [] arrBin) {
        super(id);
        this.type = type;
        this.arrBin = arrBin;
    }



    @Override
    public BinaryData read() {
        return null;
    }

    @Override
    public void write(BinaryData data) {

    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public String toString() {
        return "BinaryData{" +
                "type=" + type +
                ", arrBin=" + Arrays.toString(arrBin) +
                '}';
    }
}
