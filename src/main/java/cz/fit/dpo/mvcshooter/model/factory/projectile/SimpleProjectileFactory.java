package cz.fit.dpo.mvcshooter.model.factory.projectile;

import cz.fit.dpo.mvcshooter.model.object.projectile.Projectile;
import cz.fit.dpo.mvcshooter.model.object.projectile.RealisticProjectile;
import cz.fit.dpo.mvcshooter.model.object.projectile.SimpleProjectile;
import cz.fit.dpo.mvcshooter.model.object.sling.Sling;

/**
 * Created by smolijar on 12/19/16.
 */
public class SimpleProjectileFactory extends AbstractProjectileFactory {
    @Override
    public Projectile create(Sling sling, int power) {
        return new SimpleProjectile(sling, power);
    }
}
