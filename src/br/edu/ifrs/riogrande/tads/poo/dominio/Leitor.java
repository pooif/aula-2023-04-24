package br.edu.ifrs.riogrande.tads.poo.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Leitor {
  
  private String email;
  private String nome;
  // coleção: Lista (List/ArrayList), Conjunto (Set/HashSet), Mapa/Dicionário/Chave/Valor (Map/HashMap)
  // conjunto de livros
  private Set<Item> acervo = new HashSet<>();

  // gerar: construtor, getters/setters,
  // hashCode/equals, toString
  public Leitor(String email, String nome) {
    this.email = email;
    this.nome = nome;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  @Override
  public String toString() {
    return "Leitor [email=" + email + ", nome=" + nome + "]";
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((email == null) ? 0 : email.hashCode());
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
    Leitor other = (Leitor) obj;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    return true;
  }

  public void adicionarAoAcervo(Livro livro) {
    // Item: classe associativa, wrapper
    acervo.add(new Item(livro, false));
  }
  
  // resposta abstrata (abstração)
  public Collection<Item> getAcervo() {
    return acervo;
  }

  public boolean contemNoAcervo(Livro livro) {
    for (Item i : acervo) {
      if (i.getLivro().equals(livro)) {
        return true;
      }
    }
    return false;
  }

  public Collection<Livro> getLidos() {
    // Java Streams/LINQ
    // select i.livro from itens i where i.lido is true; 
    return acervo.stream() // fluxo
      .filter(Item::isLido) // só lidos
      .map(Item::getLivro) // desembrulhar
      .toList(); // criar uma lista
  }

  public Optional<Item> buscarLivroPorISBN(ISBN isbn) {
    for (Item item : acervo) {
      if (item.getLivro().getIsbn().equals(isbn)) {
        return Optional.of(item);
      }
    }
    return Optional.empty();
  }
  
}
