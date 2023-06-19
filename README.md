# Associação

Tipos:

- Simples (um tipo menciona outro tipo), ex.: a classe `Imposto` usa a classe `Math`.
- Agregação vínculo temporário, cada objeto tem seu ciclo de vida, `Quarto` e `Hospede`.
- Composição, vínculo permanente e os ciclos de vida são juntos. Ex.: `Funcionario` e `Dependente`.

## Agregação

Métodos adicionar e remover (coleção), mas na prática em OO, a genta pensa no domínio (precisa de significado).

Modelo anêmico: classes/objetos com atributos e métodos acessores e mutadores (getters,setters,add,remove), mas sem lógica de negócio.

Na prática: usamos uma coleção

1. Lista (List/ArrayList), ordenada, mas permite duplicados
2. Conjunto (Set/HashSet), não-ordenado, não permite duplicados
3. Mapa/Dicionário/Chave/Valor (Map/HashMap), chave de busca

List, Map, Set, são Collection