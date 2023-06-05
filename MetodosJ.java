class Main {
  //criar um método (sem parametrio)
  static void impPrime(){ 

System.out.println("O nome é Zé Ramario");
}

  
  //aqui cria um método passando parametro
  static void meuMetodo(String nome) {
    System.out.println("O nome é: " + nome);
  }
  
//aqui cria um método passando parametro
static void nomeEidade (String nome, int ano) {
  System.out.print(nome+ " tem "+ano+ " anos, ");


}
  
//crie um método chamado exibb que exib uma String na tela

static void recadO (String recado) {
  System.out.print(" to estressado com o professor: " +recado);
}

  
  //classe principal do java 
  public static void main(String[] args) {
  //chamar o metodo impPrime
  impPrime();
    
    
   
    meuMetodo  ("Gabriel"); 
    meuMetodo ("Gabriel");
    meuMetodo ("Gabriel");
    meuMetodo ("Gabriel");


    //método com dois parametros
    nomeEidade("Gabriel", 17);
    nomeEidade("Gabrielly", 17);
    nomeEidade("Otávio", 18);

    //método atividade
    recadO("Prof Edney");
    

    
 }

    
}