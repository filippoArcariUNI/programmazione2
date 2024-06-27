package GUI.Controller.Fine_Grained;

import java.util.Collection;

public interface FGController {
    void redraw();
    void efficient_redraw();
    void not_efficient_redraw();
    void add_efficiency_enabler(Object o);
    Collection<Object> get_efficiency_enabler();
}
