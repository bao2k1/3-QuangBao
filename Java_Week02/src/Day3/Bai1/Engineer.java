package Day3.Bai1;

class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, String id, double salary, String specialization) {
        super(name, id, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }


    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Specialization: " + specialization);
    }
}
