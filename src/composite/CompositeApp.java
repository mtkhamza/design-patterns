package composite;

import composite.comp.File;
import composite.comp.Folder;

public class CompositeApp {
    public static void main(String[] args) {
        Folder root = new Folder("Design Pattern");
        Folder F1 = (Folder) root.addComponent(new Folder("Comportement"));
        Folder F2 = (Folder) root.addComponent(new Folder("Structure"));
        Folder F3 = (Folder) root.addComponent(new Folder("Creation"));
        File f1 = (File) root.addComponent(new File("Notes.txt"));
            F1.addComponent(new File("Strategy"));
            F1.addComponent(new File("Observer"));
            Folder demos = (Folder) F1.addComponent(new Folder("Demos"));
                demos.addComponent(new File("DemoApp.java"));
            Folder tests = (Folder) F1.addComponent(new Folder("Tests"));
                tests.addComponent(new File("Tests.java"));
            F2.addComponent(new File("Decorator"));
            F2.addComponent(new File("Composite"));
            F2.addComponent(new File("Adapter"));
            F3.addComponent(new File("Singleton"));
            F3.addComponent(new File("Builder"));
        root.show();
    }
}
