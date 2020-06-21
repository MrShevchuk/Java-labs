package lab20.types;

import lab20.AbstractData;
import lab20.Storable;
import lab20.Type;

public class XmlData extends AbstractData implements Storable <XmlData> {

    static Type type = Type.XML;
    String data;

    public XmlData(long id, Type type, String data) {
        super(id);
        this.type = type;
        this.data = data.toString();
    }

    @Override
    public XmlData read() {
        return null;
    }

    @Override
    public void write(XmlData data) {
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public String toString() {
        return "XmlData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                '}';
    }
}
