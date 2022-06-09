## Desenvolvimento do algoritmo de Dijkstra

### Dado que seja definido um nó de origem e um nó de destino, faça os seguintes passos para encontrar o destino:

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
- Retirar da LA o nó com a menor distância (nó corrente)

#### Passo 6
- Se o nó corrente for o nó de destino, solução encontrada (finaliza o algoritmo)

#### Passo 7
- Para cada nó vizinho do nó corrente
  - se o nó vizinho já estiver na LF siga para o próximo vizinho
  - calcular a distância total para chegar até o nó vizinho 
    - distância total até o nó corrente + peso para chegar ao nó vizinho a partir do nó corrente
  - se o nó vizinho ainda não estiver na LA, adicionar o nó na LA
  - se o nó estiver na LA, atualizar nó vizinho na LA apenas se a distância total calculada for menor do que a distância  do nó  vizinho já na LA

#### Passo 8
- Adicionar o nó corrente na LF

#### Passo 9 
- Enquanto a LA não estiver vazia, repita o Passo 5

#### Passo 10
- Se chegar nesse passo, todos os nós foram visitados (estão na LF) e o destino não foi encontrado


