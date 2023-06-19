package br.edu.ifrs.riogrande.tads.poo.dominio;

import java.util.List;
import java.util.Set;

public class Livro {

  private ISBN isbn;
  private String titulo;
  // private Autor[] autores;
  // private List<Autor> autores;
  private List<Autor> autores; // conjunto (não permite duplicados)
  private Editora editora;
  private Categoria categoria;

  public Livro(ISBN isbn, String titulo, List<Autor> autores, Editora editora, Categoria categoria) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autores = autores;
    this.editora = editora;
    this.categoria = categoria;
  }

  

  public ISBN getIsbn() {
    return isbn;
  }

  public void setIsbn(ISBN isbn) {
    this.isbn = isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public List<Autor> getAutores() {
    return autores;
  }

  public void setAutores(List<Autor> autores) {
    this.autores = autores;
  }

  public Editora getEditora() {
    return editora;
  }

  public void setEditora(Editora editora) {
    this.editora = editora;
  }

  @Override
  public String toString() {
    return "Livro [isbn=" + isbn + ", titulo=" + titulo + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
    Livro other = (Livro) obj;
    if (isbn == null) {
      if (other.isbn != null)
        return false;
    } else if (!isbn.equals(other.isbn))
      return false;
    return true;
  }



  public Categoria getCategoria() {
    return categoria;
  }



  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  
  

  
}
