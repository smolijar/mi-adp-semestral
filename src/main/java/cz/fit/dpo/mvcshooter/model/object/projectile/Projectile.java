package cz.fit.dpo.mvcshooter.model.object.projectile;

import cz.fit.dpo.mvcshooter.model.object.GameObject;
import cz.fit.dpo.mvcshooter.model.object.sling.Sling;
import cz.fit.dpo.mvcshooter.pattern.visitor.Visitor;

/**
 * Created by smolijar on 10/25/16.
 */
public class Projectile extends GameObject {
    public Projectile(Sling sling, int power) {
        super();
        size.setX(30);
        size.setY(29);
        location.setX(sling.getLocation().getX());
        location.setY(sling.getLocation().getY());
        direction.setX(power*Math.cos(sling.getAngle()));
        direction.setY(power*Math.sin(sling.getAngle()));
        bounded = false;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProjectile(this);
    }
}
