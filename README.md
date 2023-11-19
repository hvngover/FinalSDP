# Software Design Patterns | FINAL PROJECT

Developed by: Meirzhan Muratbek and Alibekov Zhandos  | se-2215

GitHub Repository: [https://github.com/hvngover/FinalSDP.git](https://github.com/hvngover/FinalSDP.git)

## Main Information

This project is an architectural blueprint for a multiplayer RPG game. We focused on integrating several software design patterns to enhance the game's mechanics and features like dynamic environments, character progression, and interactive elements. Our game features four primary classes: Warrior, Sorcerer, Ranger, and Healer, built upon a flexible Character base class.


We implemented 6 core design patterns: Adapter, Decorator, Observer, Singleton, Strategy, and Factory.

### UML Diagram

![src](https://github.com/hvngover/FinalSDP/assets/109821023/22f13b75-53d8-4ec1-a582-9d42d4dcc6ac)

### Adapter
- Components: ElemantalMagic, Blaze, Zephyr classes, and MagicAdapter.
- Purpose: Facilitates the transition from physical combat to magical abilities, allowing characters to switch between using weapons and casting spells.
### Observer
- Components: Observer interface, NotificationCenter, NewsSubscriber,GameSystem classes.
- Purpose: Keeps players informed about in-game events and updates, particularly those who opt-in for real-time notifications.
### Singleton
- Components: ServerStatus class.
- Purpose: Ensures there is only one instance of the game world, maintaining a consistent and shared environment for all players.
### Strategy
- Components: WeaponBehavior interface, various attack strategy classes (e.g., BattleAxe, Dagger).
- Purpose: Allows characters to change their combat strategies dynamically, adapting to different combat situations.
### Factory
- Components: EnemyFactory, Enemy interface, Arachnid, Serpent classes.
- Purpose: Used for creating various types of non-playable characters (NPCs) like villagers and merchants in the game world.
## Conclusion

Through this project, we have demonstrated the effective use of design patterns in creating a modular, scalable, and interactive gaming experience.
