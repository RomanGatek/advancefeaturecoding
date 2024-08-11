package advancefeaturecoding.task18;

import java.util.Objects;

public class Computer {
    private String processor;
    private int ram;
    private String graphicCard;
    private String company;
    private String model;

    public Computer(String processor, int ram, String graphicCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicCard='" + graphicCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram &&
                processor.equals(computer.processor) &&
                graphicCard.equals(computer.graphicCard) &&
                company.equals(computer.company) &&
                model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        int result = processor.hashCode();
        result = 31 * result + ram;
        result = 31 * result + graphicCard.hashCode();
        result = 31 * result + company.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel i7", 16, "NVIDIA GTX 1660", "Dell", "XPS 15");
        Computer computer2 = new Computer("AMD Ryzen 7", 32, "AMD Radeon RX 6800", "HP", "Omen 17");
        Computer computer3 = new Computer("Intel i7", 8, "NVIDIA GTX 1860", "Dell", "XPS 15B");

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);

        System.out.println("-------------------------------");

        System.out.println("computer1.equals(computer2): " + computer1.equals(computer2));
        System.out.println("computer1.equals(computer3): " + computer1.equals(computer3));
        System.out.println("computer1.hashCode(): " + computer1.hashCode());
        System.out.println("computer3.hashCode(): " + computer3.hashCode());

        System.out.println("-------------------------------");

        computer1.setRam(64);
        System.out.println("After modification: ");
        System.out.println("computer1.equals(computer2): " + computer1.equals(computer2));
    }
}
