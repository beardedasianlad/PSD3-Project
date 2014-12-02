Narrative:
As a user, 
I want to be able to select a file that is automatically detected by the toolkit 
So that I can know what kind of passwords that can be used for the attack

Scenario: user wants to know file type
Given a module
When the user selects a source 
And the module detects it's a file
Then the module determines the file type
and determine the encryption algorithm of the file
And inform the user "This file is a .pdf file with encryption AES128"

Scenario: user not able to know file type
Given a module
When the user selects a source 
And the module detects it's not a file
Then the module will not be able to determine the file type
And not able to determine the encryption algorithm of the file

Scenario: user unable to know file type and message prompted
Given a module
When the user selects a source 
And the module detects it's not a file
And not able to determine the encryption algorithm of the file
Then the module will not be able to determine the file type
And a information message appears, "source selected cannot be identified"