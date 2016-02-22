package com.learn.springmvcangularjs.beans;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/21/12
 * Time: 12:19 AM
 */
public class Train {
    private Long id;
    private String name;
    private Integer speed;
    private Boolean diesel;

    public Train() { }

    public Train(Long id, String name, Integer speed, Boolean diesel) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.diesel = diesel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Boolean getDiesel() {
        return diesel;
    }

    public void setDiesel(Boolean diesel) {
        this.diesel = diesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;

        Train train = (Train) o;

        if (!id.equals(train.id)) return false;
        if (!name.equals(train.name)) return false;
        if (!speed.equals(train.speed)) return false;
        return diesel.equals(train.diesel);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + speed.hashCode();
        result = 31 * result + diesel.hashCode();
        return result;
    }
}
