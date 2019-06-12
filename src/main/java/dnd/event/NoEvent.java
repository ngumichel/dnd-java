package dnd.event;

public class NoEvent extends GameEvent {

    private Nothing nothing;

    public NoEvent() {

    }

    public NoEvent(Nothing nothing) {
        this.nothing =  nothing;
    }

    @Override
    public String description() {
        return super.description() + nothing;
    }
}
