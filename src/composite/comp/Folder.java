package composite.comp;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    List<Component> childs = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Component addComponent(Component component){
        component.level = this.level+1;
        childs.add(component);
        return component;
    }

    @Override
    public void show() {
       if(level==0)  System.out.println(tab() + "##Root : " + name);
       else  System.out.println(tab() + "#Folder : " + name);
        for (Component c : childs) {
            c.show();
        }
    }
}
