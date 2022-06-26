#language: pt
#encouding: UTF-8

@CadastrarUsuario
Funcionalidade: cadastrar usuario

  @Cadastro
  Cenario: cadastrar usuario
    Quando eu acionar a aba admin
    E acionar o botao add
    E informar o campo employer name "Fiona Grace"
    E informar o campo user name "Peter"
    E informar o campo password "12345678"
    E informar o campo confirmar password "12345678"
    E acionar o botao salvar
    Entao o sistema cadastra o usuario "Peter"

