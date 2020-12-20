# MineFest

Happy mining with your friends!

## Setup

- Install [fabric loader](https://fabricmc.net/use/) and [fabric api](https://www.curseforge.com/minecraft/mc-mods/fabric-api) on your Minecraft server.

- Put `minefest.jar` into `mods` folder in your server root.

- Use commands to setup the scoreboard, then go mining!

## Commands

All commands starts with `/minefest` or `/mf` for short. Examples below will use `/mf`.

Parameters quoted with `[]` can be omitted, while `<>` means a compulsive parameter.

### /mf [help]

Show in-game help menu, which contains all commands and their usages available.

### /mf create <competition_name>

Create a competition with given name.

### /mf set objective <competition_name> \<objective\>

Set objective for a specific competition.

### /mf set end_time \<time|none\>

Set or clear the end time of a competition. If a competition does not have an end time, it will not stop unless manager stop it manually.

Example:

- `/mf set end_time 2020.12.31.23.59.00`
- `/mf set end_time 2020.12.31.23.59`
- `/mf set end_time 2020.12.31.23`
- `/mf set end_time 2020.12`
- `/mf set end_time 2020`

### /mf start \<competition_name\>

Start a competition.

### /mf pause \<competition_name\>

Pause a competition. A paused competition can be started again with command `/mf start <name>`.

### /mf stop \<competition_name\>

Stop a competition. A stopped competition **can not** be started again.

### /mf set valid_time day <competition_name> \<time_range|all\>

Set the valid competition time in a day. Only events happened in the valid time range will be counted. If set to all, all time in a day is valid.

Example:

- `/mf set valid_time day 8:00-24:00`: events happened in 0:00-8:00 won't be counted.
- `/mf set valid_time day 8:00-10:00,14:00-16:00`: only events happened in 8:00-10:00 or 14:00-16:00 will be counted.
- `/mf set valid_time day all`: all time in a day will be valid.

### /mf set valid_time week <competition_name> \<week_days|clear\>

Set valid competition weekdays for a competition.

Example:

- `/mf set valid_time week 6`: only events happened in Saturday will be counted.
- `/mf set valid_time week 1,3,5`: only events happened in Monday, Wednesday, Friday will be counted.
- `/mf set valid_time week all`: all days in a week will be valid.

