package sistema;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Elemento {
  private List<Elemento> contenido;

  public Directorio(String name) {
    super(name, 0);
    this.contenido = new ArrayList<Elemento>();
  }

  public boolean addelemento(Elemento e) {
    if (this == e)
      return false;
    if (contiene(e) == true)
      return false;
    if (e instanceof Directorio && ((Directorio) e).contiene(this) == true)
      return false;
    return contenido.add(e);
  }

  public boolean contiene(Elemento e) {
    for (Elemento elem : contenido) {
      if (elem == e)
        return true;
      if (elem instanceof Directorio) {
        if (((Directorio) elem).contiene(e))
          return true;
      }
    }
    return false;
  }

  public int getSize() {
    int total = 0;
    for (Elemento e : contenido) {
      total += e.getSize();
    }
    return total;
  }

  @Override
  public void imprimir() {
    System.out.println("Directorio: " + name + " - Tamaño total: " + getSize() + " bytes");
    for (Elemento e : contenido) {
      System.out.print("  ");
      e.imprimir();
    }
  }

}
