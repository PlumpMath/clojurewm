# clojurewm

Sick and tired of having no suitable window manager while working in Microsoft
Windows.

Inspired by xmonad, sroctwm, dwm, windawesome, Actual Window Manager,
python-windows-tiler, bug.n.

## Motivation
There is no suitable way to easily organize and recall large numbers of windows
while working on Microsoft Windows. Alt-Tab fails, and moving a hand to the
mouse interrupts flow.  Support for virtual desktops in Windows is bad as well,
especially for multiple monitors.

What is really needed is a way to easily tag and recall windows on demand, free
from any concepts of virtual desktops, monitors or window layouts.

## Intent
clojurewm will:
* provide an easy way to tag windows with any hotkey combination at runtime.
* immediately focus a tagged window whenever this hotkey is entered.
* **not** require a configuration file to set window tags.
* **not** hide any windows (e.g. virtual desktops).
* **not** tile any windows (use http://winsplit-revolution.com/home).

## Usage
### Terms
**window** : any opened window  
**hotkey** : a key combination (e.g. Alt-1, Alt-Shift-T)  
**tag** : a hotkey which is assigned to a window.  

### Commands
#### Tag window
*Alt-Shift-T*  
Assign a hotkey tag to the currently focused window. The next key sequence
entered will used.  Entering the hotkey again will recall all windows tagged
with that hotkey.
    
## TODO
Lots.
* Improve this README.
* Multiple windows per tag.
* Configurable hotkey assignment hotkey (currently only Alt-Shift T).
* Command to display current hotkey list.
* Make release package.
* Bugs?







