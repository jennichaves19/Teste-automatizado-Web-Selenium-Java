#language: pt
#encoding: UTF-8

Funcionalidade: fazer o login

Cenario: logar no sistema
Dado eu estou acessando o sistema 
Quando eu informar o usuario
E informar a senha
E eu clicar no botao de login
Entao o sistema efetua o login
  
Cenario: Adicionar item ao carrinho
Dado que eu esteja logado no sistema
Quando eu clicar no botao adicionar ao carrinho 
Entao o produto sera adicionado no carrinho