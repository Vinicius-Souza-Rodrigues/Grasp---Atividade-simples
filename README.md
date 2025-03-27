Esse mini app foi feito seguindo alguns padrões que ajudam a organizar melhor o código:

Creator → A classe Pedido é responsável por criar e adicionar os itens do pedido.

Information Expert → Como Pedido já tem a lista de itens e a taxa de serviço, ele mesmo calcula o total.

Low Coupling → O GarcomController só usa os métodos públicos de Pedido, sem mexer direto nos detalhes internos.

High Cohesion → Cada classe faz apenas o que precisa: Cliente representa quem faz o pedido, Pedido cuida dos itens e valores, e GarcomController gerencia o fluxo dos pedidos.

Controller → O GarcomController recebe os pedidos e os processa.
