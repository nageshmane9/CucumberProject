Feature: Login Feature


  Scenario: Title of the login page
  Given User is on login page
  When Get title of the page
  Then Validate title of the page

   
  Scenario: URL of the login page
  Given User is on login page
  When Get URL of the page
  Then Validate the URL of the page
  
  Scenario: Logo of the login page
  Given User is on login page
  When Logo is displayed or not
  Then Validate the Logo is displayed or not 
  
  Scenario: Login with valid credentials
   Given User is on login page
   When  Enter valid username and valid password
   And Click on login button
   Then Validate user redirected to home page
   
  Scenario: Login with blanck credentials
   Given User is on login page
   When Enter blanck credentials
   And Click on login button
   Then Validate the required message is displayed
   
  Scenario: Login with blank username and valid password
   Given User is on login page
   When Enter blank username and valid password
   And Click on login button
   Then Validate the required message is displayed below username field
   
   Scenario: Login with valid username and blank password
    Given User is on login page
    When Enter valid username and blank password
    And  Click on login button
    Then Validate the required message is displayed below password field

   Scenario: Login with invalid username invalid password
    Given User is on login page
    When Enter invalid username and invalid password
    And Click on login button
    Then Validate Invalid Credentials message will be displayed
    
    Scenario: Login with Valid username invalid password
    Given User is on login page
    When Enter Valid username and invalid password
    And Click on login button
    Then Validate Invalid Credentials message will be displayed
    
    Scenario: Login with invalid username Valid password
    Given User is on login page
    When Enter invalid username and Valid password
    And Click on login button
    Then Validate Invalid Credentials message will be displayed
    
    Scenario: Login with invalid character credentials
    Given User is on login page
    When Enter Special character into the username and  password
    And Click on login button
    Then Validate Invalid Credentials message will be displayed
    
    Scenario: Validate WebApplication version text
     Given User is on login page
     When Get the webapplication vesion text
     Then Validate and Check the vesiontext is correct or not
     
    Scenario: Validate Copy Right text
     Given User is on login page
     When Get copy right text
     Then Validate the copyright text correct or not
     
    Scenario: Validate Linkdn link icon
     Given User is on login page
     When Click on Linkdn icon
     Then Page will redirected to LinkdnProfile
     
     Scenario: Validate Facebook link icon
     Given User is on login page
     When Click on facebook icon
     Then Page will redirected to FacebookProfile
     
     Scenario: Validate twitter link icon
     Given User is on login page
     When Click on twitter icon
     Then Page will redirected to TwitterProfile
     
     Scenario: Validate YouTube link icon
     Given User is on login page
     When Click on YouTube icon
     Then Page will redirected to YouTubeChannel

  

    
      





   
  