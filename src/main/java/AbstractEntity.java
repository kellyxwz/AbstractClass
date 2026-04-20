import java.util.UUID;

public abstract class AbstractEntity {

    protected UUID id;

    public AbstractEntity(){
        this.id = UUID.randomUUID();
    };

    public UUID getId() {
        return id;
    }
}
