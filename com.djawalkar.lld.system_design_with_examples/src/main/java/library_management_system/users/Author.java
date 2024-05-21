package library_management_system.users;

public class Author extends Person{
    private String description;

    public Author(){

    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
