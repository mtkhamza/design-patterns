package template_method.Implementations;

import template_method.template.Template;

public class TemplateImp1 extends Template {
    @Override
    protected double detail(double x, double y, double data) {
        double w = x * y / data;
        return w * data;
    }

    @Override
    protected double detail1(double data) {
        return  (Math.sqrt(data));
    }
}
