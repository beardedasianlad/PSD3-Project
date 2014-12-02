Narrative:
I want to have a dictionary
so that, i can use the dictionary to conduct a brute force attack

Scenario: toolkit successfully creates a module
Given a toolkit
when toolkit scrape sources from the internet or folders,
and the toolkit stores it in a module
or the user does not specify which module to use
then the toolkit will use any module to brute force

Scenario 2: toolkit successfully creates a module and user specify
Given a toolkit
when toolkit scrape sources from the internet or folders,
and the toolkit stores it in a module
or the user specify which module to use
then the toolkit will use the module specified to brute force

Scenario: toolkit fails to store module
Given a toolkit
when toolkit scrape sources from the internet or folders,
and the toolkit does not stores it in a module
then the toolkit will not start to brute force

Scenario: Error message prompt
Given a toolkit
when toolkit scrape sources from the internet or folders,
and the toolkit does not stores it in a module
then the toolkit will not start to brute force
and error message will appear "No targeted dictionary"