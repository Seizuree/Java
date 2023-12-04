package model;

public abstract class Dumpling {
    private String ingredient, name;
    private Integer price;

    public Dumpling(String ingredient, String name, Integer price) {
        super();
        this.ingredient = ingredient;
        this.name = name;
        this.price = price;
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
