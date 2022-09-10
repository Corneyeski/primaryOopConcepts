package entities;

import entities.enums.Colors;
import entities.enums.Tastes;

import java.util.Date;

import static entities.enums.Colors.RED;
import static entities.enums.Tastes.SWEET;

public class Apple extends Fruit {

    private String name;
    private Date expirationDate;
    private String provider;


    /**
     * Default apple
     */
    public Apple() {
        super(RED, "tree", SWEET);
    }

    /**
     * if the constructor of the superclass was empty, we could call it by just saying super() like the next example
     */
    /*public Apple() {
        super();
    }
    */
    public Apple(Colors color, String family, Tastes taste, String name, Date expirationDate, String provider) {
        super(color, family, taste);
        this.name = name;
        this.expirationDate = expirationDate;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}