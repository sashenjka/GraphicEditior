package main.java.GraphicEditior;

public class Shape {
    private String name;

        public Shape() {
            name = "Shape";
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (this.name != getName() || name.trim().isBlank() || name.length() > 100) {
                return;
            }
            this.name = name;

        }
}





