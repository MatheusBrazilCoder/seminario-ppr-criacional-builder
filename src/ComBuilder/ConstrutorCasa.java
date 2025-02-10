package ComBuilder;

public abstract class ConstrutorCasa {
    protected Casa casa;
    
    public void criarNovaCasa() {
        casa = new Casa();
    }
    
    public Casa getCasa() {
        return casa;
    }
    
    public abstract void construirFundacao();
    public abstract void construirParedes();
    public abstract void construirTelhado();
}