package sistema;

public abstract class Elemento {
  protected String name;
  protected int size;

  public Elemento(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return this.name;
  }

  public int getSize() {
    return this.size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(int size) {
    this.size = size;
  }
  
  public abstract void imprimir();

}
