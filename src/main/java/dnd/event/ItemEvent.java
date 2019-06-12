package dnd.event;

public class ItemEvent extends GameEvent {

    private Item item;

    public ItemEvent() {

    }

    public ItemEvent(Item item) {
       this.item = item;
    }

    @Override
    public String description() {
        return super.description() + "un " + item;
    }
}
