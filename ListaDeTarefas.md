Jogo de turnos Pokemon  
<br/><br/>
Lista de tarefas(ToDo):  

- [x] Moldar Classes iniciais (Pokemon, Ability, Move)  

- [ ] Criar gitIgnore  

- [x] Moldar Enuns (DamageCategory, Tipo)  

- [x] Criar Service para as classes  

  <br/><br/>
- [ ] Criar método, nas services, que instancie os objetos de suas classes  

- [ ] Criar menu inicial de interação com o usuário (Texto de começo de jogo, perguntar nome do jogador, do vilão e etc)
  <br/><br/>

- [ ] Criar Sistema para o usuário moldar um Pokemon com seus moves e abilities desejados (limite de 4 moves por pokemon)
- Uma alternativa é Moldar alguns pokemon previamente e de forma automatizada pro usuário só escolher qual ele quer utilizar
  <br/><br/>

  
- [ ] Criar um método na PokemonService que calcule o dano que o pokemon irá causar  
    Esse cálculo levará em consideração o Stat de Attack/SpATK do pokemon e o dano do move utilizado  

- [ ] Criar na PokemonService um método que calcule o dano que o pokemon irá receber  
    Esse cálculo aplicará as defesas do pokemon ao dano que está vindo como parâmetro  

- [ ] Criar um método (ou atualizar um) que deduza da vida atual do pokemon que recebeu dano, o dano sofrido  
  
<br/><br/>

- [ ] Criar um sistema de itemização (Poções de cura, de aumento de ataque e etc, é livre pra sua criatividade)

- [ ] Possibilitar a utilização desses itens pelo Pokemon 

<br/><br/>

- [ ] Criar método que possibilitará a troca de pokemon atual do jogador (Se atualmente o bulbasaur estiver "em campo", ele poderá substituir por um chamander por ex)

<br/><br/>

- [ ] Criar a Classe SistemaDeBatalha que será responsável pelo sistema de Turno de uma batalha  

- [ ] Na SistemaDeBatalha, Criar um método com o turno do jogador  
    Esse método dará pro jogador as opções de turno de um jogo pokemon, que são Atacar, Utilizar itens ou Trocar de pokemon  
  
<br/><br/>

- [ ] Criar um NPC para o jogador batalhar contra  
  <br/><br/>

- [ ] Na SistemaDeBatalha, Criar um método que fará o loop do turno do jogador e turno do inimigo, até um deles ser derrotado  

  (Ir atualizando a lista de tarefa durante o código, só coloquei o que eu consegui pensar até agora)  
    
      
        Lista de tarefas dos sonhos, pra quando o sistema estiver funcionando
- [ ] Criar um método que realizará o cálculo real de dano segundo os jogos Oficiais Pokemon
  [Calculo Explicado](https://www.pokemothim.net/2014/08/calculo-de-dano.html)
- [ ] Atualizar o método de causar dano para levar em consideração a Accuracy do pokemon (taxa de certo)
- [ ] Atualizar o SistemaDeBatalha pro pokemon com mais Speed atacar primeiro
- [ ] Programar o efeito das Abilities dos pokemon (Ex: Overgrow do bulbasaur aumenta o dano dele se ele tiver pouca vida)
- [ ] Tornar esse simulador de batalha em um jogo real
  (Minha ideia inicial é o jogador começar com uma quantia de dinheiro pra comprar pokemons e moves, conforme ele vai 
    derrotando NPC's, ele vai recebendo mais dinheiro pra melhorar o time dele)

