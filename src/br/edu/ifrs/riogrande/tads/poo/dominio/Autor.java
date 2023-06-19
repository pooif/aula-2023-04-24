package br.edu.ifrs.riogrande.tads.poo.dominio;

import java.time.LocalDate;

public class Autor {

  private String nome;
  private String bio;
  private LocalDate dataNascimento;
  
  public Autor(String nome, String bio, LocalDate dataNascimento) {
    this.nome = nome;
    this.bio = bio;
    this.dataNascimento = dataNascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  @Override
  public String toString() {
    return "Autor [nome=" + nome + ", bio=" + bio + ", dataNascimento=" + dataNascimento + "]";
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
    Autor other = (Autor) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    return true;
  }

  
  
}
