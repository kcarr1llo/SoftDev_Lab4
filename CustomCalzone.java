import java.util.ArrayList;

public class CustomCalzone implements ICalzone {
    private String _name;
    private ArrayList<String> _stuffings = new ArrayList<String>();
    private String _crust = "Regular";
    private String _sauce = "Marinara";
    private double _payonline;
    private double _paywalkin;
    private boolean _online = false;
    private boolean _walkin = false;

    public CustomCalzone(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        String strPizza = "";
        strPizza += "Calzone name: " + _name + "\n";
        strPizza += "Crust: " + _crust + "\n";
        strPizza += "Sauce: " + _sauce + "\n";
        strPizza += "Toppings:\n";
        for (String s : _stuffings) {
            strPizza += "\t" + s + "\n";
        }
        strPizza += "Online Order? = " + _online + "\n";
        strPizza += "Walkin Order? = " + _walkin + "\n";
        return strPizza;
    }

    public void addStuffings(String topping) {
        _stuffings.add(topping);
    }

    public void selectCrust(String crust) {
        _crust = crust;
    }

    public void selectSauce(String sauce) {
        _sauce = sauce;
    }

    public void orderonline(boolean bOnline) {
        _online = bOnline;
    }

    public void orderwalkin(boolean bWalkin) {
        _walkin = bWalkin;
    }

    public void payonline(double cost) {
    }

    public void paywalkin(double cost) {
    }

}
