package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
  // pode ser default (sem public)
  public void adicionarLancheNoBalcao() {
    System.out.println("Adicionar lanche natural hamburger no balcão");
  }

  public void adicionarSucoNoBalcao() {
    System.out.println("Adicionar suco no balcão");
  }

  public void adicionarComboNoBalcao() {
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }

  private void prepararLanche() {
    System.out.println("Preparando lanche tipo hambuger");
  }

  private void prepararVitamina() {
    System.out.println("Preparando Suco");
  }

    void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

   void selecionarIngredientesLanche() {
    System.out.println("Selecionar o pão, salada, ovo e carne");
  }

   void selecionarIngredientesVitamina() {
    System.out.println("Selecionar fruta, leite e suco");
  }

   void lavarIngredientes() {
    System.out.println("Lavando ingredientes");
  }

   void baterVitaminaLiquidificador() {
    System.out.println("Batendo vitamina liquidificador");
  }

   void fritarIngredientesLanche() {
    System.out.println("Fritando a carne e ovo para o hamburger");
  }

  void pedirParaTrocarGas(Almoxarife almoxarife, Atendente meuAmigo) {
    meuAmigo.trocarGas();
  }

   void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }

}
