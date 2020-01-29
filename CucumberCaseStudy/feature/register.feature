Feature: Register

@Data-Driven
Scenario: Register on TestMe App
Given user open TestmeApp
When user click signup
And enter user name as "pppooja456" 
And enter first name as "pooja" 
And enter last name as "patil" 
And enter password as "pooja985612" 
And enter confirm password as "pooja985612"
And user select gender as "female"
And enter email as "patilpooja@gmail.com"
And enter mobile no. as "9245674567"
And enter DOB as "2/6/1997"
And enter address as "punesolapurnashik"
And user select security question as "what is your favourite color"
And enter answer as "pink"
Then user click on Register

@login
Scenario: Login using DataTable
Given user opens TestMeApp
When user click SignIn
And user enters credentials as
|lalitha| 
|Password123|