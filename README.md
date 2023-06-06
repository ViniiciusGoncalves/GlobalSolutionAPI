# GlobalSolutionAPI


# Diagrama de classe
![Diagrama de classe](https://github.com/ViniiciusGoncalves/GlobalSolutionAPI/assets/81978099/ab9f35d1-1294-4fe9-9d5c-df7bb8c59a92)



# Endpoints da API

UserController

<ul>
  <li>POST /api/users/donor - Cria um novo doador.</li>
  <ul>
    <li>Body: Doador object</li>
    <li>Response: ResponseEntity<Doador></li>
  </ul>
  <li>POST /api/users/help - Cria uma nova solicitação de ajuda.</li>
  <ul>
    <li>Body: PrecisandoAjuda object</li>
    <li>Response: ResponseEntity<PrecisandoAjuda></li>
  </ul>
  <li>POST /api/users/login - Faz login de usuário.</li>
  <ul>
    <li>Body: User object</li>
    <li>Response: ResponseEntity<User></li>
  </ul>
</ul>


DoacaoController

<ul>
  <li>GET /api/doacoes - Retorna todas as doações.</li>
  <ul>
    <li>Response: List<Doacao></li>
  </ul>
  <li>POST /api/doacoes - Cria uma nova doação.</li>
  <ul>
    <li>Body: DoacaoRequest object</li>
    <li>Response: Doacao</li>
  </ul>
  <li>PUT /api/doacoes/{id} - Atualiza uma doação existente com o ID fornecido.</li>
  <ul>
    <Li>Path Variable: id (Long)</li>
    <li>Body: DoacaoRequest object</li>
    <li>Response: ResponseEntity<Doacao></li>
  </ul>
</ul>


#Criar novo doador

{
  "id": 1,
  "email": "johndoe@example.com",
  "password": "password123",
  "cpfOuCnpj": "123456789",
  "nome": "John Doe",
  "telefone": "1234567890"
}

#Preicsando de ajuda

{
  "id": 1,
  "email": "johndoe@example.com",
  "password": "password123",
  "cpfOuCnpj": "123456789",
  "nome": "John Doe",
  "telefone": "1234567890",
  "atividades": "Algumas atividades",
  "familiaAjudada": "Família Ajudada",
  "representantes": "Representantes",
  "cep": "12345-678",
  "endereco": "Rua Exemplo, 123",
  "cidade": "Cidade Exemplo",
  "bairro": "Bairro Exemplo"
}


#Fazer login com usuario

{
  "email": "johndoe@example.com",
  "password": "password123"
}








