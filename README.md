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
My goal (part 1) : COMPLETE 
(part 2) :
DockDoor and locator will extend from a new class abstract class Location and be put in the package Locations. <br />
This has become its own goal as the abstract class of location will be extended by all objects because every object is technicaly a location. Even LPN (Location Product Number) I beilive is a location for the actual product. <br />
All locations will have a:<br />
 date - doesn't need to be used;<br />
 name - location needs a user readable name / == lpn: 1234 / == name : M.KRD/<br />
 department = can be null; <br /> 
 <br />
                                       If methods are loadmethods are contained withen the location all load/move() method logic can be<br />                                          @overwriten is done by the location itself. This way different ojects are loaded to one  another but the method names stay the same (oop principles) <br />
                                       If you wanted, dockDoors and staging lanes could be loaded from the same "screen" this way because as I said the logic is done by the object itself, but if you want them separated different "screens" that could be acomplished just as well. with if (locationObject.locationType() == Const String correctObjectType){};
<br />
<br />
(part 2)<br />
 Another method unload needs to be implemented. So that loaded inventory items can be unloaded and loaded again.<br />
