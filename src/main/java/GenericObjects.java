import java.util.Objects;

public class GenericObjects {

    private String name;

    public GenericObjects(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericObjects that = (GenericObjects) o;
        return Objects.equals(name, that.name);
    }


}
