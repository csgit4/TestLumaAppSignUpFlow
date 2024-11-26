

Feature: HomePage functionality


Scenario: Create new customer account with valid details
          Given user is on the home page
          When user click on Create an Account link
          Then user redirected to the account creation page and verify title is "Create New Customer Account"
          When user enter valid firstname: "Somnath" 
          And enter valid lastname: "Shinde"
          And enter valid email: "newuser561@example.com"
          And enter valid password: "StrongPassword!23"
          And enter valid confirm password: "StrongPassword!23"
          And click on Create an Account button
          Then user account should be created and verify message "Thank you for registering with Main Website Store."




Scenario: Sign-in with already registered email
          Given user is on the home page
          When user click on Sign In link
          Then user redirected to the customer login page and verify title is "Customer Login"
          When the user enters registered email: "newuser561@example.com"
          And valid password: "StrongPassword!23"
          And clicks the Sign In button
          Then user should successfully Sign-in into the system and see greet message as "Welcome, Somnath Shinde!"
       

