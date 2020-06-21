//package lab20;
//
//import lab20.types.BinaryData;
//import lab20.types.NumericData;
//import lab20.types.XmlData;
//
//import static lab20.DocumentProcessorUtil.build;
//
//
///**
// * Create Main method.
// * Create 3 Objects and concat them with StringData.
// */
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        XmlData xml = new XmlData(DocumentProcessorUtil.ID_COUNTER++,Type.XML, "<?xml version=\"1.0\"?><Tests>qwerty</Tests>");
//        BinaryData bin = new BinaryData(DocumentProcessorUtil.ID_COUNTER++, Type.BIN, new BinaryData[Byte.parseByte("Данные в байтах")]);
//        NumericData num = new NumericData(DocumentProcessorUtil.ID_COUNTER++, Type.NUM, 123.456789);
//
//        build(xml, );
//        build(bin, );
//        build(num, );
//
//        DocumentProcessorUtil.convert(xml);
//        DocumentProcessorUtil.convert(bin);
//        DocumentProcessorUtil.convert(num);
//
//        System.out.println("XML data: " + xml);
//        System.out.println("Binary data: " + bin);
//        System.out.println("Numeric data: " + num);
//    }
//}
