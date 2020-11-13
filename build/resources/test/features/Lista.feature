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
      Entao as propriedades do item sao exibidas
      Quando altero alguma propriedade
      Entao o item e exibido com as propriedades atualizadas

    Cenario: Consultar itens na lista
      Dado que estou em Microsoft To Do e logada
      Quando digito "maca" na barra de pesquisa e pressiono Enter
      Entao todos os resultados que contenham "maca" no nome sao exibidos

    Cenario: Incluir itens na lista
      Dado que estou em Microsoft To Do e logada
      Quando clico em "Lista de Compras"
      Entao os itens da "Lista de Compras" são exibidos
      Quando clico em Add a task e preencho com o nome e aperto Enter
      Entao o novo item e inserido na lista e a "Lista de Compras" e exibida
