public class ProjectTest{
    public static void main(String[] args){
        Project proj1 = new Project();
        Project proj2 = new Project("Axsos");
        Project proj3 = new Project("Axsos1", "It is a great academy", 500);
        Project proj4 = new Project("Axsos2", "It is a great academy", 500);
        Project proj5 = new Project("Axsos3", "It is a great academy", 500);
        proj3.setName("Academy");
        System.out.println(proj3.elevatorPitch());
        System.out.println(proj2.getName());
        Portfolio prot1 = new Portfolio();
        prot1.setProjectList(proj3);
        prot1.setProjectList(proj4);
        prot1.setProjectList(proj5);
        System.out.println(prot1.getPortfolioCost());
        prot1.showPortfolio();
    }
}