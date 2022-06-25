#language: pt
#encouding: UTF-8
@Login
Funcionalidade: login

  Cenario: usuario invalido
    Quando eu informar o usuario "Ad"
    E informar a senha "asd"
    E clicar no botao login
    Entao o sistema exibe a mensagem de usuario invalido

  @loginSucesso
  Cenario: realizar login
    Quando eu informar o usuario "Admin"
    E informar a senha "admin123"
    E clicar no botao login
    Entao o sistema exibe o usuario logado







#  @login
#  Funcionalidade: Acessar Sistema
#
#  Contexto:
#    Dado que eu estou acessando o sistema
#    Quando eu informar o usuario
#    E informar a senha
#    Entao o sistema apresenta um usuario logado
#
#
#  @informarcampo
#
#  Cenario: cenario 1
#    Dado que eu estou cadastrar um usuario
#
#  Cenario: cenario 2
#    Dado que eu editar um usuario

