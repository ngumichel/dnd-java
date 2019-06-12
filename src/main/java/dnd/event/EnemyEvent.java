package dnd.event;

public class EnemyEvent extends GameEvent {

    private Enemy enemy;

    public EnemyEvent() {

    }

    public EnemyEvent(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String description() {
        return super.description() + "un " + enemy;
    }
}
