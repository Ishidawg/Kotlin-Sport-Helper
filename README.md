# Gestão de Esporte

O aplicativo de Gestão de Esporte é uma ferramenta voltada para atletas e gestores de esportes. Ele oferece funcionalidades como perfil do atleta, calendário de eventos e monitoramento de desempenho.

## Funcionalidades

### 1. Perfil do Atleta

Essa seção concentra as principais informações sobre o atleta, como nome, esporte praticado, e rotina de treinos. Essa área permitirá ao usuário acompanhar o desenvolvimento do atleta.

-   **Campos**:
    -   Nome do atleta.
    -   Esporte praticado.
    -   Descrição da rotina de treinos (com informações sobre horários e quantas vezes na semana foi praticado ou não).

### 2. Calendário de Eventos

O calendário de eventos do app oferece uma visão da agenda de treinos e competições. Ele permite que o atleta e/ou treinador organizem e acompanhem eventos importantes e recebam lembretes.

-   **Componentes**:
    -   **Agenda de treino**: Exibição de treinos com datas e horários.
    -   **Competições**: Informações como local, hora e data.
    -   **Lembretes**: Notificações para eventos importantes (como competições, treinos e outros compromissos).

### 3. Monitoramento de Desempenho

Essa funcionalidade permite ao atleta acompanhar seu progresso ao longo do tempo. Inclui o histórico de competições e uma visão geral do cumprimento da rotina de treinos.

-   **Componentes**:
    -   **Resultados de Competições Anteriores**: Lista de competições com os resultados do atleta.
    -   **Histórico de Treinamento**: Visualização dos dias de treino completados e os dias sem treino.

## Estrutura de Navegação

### Navegação por Botões

-   **Botões para ações principais**: Como marcar os dias de treino em grupo ou individual e acessar outras telas.

### Navegação por Abas (TabLayout)

Abas utilizadas para organizar seções específicas dentro de uma mesma funcionalidade, como na tela de Monitoramento de Desempenho:

-   **Resultados** (para competições anteriores).
-   **Histórico de Treinos** (para visualizar dias com ou sem treino).

## Estrutura das Telas


### 1. Tela Inicial

-   **Componentes**: Visualização semanal da rotina de treinos e botões para navegar para outras telas.

### 2.  Tela de Calendário de Eventos

-   **Componentes**: Visualização de calendário com datas de competições, lista e lembretes.

### 3. Tela de Monitoramento de Desempenho

-   **Componentes**: TabLayout com abas para resultados de competições e histórico de treinos.

## Requisitos de Desenvolvimento

1.  **Mínimo de 3 telas**: Perfil do Atleta, Calendário de Eventos e Monitoramento de Desempenho.
2.  **Navegação**:
    -   **Botões** para funcionalidades principais (como salvar perfil, registrar treinos, adicionar competições).
    -   **TabLayout** para navegação entre os conteúdos de Monitoramento de Desempenho.
3.  **Uso do Kotlin e Android Studio**: O app deve ser desenvolvido em Kotlin com o Android Studio como IDE.

## Protótipo de Layout
<a href="https://www.figma.com/design/x6NTtv21fr6z9CyzqJU0TE/prot%C3%B3tipo?t=eKkxvVqO9jgbrQj9-1">Link para o Figma!</a>
