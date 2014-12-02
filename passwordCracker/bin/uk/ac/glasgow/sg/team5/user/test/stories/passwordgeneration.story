Narrative:
As a user,
I want to set a combination of password,
So that I can generate a list of password

Scenario: user set combination of password
Given a toolkit 
When user enters a length of passwords
or character sets
or dictionaries
or number of passwords
Then, a list of password will be generate according to the specification

Scenario: user does not key in mandatory parameter
When user does not enter a length of passwords
or character sets
or dictionaries
or number of passwords
Then, a list of password will not be generated

Scenario: user does not key in mandatory parameter warning message appears 
When user does not enter a length of passwords
or character sets
or dictionaries
or number of passwords
Then, a list of password will not be generated
And warning message will appear "Length of password is required"