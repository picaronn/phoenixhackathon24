public class Food {
    private String name;
    private String date;
    private String weight;
    public Food(String myname, String mydate, String myweight){
        name = myname;
        date = mydate;
        weight = myweight;
    }

    public void setName(String myname){
        name = myname;
    }

    public void setDate(String mydate){
        date = mydate;
    }

    public void setWeight(String myWeight){
        weight = myWeight;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public String getWeight(){
        return weight;
    }
}
