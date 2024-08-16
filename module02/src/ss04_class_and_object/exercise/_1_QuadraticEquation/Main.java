package ss04_class_and_object.exercise._1_QuadraticEquation;

class Main {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1.0, 3.0, 1.0);
//        double root1 = equation.getRoot1();
//        double root2 = equation.getRoot2();

        if (Double.isNaN(equation.getRoot1()) && Double.isNaN(equation.getRoot2())) {
            System.out.println("The equation has no roots.");
        } else {
            if (!Double.isNaN(equation.getRoot1())) {
                System.out.println("Root 1 = " + (Math.round(equation.getRoot1() * 10.0) / 10.0));
            }
            if (!Double.isNaN(equation.getRoot2())) {
                System.out.println("Root 2 = " + (Math.round(equation.getRoot2() * 1000.0) / 1000.0));
            }
        }
    }
}