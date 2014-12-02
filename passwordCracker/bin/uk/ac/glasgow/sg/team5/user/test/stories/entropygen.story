Narrative:
As a user,
I want to generate an entropy
So that, I can check measure the strength of my password

Scenario:user's entropy generated
Given a module,
When brute force attack is attempted on a source password
and it is successful,
Then a entropy is generated.

Scenario:user's entropy not generated
Given a module,
When brute force attack is attempted on a source password
and it is unsuccessful,
Then a entropy is not generated.

Scenario: user did not provide source password
Given a module,
When brute force attack is attempted 
and a source password is not provided
and it is unsuccessful,
Then a entropy is not generated.

Scenario:user's entropy not generated information message prompted
Given a module,
When brute force attack is attempted on a source password
and it is unsuccessful,
Then a entropy is not generated.
and an information message will be prompted "Brute Force attempt failed"

Scenario: user did not provide source password and warning message prompted
Given a module,
When brute force attack is attempted on a source password
and it is unsuccessful,
Then a entropy is not generated.
and an warning message will be prompted "Source password not provided"