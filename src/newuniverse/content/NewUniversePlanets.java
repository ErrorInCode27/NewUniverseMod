package newuniverse.content;

import arc.graphics.Color;
import arc.math.geom.Vec3;
import arc.util.noise.Simplex;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.type.Planet;
import mindustry.world.meta.Env;

public class NewUniversePlanets {
    public static Planet minos, crede, kray, qupon;

    public static void load() {
        minos = new Planet("minos", Planets.serpulo, .25f, 2){{
            generator = new PlanetGenerator() {
                @Override
                public float getHeight(Vec3 position) {
                    return 0;
                }

                @Override
                public Color getColor(Vec3 position) {
                    return Simplex.noise3d(32405, .7, .25d, 1.2d, Vec3.X.x, Vec3.Y.y, Vec3.Z.z) < 0.5 ? Color.gray : Color.lightGray;
                }
            };
            meshLoader = () -> new HexMesh(this, 3);
            alwaysUnlocked = false;
            hasAtmosphere = false;
            defaultEnv = Env.any;
            accessible = false;
            visible = true;
            orbitRadius = 3f;
        }};
    }
}
