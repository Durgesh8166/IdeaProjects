
    class Person {
        // Private variables
        private String name;
        private int age;

        // Public getter method for name
        public String getName() {
            return name;
        }

        // Public setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Public getter method for age
        public int getAge() {
            return age;
        }

        // Public setter method for age
        public void setAge(int age) {
            this.age = age;
        }
    }

    public class encaplationexmaple {
        public static void main(String[] args) {
            Person person = new Person();

            // Setting values using setter methods
            person.setName("John");
            person.setAge(30);

            // Getting values using getter methods
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }


