package mars;

public abstract class ModuleMartienVolant extends ModuleMartien {
    public ModuleMartienVolant(Direction direction, Position position) {
        super(direction, position);
    }

    abstract void monter();

    abstract void descendre();


    protected abstract void sePoser();

    protected abstract void atterir(int altitude);


    @Override
    public void activerRecuperation() {
        super.pretPourRecuperation = true;
        this.sePoser();
    }
}
