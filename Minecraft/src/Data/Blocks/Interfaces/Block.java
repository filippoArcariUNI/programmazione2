package Data.Blocks.Interfaces;

public interface Block extends InventoryBlock {
    public char getContent() ;
    public boolean isFalls_with_gravity();
    public boolean isFall_through();
    public boolean is_pickable();
}
