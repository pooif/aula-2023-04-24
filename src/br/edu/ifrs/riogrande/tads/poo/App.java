package br.edu.ifrs.riogrande.tads.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import br.edu.ifrs.riogrande.tads.poo.dominio.Autor;
import br.edu.ifrs.riogrande.tads.poo.dominio.Categoria;
import br.edu.ifrs.riogrande.tads.poo.dominio.Editora;
import br.edu.ifrs.riogrande.tads.poo.dominio.Endereco;
import br.edu.ifrs.riogrande.tads.poo.dominio.ISBN;
import br.edu.ifrs.riogrande.tads.poo.dominio.Item;
import br.edu.ifrs.riogrande.tads.poo.dominio.Leitor;
import br.edu.ifrs.riogrande.tads.poo.dominio.Livro;

class App {
  public static void main(String[] args) {
    
    Endereco end = new Endereco(
      "Alfredo Huch, 475", 
      "Centro", 
      "Rio Grande");

    Editora edit = new Editora("TADS editora", end);

    ISBN isbn = new ISBN("1234567890123");

    Autor autor = new Autor(
      "Marcio", 
      "Mais um programador", 
      LocalDate.of(1976, 10, 25));

    Livro livro = new Livro(
      isbn, 
      "POO", 
      List.of(autor), 
      edit,
      Categoria.AVENTURA);

    // Navegar no Grafo de Objetos (Traverse)
    // Cidade do Endereço da Editora do Livro
    System.out.println(livro.getEditora().getEndereco().getCidade());
    // Bio do primeiro Autor do Livro
    System.out.println(livro.getAutores().get(0).getBio());

    Leitor josue = new Leitor("josue@if.rs.br", "Josué");

    // Agregar este livro ao Leitor
    josue.adicionarAoAcervo(livro);
    josue.adicionarAoAcervo(livro);
    josue.adicionarAoAcervo(livro);

    // devolve um Set<Livro>, revela a implementação,
    // "engessar" a API (Application Programming Interface)
    System.out.println(josue.getAcervo().size()); // 1
    System.out.println(josue.getAcervo()); // 1
    // foreach (paracada)
    for (Item item : josue.getAcervo()) { // tradicional
      System.out.println(item.getLivro().getTitulo());
    }

    josue.getAcervo().forEach(i -> { // avançado
      System.out.println(i.getLivro());
    });

    // passar o método como referência, ninja
    josue.getAcervo().forEach(System.out::println);

    // System.out.println(josue.getListaLeitura().get(0)); // 1ro livro

    josue.contemNoAcervo(livro); // train-wreck

    boolean b = josue.contemNoAcervo(livro);

    Livro livro2 = new Livro(new ISBN("0987654321098"), "Rápido e Devagar", List.of(new Autor("Daniel K", "", null)), new Editora("O Reilly", new Endereco("Av Pelotas", "Ciade Nova", "Rio Grande")), Categoria.FICCAO);

    josue.adicionarAoAcervo(livro2);

    System.out.println(josue.getLidos());
    

    Optional<Item> item = josue.buscarLivroPorISBN(new ISBN("1234567890123"));
    System.out.println(item);
    if (item.isPresent()){
      item.get().marcarComoLido();
    }

    josue.buscarLivroPorISBN(new ISBN("0987654321098"))
      .ifPresent(it -> it.marcarComoLido());
    
    System.out.println(josue.getAcervo());

    josue
      .buscarLivroPorISBN(new ISBN("7654328765432"))
      .ifPresent(it -> it.marcarComoLido());
    
  }  
}
