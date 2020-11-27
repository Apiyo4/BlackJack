package models;

public class Player {
    private String name;
    private Integer totalvalue;
    public  Player(String name){
        totalvalue = 0 ;
    }

    public void setTotalvalue(Integer totalvalue) {
        this.totalvalue += totalvalue;
    }

    public Integer getTotalvalue() {
        return totalvalue;
    }
}
