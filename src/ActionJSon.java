public class ActionJSon {
    private String idAction;
    private String name;
    private double preis;
    private String currency;

    public ActionJSon(String idAction, String name, double preis, String currency) {
        this.idAction = idAction;
        this.name = name;
        this.preis = preis;
        this.currency = currency;
    }
    public ActionJSon(){

    }
    

    public void showJSonAction() {
        System.out.println("{\n" +
                "  \"idAction\": \"" + idAction + "\",\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"preis\": " + preis + ",\n" +
                "  \"currency\": \"" + currency + "\"\n" +
                "}");
    }


}
