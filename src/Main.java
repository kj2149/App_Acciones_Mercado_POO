public class Main {
    public static void main(String[] args) {

        ActionXML apple= new ActionXML("123","Apple inc.",180,"USD");
        apple.showXMLAction();

        AdapterXMLtoJSon appleJSON= new AdapterXMLtoJSon(apple);;
        appleJSON.showJSonAction();

        ActionXML google= new ActionXML("456","Google Co.",260,"USD");
        google.showXMLAction();

        AdapterXMLtoJSon googleJSon = new AdapterXMLtoJSon(google);
        googleJSon.showJSonAction();
    }
}