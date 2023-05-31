# SI_2023_lab2_203277
# Лука Индовски, бр. на индекс 203277

# 2. Control Flow Graph

![CFG](https://github.com/lukaindovski/SI_2023_lab2_203277/assets/102996482/4ed6722d-880c-46d4-be71-fe7957e2f832)

# 3. Цикломатска комплексност
Цикломатската комплексност формула: Број на ребра - број на јазли + 2... Ние имаме 33 ребра, 24 јазли (33 - 24 = 9), 9 + 2 = 11. 

# 4. ЕveryBranch 5 тест случаи

- user да е null - ќе влезе во првиот if, ќе фрли exception и ќе оди до крај
- User user = new User(null, "12345", "LukaIndovski") - проверува дали username е null, продолжува во делот каде што се иницијализираат стринговите поради тоа што email не содржи @ и последно ќе ја провери лозинката дали е помала од 8 карактери
- User user = new User ("Indo", "513245123", "luka.indovski@students.finki.ukim.mk"),("Indovski", "2432431", "luka.indovski@students.finki.ukim.mk"),("Luka", "1345", "luka.indovski@students.finki.ukim.mk"),("LukaIndo", "55622321", "luka.indovski@students.finki.ukim.mk"); 
овој тест случај проверува дали e-mail содржи @ или . и ќе провери дали password содржи празно место и ќе отиде во последниот return false;
- User user = new User ("luka", "luka", "LukaIndovski");
овој тест случај проверува дали некој карактер од username се содржи во лозинката и ќе врати falsе
- User user = new User (null, "luka", "luka.indovski@students.finki.ukim.mk");
овој тест случај врши проверка дали username e null
