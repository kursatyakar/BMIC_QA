Specification Heading
=====================
Created by vrgsl on 4.07.2024

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.


Scenario 1 : First BMI Calculation
----------------------------------
*Open browser
*weight "99" change
*height "199" change
*click button

Scenario 2 : Adding Other Days BMI
----------------------------------
*Open browser
*weight "89" change
*height "170" change
*click button
*weight "65" change
*height "185" change
*click button
*weight "130" change
*height "190" change
*click button

Scenario 3 : Undo BMI Results
-----------------------------
*Open browser
*weight "99" change
*height "210" change
*click button
*weight "55" change
*height "210" change
*click button
*click undo button
*weight "65" change
*height "187" change
*click button

Scenario 4 : Delete BMI Result
--------------------------------------
*Open browser
*weight "80" change
*height "184" change
*click button
*weight "72" change
*height "186" change
*click button
*click delete button

Scenario 5: Calculate BMI Result and Check It
---------------------------------------------
*Open browser
*weight "90" change
*height "199" change
*click button
*Calculate BMI with weight "90" and height "199"
