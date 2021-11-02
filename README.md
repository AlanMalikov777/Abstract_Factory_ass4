# Hdmi-to-vga adapter

This program allows to connect hdmi cable to vga socket with using structural adapter pattern.
# Pattern:
It uses Structural Adapter pattern, with using 2 interfaces, 3 classes and Main class to show tests.
# Tests:
We have a new display that has a hdmi socket and doesn't have a vga socket and that has a vga socket and doesn't have a hdmi socket. So to connect display to case we use hmdi-to-vga connecter.
For user is given a qestion to answer with inserting a number. If he choose 1, it will show to user that display and case was connected successfully.
if he choose 2, user will quit from porgram.
If he choose not 1 or 2, it will send a message that user should rerun program and choose only 1 or 2.

Case 1:
```bash
New Display has a hdmi socket and doesn't have a vga socket.
Old Case has a vga socket and doesn't have a hdmi socket.
Do you wan to Connect Display and Case with using adapter hmdi-to-vga?
Choose number:
1.Yes
2.No
1
Connect via hdmi
With using hmdi-to-vga adapter

Process finished with exit code 0
 ```
Case 2:
```bash
New Display has a hdmi socket and doesn't have a vga socket.
Old Case has a vga socket and doesn't have a hdmi socket.
Do you wan to Connect Display and Case with using adapter hmdi-to-vga?
Choose number:
1.Yes
2.No
2
Bye

Process finished with exit code 0

 ```
Case 3:
```bash
New Display has a hdmi socket and doesn't have a vga socket.
Old Case has a vga socket and doesn't have a hdmi socket.
Do you wan to Connect Display and Case with using adapter hmdi-to-vga?
Choose number:
1.Yes
2.No
4
Please restart a program and enter number between 1-2 only

Process finished with exit code 0

 ```
