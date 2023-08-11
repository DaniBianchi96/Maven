#language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário:

    @cadastro-sucesso
    Cenário: Registrar
     Dado acesso o cadastro de usuario
    Quando eu preencho o formulario do cadastro
    E clico em registrar
    Então O cadastro é realizado com sucesso