package br.edu.ifrs.riogrande.tads.poo.dominio;

public class Editora {

  private String nome;
  private Endereco endereco; // associação
  
  public Editora(String nome, Endereco endereco) {
    this.nome = nome;
    this.endereco = endereco; // Agregação
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  // Agregação: agregar um endereço à Editora
  public void setEndereco(Endereco endereco) { 
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "Editora [nome=" + nome + ", endereco=" + endereco + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
    Editora other = (Editora) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    return true;
  }

  
  
}
