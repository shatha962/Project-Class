public class Project{
    private String name = "";
    private String desc = "";
    private double initialCost = 0.0;

    public Project(){

    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String desc, double initialCost){
        this.name = name;
        this.desc = desc;
        this.initialCost = initialCost;
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public double getInitialCost(){
        return this.initialCost;
    }
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
    public String elevatorPitch(){
        return this.name + "("+ this.initialCost + " ) : " + this.desc;
    }
}