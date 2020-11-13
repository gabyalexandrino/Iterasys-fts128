#language: pt
#encoding: utf8

  Funcionalidade: Listas
    Criar e manter listas
    Tipo: Analista Financeiro / Usuaria Frequente
  Cenario: Criar uma lista
    Dado que acesso o site Microsoft To Do
    Quando clico no icone do usuario
    Entao o site realizou o login e exibe a pagina do To Do
    Quando clico em Nova lista
    E preencho "Lista de Compras" e pressiono Enter
    Entao exibe a Lista de Compras vazia

  Cenario: Consultar uma lista
    Dado que estou em Microsoft To Do e logada
    Quando clico em "Lista de Compras"
    Entao os itens da "Lista de Compras" são exibidos

  Cenario: Alterar uma lista
    Dado que estou em Microsoft To Do e logada
    Quando clico em "Lista de Compras"
    Entao os itens da "Lista de Compras" são exibidos
    Quando clico em "Lista de Compras" e altero para "Lista de Compras 1"
    Entao os itens da "Lista de Compras 1" são exibidos

  Cenario: Excluir uma lista
    Dado que estou em Microsoft To Do e logada
    Quando clico com o botão direito em "Lista de Compras" e seleciono Delete List
    Entao exibe uma mensagem: "Lista de compras" will be permanently deleted. You wont be able to undo this action.
    Quando clico em Delete list
    Entao a lista sera deletada e a lista anterior sera exibida

  Cenario: Compartilhar uma lista
    Dado que estou em Microsoft To Do e logada
    Quando clico em "Lista de Compras"
    Entao os itens da "Lista de Compras" são exibidos
    Quando clico no icone de Share
    Entao exibe uma mensagem informando: Anyone with this link and a Microsoft account can join and edit this list.
    Quando clico em Create invitation link
    Entao exibe o link de compartilhamento da lista e opcao de enviar via email e gerenciar acesso

