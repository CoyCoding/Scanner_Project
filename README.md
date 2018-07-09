# Scanner_Project
A first build of my mock scanner system taking input from user. (Java)<br />
No where near complete but posted to show progress.<br />
<br />
7/8/2018<br />
Scanner as of now:<br />
Loops forever -> <br />
Checks user name and password concurance.<br />
prints selectable text menus. <br />
creates inventory based objects from txt.file and updates txt.file based on changes.<br />
//<br />
(txt "database", easily can be re-writin to sql SELECT FROM WHERE structure for another model.)<br />
//<br />
<br />
NEXT GOAL (part 1)<br />
----------<br />
My goal (part 1) is to give the inventory object a date variable and check it against the Door object.<br />
The inventory object will only be Loaded if the inventory date is after or between the Door ojects dates.<br />
Dock Door object also needs to be an object consisting of a List<<inventoryObject>> to hold and represent the "load"<br />
The inventory object has the boolean loaded to signify the load, but still needs another String LoadLocation for users<br />
<br />
(part 2)<br />
 Another method unload needs to be implemented. So that loaded inventory items can be unloaded and loaded again.<br />
