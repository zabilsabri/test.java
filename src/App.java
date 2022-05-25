import java.time.LocalDate;

public class App {

    private String name;
    private LocalDate deadline;

    public App(String name, LocalDate deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getAge() {
        return deadline;
    }

    public void setAge(LocalDate deadline) {
        this.deadline = deadline;
    }

}