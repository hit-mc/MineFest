# MineFest

Happy mining with your friends!

## Setup

- Install [fabric loader](https://fabricmc.net/use/) and [fabric api](https://www.curseforge.com/minecraft/mc-mods/fabric-api) on your Minecraft server.

- Put `minefest.jar` into `mods` folder in your server root.

- Use commands to setup the scoreboard, then go mining!

## Commands

All commands starts with `/minefest` or `/mf` for short. Examples below will use `/mf`.

Parameters quoted with `[]` can be omitted, while `<>` means a compulsive parameter.

### /mf `[help]`

Show in-game help menu, which contains all commands and their usages available.

### /mf competitions

Show all competitions (running, paused, stopped).

A competition is of one of these status:

- `PLANNED`: created but not started
- `RUNNING`: started
- `PAUSED`: started but paused
- `STOPPED`: started but stopped manually
- `ENDED` ended automatically

### /mf quit `<competition_name>`

Quit a competition. Note that your score will not be cleared. The game just won't track your actions until you re-join.

### /mf join `<competition_name>`

Join a competition. When a competition is created, all players are joined automatically (the plugin maintains a quit list for each competition, not joined list).

### /mf create `<competition_name>` `<display_name>`

Create a competition with given name.

### /mf goal list `<competition_name>`

List all objectives of given competition.

### /mf goal add `<competition_name>` `<action>` `<subject>` `<score>`

Add a goal. If success, an id will be assigned to this goal.

Available actions:

- `dig`
- `gather`
- `kill`
- `move`

Available subjects:

- `minecraft.blocks:stone`: available only when `<action>` is `dig` or `gather`.
- `any.items`: available only when `<action>` is `gather`.
- `any.players`: available only when `<action>` is kill.

Score:

- positive: add score when the goal is reached
- negative: minus score when the goal is reached
- zero: why you do this?

### /mf goal remove `<competition_name>` `<goal_id>`

Remove the goal of given id.

### /mf end_time set `<competition_name>` `<time|none>`

Set or clear the end time of a competition. If a competition does not have an end time, it will not stop unless manager stop it manually.

Example:

- `/mf set end_time 2020.12.31.23.59.00`
- `/mf set end_time 2020.12.31.23.59`
- `/mf set end_time 2020.12.31.23`
- `/mf set end_time 2020.12`
- `/mf set end_time 2020`

### /mf start `<competition_name>`

Start a competition. A stopped or ended competition cannot be started again.

### /mf pause `<competition_name>`

Pause a competition. A paused competition can be started again with command `/mf start <name>`.

### /mf stop `<competition_name>`

Stop a competition. A stopped competition **cannot** be started again.

### /mf valid_time set day `<competition_name>` `<time_range|all>`

Set the valid competition time in a day. Only events happened in the valid time range will be counted. If set to all, all time in a day is valid.

Example:

- `/mf set valid_time day 8:00-24:00`: events happened in 0:00-8:00 won't be counted.
- `/mf set valid_time day 8:00-10:00,14:00-16:00`: only events happened in 8:00-10:00 or 14:00-16:00 will be counted.
- `/mf set valid_time day all`: all time in a day will be valid.

### /mf valid_time set week `<competition_name>` `<week_days|clear>`

Set valid competition weekdays for a competition.

Example:

- `/mf set valid_time week 6`: only events happened in Saturday will be counted.
- `/mf set valid_time week 1,3,5`: only events happened in Monday, Wednesday, Friday will be counted.
- `/mf set valid_time week all`: all days in a week will be valid.

