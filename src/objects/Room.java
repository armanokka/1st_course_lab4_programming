package objects;

import interfaces.Collectable;

public class Room {
    public String name;
    protected boolean explored = false;
    public Collectable collectable;
    public Room(Collectable collectable, String name) {
        if (collectable != null) {
            this.collectable = collectable;
        }
        this.name = name;
    }

    public boolean hasArtifact() {
        return this.collectable != null;
    }

    public Collectable collectArtifact() {
        if (this.explored) {
            return null;
        }
        this.explored = true;
        return collectable;
    }
}
