Narrative:
I want a report to be generated
So that I can keep a summary of the brute force attack

Scenario: user wants report
Given a toolkit
when user inputs are successful
and the entropy is produced
or the Brute force target is identified
Then, the report is generated
Scenario: user cannot have report
Given a toolkit
when user inputs are unsuccessful
and the entropy is not produced
or the Brute force target is not identified
Then, the report is not generated