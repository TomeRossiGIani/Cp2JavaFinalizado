Tomé Rossi Giani RM:562422


Leonardo Eiji Kina RM:562784


Nicholas Braga de Souza RM:561733


Vitor Ramos de Farias RM:561958

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/48e0a7dd-bfca-4260-b72d-4c2d0c2509c9" />



1. Herança
A herança foi utilizada para representar os diferentes tipos de entregadores do sistema. Foi criada a classe abstrata Entregador como base, contendo os atributos e comportamentos comuns a todos os tipos, como nome, veiculo, disponivel, o método getNome() e a sobrecarga de calcularTempoEntrega. A partir dela, foram criadas três subclasses concretas: MotoEntregador, BikeEntregador e CarroEntregador, cada uma com sua própria implementação de velocidade e custo. Isso resolveu o problema de repetição de código e facilita a adição de novos tipos de entregador no futuro sem alterar o restante do sistema.


2. Interface
Foi criada a interface OperacaoEntrega, que define dois métodos obrigatórios: realizarEntrega() e calcularCustoEntrega(double distancia). Ela foi implementada pela classe abstrata Entregador, garantindo que todos os tipos de entregador, independentemente do veículo, possuam esses comportamentos. A vantagem do uso da interface é padronizar o contrato do sistema: qualquer nova classe que represente um entregador será obrigada a implementar esses métodos, promovendo flexibilidade e segurança na expansão do código.


3. Classe Abstrata
A classe abstrata Entregador foi utilizada para representar o conceito genérico de entregador, que não faz sentido ser instanciado diretamente, não existe um "entregador genérico", mas sim um entregador de moto, bicicleta ou carro. Ela centraliza os atributos e métodos comuns a todos os tipos, como nome, veiculo, disponivel e a sobrecarga de calcularTempoEntrega, enquanto delega a implementação específica de calcularTempoEntrega(double distancia) para cada subclasse. Ela não poderia ser uma classe comum porque o sistema precisa garantir que cada subclasse implemente suas próprias regras de tempo de entrega, e uma classe comum não permite declarar métodos abstratos que forcem essa implementação.




