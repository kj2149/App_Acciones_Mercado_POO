public class AdapterXMLtoJSon extends ActionJSon{
    ActionXML xml;

    public AdapterXMLtoJSon(ActionXML xml) {
        super(xml.getIdAction(), xml.getName(), xml.getPreis(), xml.getCurrency());
        this.xml = xml;
    }

@Override
    public void showJSonAction() {
        System.out.println("The XML format was adapted to JSon format");
        System.out.println("{\n" +
                "  \"idAction\": \"" + xml.getIdAction() + "\",\n" +
                "  \"name\": \"" + xml.getName() + "\",\n" +
                "  \"preis\": " + xml.getPreis() + ",\n" +
                "  \"currency\": \"" + xml.getCurrency() + "\"\n" +
                "}");
    }
}
