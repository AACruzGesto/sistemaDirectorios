package sistema;

public class Fichero extends Elemento{
  private type tipo;

  public Fichero(String name, int size, type tipo){
    super(name, size);
    this.tipo = tipo;
  }

  public type getTipo(){
    return this.tipo;
  }
  public void setTipo(type tipo){
    this.tipo = tipo;
  }
  
  @Override
    public void imprimir() {
        System.out.println("Fichero: " + name + " - " + size + " bytes - Tipo: " + tipo);
    }
  
}
