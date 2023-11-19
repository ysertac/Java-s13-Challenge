package employeeApp.model;

import employeeApp.enums.Plan;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String toString() {
        return "Healthplan(" + "\n" +
                "id = " + id + "\n" +
                "name = " + name + "\n" +
                "plan(name: " + plan.getName() + " price: " + plan.getPrice() + "₺)\n" +
                ")";
    }
}
