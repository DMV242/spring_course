package fr.epita.demoaop.model;

public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        IO.println("La la la la la la");
    }
}
