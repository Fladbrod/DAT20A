package trash.example.trashapi.model;

public class SuperMarioCharacter {

    private String name;

    SuperMarioCharacter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperMarioCharacter{" +
                "name='" + name + '\'' +
                '}';
    }
}
