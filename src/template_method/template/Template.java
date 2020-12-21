package template_method.template;

public abstract class Template {

    public double computeTemplate(double x, double y) {
        double data = x * y;
        double param = detail1(data);
        double somme = y;
        for (int i = 0; i < param; i++) {
            double value = detail(x, y, param);
            somme += value;
        }
        return somme;
    }

    protected abstract double detail(double x, double y, double data);

    protected abstract double detail1(double data);

}
