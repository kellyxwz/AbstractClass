public class Id extends AbstactEntities {

    private int id = 0;

    @Override
    public Integer generatorId() {
        return id;
    }

    @Override
    public Integer imprimirIdGerado() {
        return ++id;
    }
}
