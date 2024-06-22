import java.util.Objects;

public class TestClass {
    private int id;
    private static int idCount;
    private String nameChicken;
    private int countLittleChicken;

    public TestClass() {
        setId();
    }
    private void setId() {
        if (getLastId() >100) {
            System.out.println("Вы жрете много памяти!");
        }
        this.id = ++idCount;
    }
    public int getId() {
        return this.id;
    }
    public int getLastId() {
        return idCount;
    }

    public void setCountLittleChicken(int countLittleChicken) {
        this.countLittleChicken = countLittleChicken;
    }

    public void setNameChicken(String nameChicken) {
        this.nameChicken = nameChicken;
    }

    public String getNameChicken() {
        return nameChicken;
    }

    public int getCountLittleChicken() {
        return countLittleChicken;
    }

    @Override
    public String toString() {
        return "Кура " + nameChicken + " с " + countLittleChicken + " цыпами";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        if (this.nameChicken.equals("Кокоша")) {
            return true;
        }
        return id == testClass.id && countLittleChicken == testClass.countLittleChicken && Objects.equals(nameChicken, testClass.nameChicken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameChicken, countLittleChicken);
    }
}
