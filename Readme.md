OPMonsters
===
[![Stable Release](https://img.shields.io/badge/dynamic/json?url=https://gist.githubusercontent.com/Johan2403/c37a351ea7f8b87434ddf81145eaf31f/raw/OPMonstersUpdateJSON.json&label=Stable&query=$.promos["1.16.5-recommended"]&color=brightgreen&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyBjbGFzcz0ic3ZnLWlubGluZS0tZmEgZmEtc3RhciBmYS13LTE4IiBhcmlhLWhpZGRlbj0idHJ1ZSIgZGF0YS1pY29uPSJzdGFyIiBkYXRhLXByZWZpeD0iZmFzIiBmb2N1c2FibGU9ImZhbHNlIiByb2xlPSJpbWciIHZpZXdCb3g9IjAgMCA1NzYgNTEyIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPgo8cGF0aCBkPSJNMjU5LjMgMTcuOEwxOTQgMTUwLjIgNDcuOSAxNzEuNWMtMjYuMiAzLjgtMzYuNyAzNi4xLTE3LjcgNTQuNmwxMDUuNyAxMDMtMjUgMTQ1LjVjLTQuNSAyNi4zIDIzLjIgNDYgNDYuNCAzMy43TDI4OCA0MzkuNmwxMzAuNyA2OC43YzIzLjIgMTIuMiA1MC45LTcuNCA0Ni40LTMzLjdsLTI1LTE0NS41IDEwNS43LTEwM2MxOS0xOC41IDguNS01MC44LTE3LjctNTQuNkwzODIgMTUwLjIgMzE2LjcgMTcuOGMtMTEuNy0yMy42LTQ1LjYtMjMuOS01Ny40IDB6IiBmaWxsPSJ3aGl0ZSIvPgo8L3N2Zz4K)](https://www.curseforge.com/minecraft/mc-mods/op-monsters)
[![Latest Release](https://img.shields.io/badge/dynamic/json?url=https://gist.githubusercontent.com/Johan2403/c37a351ea7f8b87434ddf81145eaf31f/raw/OPMonstersUpdateJSON.json&label=Latest&query=$.promos["1.16.5-latest"]&color=blue&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyBjbGFzcz0ic3ZnLWlubGluZS0tZmEgZmEtYnVnIGZhLXctMTYiIGFyaWEtaGlkZGVuPSJ0cnVlIiBkYXRhLWljb249ImJ1ZyIgZGF0YS1wcmVmaXg9ImZhcyIgZm9jdXNhYmxlPSJmYWxzZSIgcm9sZT0iaW1nIiB2aWV3Qm94PSIwIDAgNTEyIDUxMiIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KPHBhdGggZD0iTTUxMS45ODggMjg4LjljLS40NzggMTcuNDMtMTUuMjE3IDMxLjEtMzIuNjUzIDMxLjFINDI0djE2YzAgMjEuODY0LTQuODgyIDQyLjU4NC0xMy42IDYxLjE0NWw2MC4yMjggNjAuMjI4YzEyLjQ5NiAxMi40OTcgMTIuNDk2IDMyLjc1OCAwIDQ1LjI1NS0xMi40OTggMTIuNDk3LTMyLjc1OSAxMi40OTYtNDUuMjU2IDBsLTU0LjczNi01NC43MzZDMzQ1Ljg4NiA0NjcuOTY1IDMxNC4zNTEgNDgwIDI4MCA0ODBWMjM2YzAtNi42MjctNS4zNzMtMTItMTItMTJoLTI0Yy02LjYyNyAwLTEyIDUuMzczLTEyIDEydjI0NGMtMzQuMzUxIDAtNjUuODg2LTEyLjAzNS05MC42MzYtMzIuMTA4bC01NC43MzYgNTQuNzM2Yy0xMi40OTggMTIuNDk3LTMyLjc1OSAxMi40OTYtNDUuMjU2IDAtMTIuNDk2LTEyLjQ5Ny0xMi40OTYtMzIuNzU4IDAtNDUuMjU1bDYwLjIyOC02MC4yMjhDOTIuODgyIDM3OC41ODQgODggMzU3Ljg2NCA4OCAzMzZ2LTE2SDMyLjY2NkMxNS4yMyAzMjAgLjQ5MSAzMDYuMzMuMDEzIDI4OC45LS40ODQgMjcwLjgxNiAxNC4wMjggMjU2IDMyIDI1Nmg1NnYtNTguNzQ1bC00Ni42MjgtNDYuNjI4Yy0xMi40OTYtMTIuNDk3LTEyLjQ5Ni0zMi43NTggMC00NS4yNTUgMTIuNDk4LTEyLjQ5NyAzMi43NTgtMTIuNDk3IDQ1LjI1NiAwTDE0MS4yNTUgMTYwaDIyOS40ODlsNTQuNjI3LTU0LjYyN2MxMi40OTgtMTIuNDk3IDMyLjc1OC0xMi40OTcgNDUuMjU2IDAgMTIuNDk2IDEyLjQ5NyAxMi40OTYgMzIuNzU4IDAgNDUuMjU1TDQyNCAxOTcuMjU1VjI1Nmg1NmMxNy45NzIgMCAzMi40ODQgMTQuODE2IDMxLjk4OCAzMi45ek0yNTcgMGMtNjEuODU2IDAtMTEyIDUwLjE0NC0xMTIgMTEyaDIyNEMzNjkgNTAuMTQ0IDMxOC44NTYgMCAyNTcgMHoiIGZpbGw9IndoaXRlIi8+Cjwvc3ZnPgo=
)](https://www.curseforge.com/minecraft/mc-mods/op-monsters)
[![CurseForge Downloads](http://cf.way2muchnoise.eu/full_396688_downloads.svg)](https://www.curseforge.com/minecraft/mc-mods/op-monsters)
[![Build Status](https://travis-ci.org/Johan2403/OPMonsters.svg?branch=1.16.5)](https://travis-ci.org/Johan2403/OPMonsters)


OPMonsters is a Minecraft Mod created using [Minecraft Forge](http://files.minecraftforge.net). Makes vanilla monsters harder to kill.

### Features
  * Makes zombies spawn with diamond armor, and a diamond axe.
  * Makes skeletons spawn with diamond armor, and a punch bow.
  * Makes creepers spawn charged.

### Download and Installation

#### Players
  * Download Minecraft Forge from [here](http://files.minecraftforge.net/) and run the installer.
  * Download OPMonsters form [CurseForge](https://www.curseforge.com/minecraft/mc-mods/op-monsters) or if you wish to use nightly builds(beta) get it [here](https://github.com/Johan2403?tab=packages&repo_name=OPMonsters).
  * Now, put the mod into the `mods` folder in your `.minecraft` folder.
  * Open Minecraft Forge and start playing. Enjoy!
  * If you wish to edit the config then you can find the config in the `.minecraft/config` folder.

#### Mod Developers
  * Fork this repository. Just click on the fork button.
  * Next clone your fork to your pc using git.
  * Open the project as a gradle project in your IDE.
  * Run the `gradlew genEclipseRuns` and `gradlew eclipse` tasks if you use Eclipse.
  * Run the `gradlew genIntellijRuns` task if you use IntelliJ IDEA.
  * Start hacking the code.

### License
OPMonsters is licensed under the [MIT License](LICENSE)
```
MIT License

Copyright (c) 2020-2021 Johan2403

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

### Issues
Kindly submit issues at [GitHub](http://github.com/Johan2403/OPMonsters). I'll try my best to resolve them. But if you need help setting it up 
use the CurseForge comments to do so.

### Donate
I don't ask or accept donations I just do this for fun and as a hobby, but if you want to 
support me I would like you to share my mods with your friends. I would be really happy.