package template_method;

import template_method.Implementations.TemplateImp1;
import template_method.Implementations.TemplateImp2;
import template_method.template.Template;

public class App {
    public static void main(String[] args) {
        Template template = new TemplateImp1();
        System.out.println(template.computeTemplate(6,90));
        template = new TemplateImp2();
        System.out.println(template.computeTemplate(6,90));

    }
}
