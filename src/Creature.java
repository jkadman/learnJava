public class Creature {

        private String name;
        private String species;

        public Creature(String name, String species) {
            this.name = name;
            this.species = species;
        }

        public void sit() {
            System.out.println(name + " the " + species + " is sitting like a good boy");
        }

        public void behave() {
            System.out.println(name + " the " + species + " is wild and doesn't like to listen!");
        }
    }

    class Animal extends Creature{
        private String color;
        private Boolean wild;

        public Animal(String name, String species, String color, Boolean wild) {
            // calling for values from the super class
            super(name, species);
            this.color = color;
            this.wild = wild;
        }


    }

    class Fish extends Creature{
        private int fins;

        public Fish(String name, String species, int fins) {
            super(name, species);
            this.fins = fins;
        }


    }





