#language: pt
#encoding: utf8

  Funcionalidade: Usuario

    Criar, manter e autenticar usuarios

    Cenario: Login com Sucesso
      Dado que estou em Microsoft To Do e deslogado
      Quando clico no icone para realizar o login
      Entao exibe a pagina do login
      Quando preencho o email "correia@iterasys.com"e clico em Proximo
      E seleciona a conta pessoal
      E digita a senha "teste123" e clica em Entrar
      Entao o site realizou o login e exibe a pagina do To Do

    Cenario: Login Incorreto
      Dado que estou em Microsoft To Do e deslogado
      Quando clico no icone para realizar o login
      Entao exibe a pagina do login
      Quando preencho o email "correia@iterasys.com"e clico em Proximo
      E seleciona a conta pessoal
      E digita a senha "Atena2020" e clica em Entrar
      Entao o site exibe a mensagem de erro: Sua conta ou senha está incorreta. Se você não se lembra da sua senha, redefina-a agora.

    Cenario: Login Esqueci a Senha
      Dado que estou em Microsoft To Do e deslogado
      Quando clico no icone para realizar o login
      Entao exibe a pagina do login
      Quando preencho o email "correia@iterasys.com"e clico em Proximo
      E seleciona a conta pessoal
      E digita a senha "Atena2020" e clica em Entrar
      Entao o site exibe a mensagem de erro: Sua conta ou senha está incorreta. Se você não se lembra da sua senha, redefina-a agora.
      Quando clico em Forgot password?
      Entao  exibe uma mensagem informando que precisa verificar a identidade do usuario e informa uma parte do email de recuperacao
      Quando clico em proximo
      Entao um email e envido para o email de recuperacao do usuario com um codigo de verificacao

    Cenario: Criar usuario
      Dado que estou em Microsoft To Do e deslogado
      Quando clico no icone para realizar o login
      Entao exibe a pagina do login
      Quando clico em Create one!
      Entao o sistema exibe a pagina de criar conta
      Quando clico em Get a new email address
      Entao o sistema solicita que o usuario infome o email e o dominio
      Quando preencho o campo de New email e escolho o dominio
      Entao o sistema solicita que a senha seja informada
      Quando preencho a senha e clico em Next
      Entao o sistema solicita o primeiro e o ultimo nome do usuario
      Quando preencho o primeiro nome e sobrenome e clico em proximo
      Entao o sistema solicita que o usuario preencha sua nacionalidade e data de nascimento
      Quando preencho a nacionalidade e a data de nascimento e clico em Next
      Entao o sistema solicita que um quebra cabeca seja montado para que certifique que nao e um robo
      Quando clico em Next
      Entao o sistema exibe uma figura para ser colocada na posicao correta
      Quando corrijo a posicao da figura e clico em Next
      Entao o sistema cria a conta e o site realizou o login e exibe a pagina do To Do