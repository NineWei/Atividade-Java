# Atividade-Java

Esse desafio implementa uma função em **Java**, na qual unifica dois arrays ordenados em um só, sem usar um array auxiliar.   
O resultado final é armazenado no próprio array `A`, onde possui espaço para receber os elementos.   

---

## Explicação   

O algoritmo compara os elemtnos de `A` e `B`, preenchendo `A` de trás para frente.   Assim, evitam sobrescrever os valores de `A`.   

## Exemplo   

Entrada:   
- `A = [1, 3, 7, 8, 10, ..., ..., ...]` (n = 5)   
- `B = [2, 4, 9]` (m = 3)   

Saída:   
- `A = [1, 2, 3, 4, 7, 8, 9, 10]` 
