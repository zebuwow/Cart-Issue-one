public class Item {
    private String description;
    private Double price;
    private int quanity;
    public String getDescription(){
        return description;
    }
    public Double getPrice(){
        return price;
    }
    public int getQuanity(){
        return quanity;
    }
    public void setPrice(Double p){
        price = p;
    }
    public void setQuanity(int q){
        quanity =  q;
    }
    public void setDescription(String d){
        description = d;
    }
    @Override
    public String toString(){
        return description + " price: " + price + " quanity: " + quanity;
    }
}
