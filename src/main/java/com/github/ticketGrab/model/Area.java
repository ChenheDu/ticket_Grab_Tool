package src.main.java.com.github.ticketGrab.model;

import java.util.List;

public class Area {

    private String name;
    private String value;
    private List<Area> childen;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public List<Area> getChilden() {
        return this.childen;
    }

    public void setChilden(final List<Area> childen) {
        this.childen = childen;
    }

    @Override
    public String toString() {
        return name;
    }
}
