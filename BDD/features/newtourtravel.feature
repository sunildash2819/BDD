@newtourtravel
Feature: Feature to register in a flight booking website

@travel
Scenario Outline: Registration in demo flight website
    Given User is navigate to the website
    When User click on the register button
    Then User enter first name as "<first_name>"
    Then User enter last name as "<last_name>"
    Then User enter phone number as "<phone>"
    Then User enter email as "<email>"
    Then User enter address as "<address>"
    Then User enter city as "<city>"
    Then User enter state as "<state>"
    Then User enter postal code as "<postal_code>"
    Then User select counrtry as "<country>"
    Then User enter username as "<username>"
    Then User enter password as "<password>"
    Then User confirm password as "<password>"
    And User click on submit button    

Examples: 
| first_name | last_name | phone      | email                   | address | city | state | postal_code | country | username       | password        |
| sunil      | dash      | 9438211545 | sunildash1908@gmail.com | ORI     | BBS  | ORI   |       11111 | INDIA   | sunil dash     | Asdqwe@123      |
| sahil      | dash      | 9438711545 | sahildash191@gmail.com  | ORI     | BBS  | ORI   |       11111 | INDIA   | sahil dash     | Qwe123@123      |
| bishal     | pal       | 8894312345 | bishalpal@gmail.com     | ORI     | BBS  | ORI   |       11111 | INDIA   | bishal pal     | Bishal@123      |
| satya      | panda     | 9758733456 | satyapanda@gmail.com    | ORI     | SBP  | ORI   |       11111 | INDIA   | satya panda    | qeroze@123      |
| sudesh     | kara      | 9468733212 | sudesh@gmail.com        | ORI     | BRP  | ORI   |       11111 | INDIA   | sudesh kara    | asdfgh@123      |
| anwesha    | mishra    | 9853770995 | anwesha@gmail.com       | ORI     | BBS  | ORI   |       11111 | INDIA   | anwesha mishra | Aqert3545@123   |
| shree      | mahapatra | 9987654456 | shree@gmail.com         | ORI     | BBS  | ORI   |       11111 | INDIA   | shree          | Asdqwe@123      |
| prasson    | panda     | 8875433456 | prasson@gmail.com       | ORI     | BBS  | ORI   |       11111 | INDIA   | prasson panda  | Zxcqwe123@123   |
| praveen    | topno     | 7896677432 | praveen@gmail.com       | ORI     | BBS  | ORI   |       11111 | INDIA   | praveen        | Asdqwe@123      |
| manas      | sahu      | 9898956765 | manas@gmail.com         | ORI     | BBS  | ORI   |       11111 | INDIA   | manas sahu     | Asdfqewe346@123 |
          