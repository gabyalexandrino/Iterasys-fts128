#language: pt
#encoding: utf8
  Funcionalidade: Lista
    Criar e manter itens em uma lista
    Esquema do Cenario: Incluir itens na lista
      Dado que estou na Lista de Compras
      Quando digito <item> e pressiono Enter
      Entao exibe o <item> na Lista de Compras
      Exemplos:
        | item |
        | "macarrao" |
        | "molho de tomate" |

    Cenario: Alterar itens na lista
      Dado que estou em Microsoft To Do e logada
      Quando clico em "Lista de Compras"
      Entao os itens da "Lista de Compras" são exibidos
      Quando clico no item da lista a ser alterado
      Entao o sistema mostra as propriedades do item
      Quando altero alguma propriedade
      Entao o sistema atualiza o item e exibe com as propriedades atualizadas

    Cenario: Consultar itens na lista
      Dado que estou em Microsoft To Do e logada
      Quando digito "maca" na barra de pesquisa e pressiono Enter
      Entao o sistema exibe todos os resultados que contenham "maca" no nome

    Cenario: Incluir itens na lista
      Dado que estou em Microsoft To Do e logada
      Quando clico em "Lista de Compras"
      Entao os itens da "Lista de Compras" são exibidos
      Quando clico em Add a task e preencho com o nome e aperto Enter
      Entao o sistema insere o novo item na lista e exibe a "Lista de Compras"
