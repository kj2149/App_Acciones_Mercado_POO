public class ActionXML {
    private String idAction;
    private String name;
    private double preis;
    private String currency;

    public ActionXML(String idAction, String name, double preis, String currency) {
        this.idAction = idAction;
        this.name = name;
        this.preis = preis;
        this.currency = currency;
    }

    public String getIdAction() {
        return idAction;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public String getCurrency() {
        return currency;
    }

    public void showXMLAction() {
        System.out.println("<action>\n" +
                "     <idAction><" + idAction + ">\n" +
                "     <name><" + name + ">\n" +
                "     <preis><" + preis +">\n"+
                "     <currency><" + currency + ">\n" +
                "<action>");
    }

}
