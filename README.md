# Coleta Inteligente: Trabalho de POO1

Por Jackson William, Lavínia Corteletti, Thiago Moreira e Vinicius Freitas.

# <a name="sumario"></a>Sumário
+ [INTRODUÇÃO E MOTIVAÇAO](#introducao)
+ [MINI-MUNDO](#minimundo)
+ [PROTÓTIPOS](#prototipos)
+ [DIAGRAMA DE CLASSE](#diagramaclasse)
<br><br>
## <a name="introducao"></a>INTRODUÇÃO E MOTIVAÇAO
  O sistema Lixeira Inteligente tem como objetivo auxiliar na coleta e no descarte de lixo. A aplicação auxiliará os cidadãos a encontrar a lixeira mais próxima disponível para o descarte e os coletores a percorrer o melhor trajeto  para o recolhimento de  resíduos das lixeiras consideradas como cheias.  Esse sistema tenta minimizar o problema de descarte de lixo de modo inapropriado, evitando que a cidade fique suja, e também visa criar rotas otimizadas para os coletores a fim de diminuir o desperdício de recursos durante o processo.<br>

[Diário de Bordo](https://docs.google.com/document/d/1N2bfTq--9dVtOqcRP5bTsuJve3REAktGKFht3hsVc0o/edit?usp=sharing)<br><br>

## <a name="minimundo"></a>Mini-Mundo
  O sistema Lixeira Inteligente precisa armazenar as seguintes informações. Sobre o bairro é preciso armazenar o código do bairro e nome do bairro. Sobre a lixeira é necessário armazenar o código da lixeira, código do bairro, localização (longitude e latitude), volume máximo, volume atual de lixo, data/hora da atualização do volume. A lixeira tem Status de Situação Operacional, composto pelo código da lixeira, código do coletor, status, descrição e data/hora. Sobre o cidadão será armazenado o código do cidadão, nome, email, senha e a sua localização. Para o coletor é preciso armazenar o código do coletor,  localização atual, placa, marca, modelo, ano, volume máximo. A versão do aplicativo voltado para o cidadão necessita do cadastro do mesmo  para permitir visualizar  as lixeiras mais próximas de sua localização com o menor volume de lixo contido.  A versão do aplicativo voltado para os coletores apresentará o melhor caminho para realizar a coleta no bairro selecionado, além de permitir que ele atualize o status operacional da lixeira. A rota será criada com base na prioridade de coleta, ou seja, a necessidade de recolher os lixos nas lixeiras das quais atingirem o volume de resíduo maior ou igual a 70% do seu volume máximo.  Somente um administrador poderá alterar as rotas.<br><br>


## <a name="prototipos"></a>Protótipos
[Protótipo Lixeira Inteligente - Cidadão](https://github.com/jalathivi/trab01/blob/master/arquivos/pdf/prototipo_cidadao.pdf)<br>
[Protótipo Lixeira Inteligente - Coletor](https://github.com/jalathivi/trab01/blob/master/arquivos/pdf/prototipo_motorista.pdf)<br><br>

## <a name="diagramaclasse"></a>Diagrama de Classe

<br><br>
