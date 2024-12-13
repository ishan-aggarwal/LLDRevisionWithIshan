### Q4. Card Game Class Diagram Design

Design class diagram for a simple card game.

A standard deck of cards consists of 52 cards, divided into four suits: Hearts, Diamonds, Clubs, and Spades. Each suit
has 13 ranks: 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, and Ace.

**Requirements:**

1. Model the following entities: Card, Deck, Player, and Game.
2. Each Card has a suit and a rank.
3. Deck should support the following operations:
    * Shuffle the cards.
    * Deal a card to a player.
    * Return the number of remaining cards.
4. The game supports multiple players, but for simplicity, assume a maximum of 4 players.
5. Each Player has:
    * A hand of cards.
    * An operation to receive a card.
    * An operation to show their cards.
6. Game should be able to:
    * Start a new game.
    * Distribute cards to players.
    * Declare a winner based on some simple criteria (e.g., the player with the highest card).
7. The game should have a state, such as NOT_STARTED, IN_PROGRESS, or COMPLETED.
8. Design flexibility to add new rules or scoring mechanisms in the future.
9. There should be a class or method to validate the game rules.

