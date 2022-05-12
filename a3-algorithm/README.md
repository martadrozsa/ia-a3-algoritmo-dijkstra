### Desenvolvimento do algoritmo de Dijkstra

Dado que é definido um nó de origem e um nó de destino, faça os sequintes passos para encontrar o destino:

#### Passo 1
- Setar a distância do nó inicial para 0

#### Passo 2
- Criar uma lista aberta (LA)
- Criar uma lista fechada (LF)

#### Passo 3
- Adicionar o nó inicial na LA

#### Passo 4
- Setar as distâncias de outros nós para o infinito = Integer.MAX_VALUE

#### Passo 5
- Verificar quais são os nós vizinhos do nó inicial e calcular a distância entre eles, incluir o nó testado na LA

#### Passo 6
- Colocar o nó visitado na LF

#### Passo 7 
- Enquando a LA não estiver vazia, repita o Passo 5
