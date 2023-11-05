Feature: Home Feature

Background: 
 Given User is on home page
    
    
Scenario: Validate Logo
 Given User is on home page
 When Check logo is displayed or not
 Then Validate the logo is displayed 
 
 Scenario: Validate search functionality
  Given User is on home page
  When Check the search is enabled or not
  And Enter the text into the search field
  Then Validate the search field 

 Scenario: Validate admin module
  Given User is on home page
  When Check whether is clickable then click on admin
  Then  Page will redirected to admin module
 


