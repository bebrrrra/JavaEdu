package lab2.task4;

import java.util.ArrayList;

public class Shop {
    private Computer comp;
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer comp){computers.add(comp);}

    public void removeComputer(String model){
        computers.remove(findComputer(model));
    }

    public void printComputers(){
        System.out.println(computers);
    }
    public Computer findComputer(String model){
        for (Computer comp : computers){
            if (comp.getModel().equalsIgnoreCase(model)){return comp;}
        }
        return null;
    }
}
