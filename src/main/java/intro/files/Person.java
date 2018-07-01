package intro.files;

public class Person {
    private String id;
    private String name;

    private String checkIfEmpty(String text) {
        if(text.equalsIgnoreCase(""))
            return "EMPTY";
        else return text;
    }

    public Person(String id, String name) {

        this.id = checkIfEmpty(id);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
