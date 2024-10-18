Pré requisitos:

-  Ter o gerenciador de pacotes "Maven" instalado.

--Passos para rodar a aplicação em sua máquina--

1. Abra seu terminal e vá até AppRotas-main;

2. Execute o comando mvn package;

3. Abra o projeto na IDE de sua preferência e entre no arquivo demoJavaApplication (ele esta no caminho: src/main/java/com.offlinenav.demo);

4. Aguarde o maven realizar todas as importações;

5. Clique no botão RUN, localizado no topo da tela, ou então pressione"Shift + f10".

--Passos para fazer CRUD por meio das APIS--

1. Abra sua ferramenta para testar APIs (como insomnia ou postman);

2. Escolha a opção de "import" para importar um arquivo existente;

3. Escolha abrir o arquivo "demo", disponibilizado juntamente com o projeto java;

4. Dentro desse arquivo você encontrará 3 pastas, cada uma contem POST, READ, UPDATE, DELETE para sua respectiva tabela;

5. Abra o arquivo post do usuário e clique na aba Body, você perceberá que há um usuário pré preenchido;

6. Clique no botão SEND, para enviar o novo usuário;

7. Vá para o arquivo GET e clique em SEND. Ele deve retornar o usuário que você acabou de enviar;

8. Repita os passos para os demais.



