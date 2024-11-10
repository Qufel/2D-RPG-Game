package engine.physics.shapes;

import engine.objects.GameObject;
import engine.physics.Vector2;

public class AABB extends CollisionShape{

    private Vector2 size = new Vector2(0,0);

    public AABB() {
        super();
    }

    public AABB(GameObject body, Vector2 size) {
        super(body);
        this.size = size;
    }

    public Vector2 getMin() {
        return new Vector2(body.getPosition()).sub(new Vector2(size).mul(0.5));
    }

    public Vector2 getMax() {
        return new Vector2(body.getPosition()).add(new Vector2(size).mul(0.5));
    }

}
