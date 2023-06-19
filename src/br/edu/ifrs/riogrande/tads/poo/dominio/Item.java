package br.edu.ifrs.riogrande.tads.poo.dominio;

public class Item {

  private final Livro livro;
  private boolean lido; // flag

  public Item(Livro livro, boolean lido) {
    this.livro = livro;
    this.lido = lido;
  }

  public Livro getLivro() {
    return livro;
  }

  public boolean isLido() {
    return lido;
  }

  @Override
  public String toString() {
    return "Item [livro=" + livro + ", lido=" + lido + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((livro == null) ? 0 : livro.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Item other = (Item) obj;
    if (livro == null) {
      if (other.livro != null)
        return false;
    } else if (!livro.equals(other.livro))
      return false;
    return true;
  }

  public void marcarComoLido() {
    lido = true;
  }

}
