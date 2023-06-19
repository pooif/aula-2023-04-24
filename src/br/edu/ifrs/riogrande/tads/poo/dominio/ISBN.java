package br.edu.ifrs.riogrande.tads.poo.dominio;

public class ISBN {

  private String numero;

  public ISBN(String numero) {
    if (!numero.matches("^\\d{13}$")) {
      throw new IllegalArgumentException(
        "ISBN inválido: deve ter exatamente 13 dígitos");
    }
    this.numero = numero;
  }

  public String getNumero() {
    return numero;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ISBN) {
      return ((ISBN) obj).numero.equals(this.numero);
    }
    return false;
  }

  @Override
  public String toString() {
    return this.getNumero();
  }
}
