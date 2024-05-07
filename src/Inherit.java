public class Inherit {

    class Animal {
        private String name;
        private String species;
        private String color;
        private Boolean wild;

        public Animal(String name, String species, String color, Boolean wild) {
            this.name = name;
            this.species = species;
            this.color = color;
            this.wild = wild;
        }

        public void sit() {
            System.out.println(name + " the" + species + " is sitting like a good boy");
        }

        public void behave() {
            System.out.println(name + " the " + species + " is wild and doesn't like to listen!");
        }
    }
}

class Fish {
    private String name;
    private String species;
    private String color;
    private Boolean wild;
    private int fins;

    public Fish(String name, String species, String color, Boolean wild, int fins) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.wild = wild;
        this.fins = fins;
    }

    public void sit() {
        System.out.println(name + " the" + species + " is sitting like a good boy");
    }

    public void behave() {
        System.out.println(name + " the " + species + " is wild and doesn't like to listen!");
    }
}
