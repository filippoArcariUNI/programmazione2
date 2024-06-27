package GUI.Controller.Fine_Grained;

import GUI.Model.Map;
import GUI.Visual.MapPane;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractFGController implements FGController{
    protected Collection<Object> efficiency_enablers;
    private MapPane mp;
    private Map m;


    public AbstractFGController() {
        this.efficiency_enablers = new ArrayList<>();
    }

    @Override
    public void redraw() {
        if (this.efficiency_enablers.isEmpty()){
            this.efficient_redraw();
            this.efficiency_enablers.removeIf((e) -> true);
        }else{
            this.not_efficient_redraw();
        }
    }

    @Override
    abstract public void efficient_redraw() ;

    @Override
    abstract public void not_efficient_redraw();

    @Override
    public void add_efficiency_enabler(Object o){return;};

    @Override
    public Collection<Object> get_efficiency_enabler(){
        return this.efficiency_enablers;
    }
}
