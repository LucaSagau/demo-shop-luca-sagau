# Demo Shop Test Automation Framework

## Final project for Luca Sagau - DemoShopLucaSagau

### A short presentation of my project:

 This repository contains a Java project that is responsible for testing the main functionalities of Demo Shop app:
-Login
-Logout
-Product Listing
-Search
-Sort
-Checkout

### Technologies used:
- Java JDK-17
- Maven v4.0.0
- Selenide v6.12.2
- Allure 2.21.0
- Page Object Models

### How to run the test suite:
- git clone https://gitlab.com/LucaSagau/demo-shop-luca-sagau.git

### Execute all test and present report:
- mvn test
- mvn allure:report
- mvn allure:serve

### Page objects tested:
- Header
- Login Modal
- Products Page
- Cart Page
- Wishlist Page
- Search Page
- Sort Dropdown Menu
- Checkout Page
- Summary page
- Footer


 ## Test implemented

                                               ####  **PACKAGE COMPONENTS**

 ## Cart Page Components Test

| Test Number | Test Name                                                      | Status |
|:-----------:|----------------------------------------------------------------|--------|
|      1      | Verify the cart page can be open from home page.               | PASSED |
|      2      | Verify the adding message is displayed on page.                | PASSED |
|      3      | Verify the continue shopping button is displayed on cart page. | PASSED |
|      4      | Verify the continue shopping button is enabled on cart page.   | PASSED |
|      5      | Verify the checkout button is displayed on cart page.          | PASSED |
|      6      | Verify the checkout button is enabled on cart page.            | PASSED |
|      7      | Verify the items total is displayed on cart page.              | PASSED |
|      8      | Verify the tax is displayed on cart page.                      | PASSED |
|      9      | Verify the total is displayed on cart page.                    | PASSED |


 ## Checkout Page Components Test

| Test Number | Test Name                                     | Status |
|:-----------:|-----------------------------------------------|--------|
|      1      | Verify checkout title is displayed.           | PASSED |
|      2      | Verify first name field is displayed.         | PASSED |
|      3      | Verify first name field is enabled.           | PASSED |
|      4      | Verify last name field is displayed.          | PASSED |
|      5      | Verify last name field is enabled.            | PASSED |
|      6      | Verify address field is displayed.            | PASSED |
|      7      | Verify address field is enabled.              | PASSED |
|      8      | Verify cancel button checkout is displayed.   | PASSED |
|      9      | Verify cancel button checkout is enabled.     | PASSED |
|     10      | Verify continue checkout button is displayed. | PASSED |
|     11      | Verify continue checkout button is enabled.   | PASSED |
|     12      | Verify error message is displayed.            | PASSED |

 ### Modal Components Test

 | Test Number | Test Name                               | Status |
|:-----------:|-----------------------------------------|--------|
|      1      | Verify the modal is displayed.          | PASSED |
|      2      | Verify the modal title is Login.        | PASSED |
|      3      | Verify the close button is displayed.   | PASSED |
|      4      | Verify the close button is enabled.     | PASSED |
|      5      | Verify the username field is displayed. | PASSED |
|      6      | Verify the username field is enabled.   | PASSED |
|      7      | Verify the password field is displayed. | PASSED |
|      8      | Verify the password field is enabled.   | PASSED |
|      9      | Verify the login button is displayed.   | PASSED |
|     10      | Verify the login button is enabled.     | PASSED |
       

  ### Product Components Test

| Test Number | Test Name                                        |  Status |
|:-----------:|--------------------------------------------------|---------|
|      1      | Verify the product link to be displayed.         | PASSED  |
|      2      | Verify the product link to be enabled.           | PASSED  |
|      3      | Verify the add to basket icon to be displayed.   | PASSED  |
|      4      | Verify the add to basket icon to be enabled.     | PASSED  |
|      5      | Verify the add to favorite icon to be displayed. | PASSED  |
|      6      | Verify the add to favorite icon to be enabled.   | PASSED  |
|      7      | Verify the product photo to be displayed.        | PASSED  |
|      8      | Verify the product description to be displayed.  | PASSED  |
|      9      | Verify the product price to be displayed.        | PASSED  |
|     10      | Verify the product availability to be displayed. | PASSED  |

  ### Products In Cart Components Test

| Test Number | Test Name                                                                    | Status |
|:-----------:|------------------------------------------------------------------------------|--------|
|      1      | Verify minus button is displayed for al products in cart page.               | PASSED |
|      2      | Verify minus button is enabled for al products in cart page.                 | PASSED |
|      3      | Verify plus button is displayed for al products in cart page.                | PASSED |
|      4      | Verify plus button is enabled for al products in cart page.                  | PASSED |
|      5      | Verify price for one product is displayed for al products in cart page.      | PASSED |
|      6      | Verify price for several products is displayed for al products in cart page. | PASSED |
|      7      | Verify product link is displayed for al products in cart page.               | PASSED |
|      8      | Verify product link is enabled for al products in cart page.                 | PASSED |
|      9      | Verify trash icon is displayed for al products in cart page.                 | PASSED |
|     10      | Verify trash icon is enabled for al products in cart page.                   | PASSED |
                            
  ### Search Page Components Test

 | Test Number | Test Name                              | Status |
|:-----------:|----------------------------------------|--------|
|      1      | Verify the search field is displayed.  | PASSED |
|      2      | Verify the search field is enabled.    | PASSED |
|      3      | Verify the search button is displayed. | PASSED |
|      4      | Verify the search button is enabled.   | PASSED |

  ###  Sort Drop Down Menu Test

| Test Number | Test Name                                          | Status |
|:-----------:|----------------------------------------------------|--------|
|      1      | Verify the sort field is displayed.                | PASSED |
|      2      | Verify the sort field is enabled.                  | PASSED |
|      3      | Verify the sort A to Z is displayed by default.    | PASSED |
|      4      | Verify the sort A to Z is enabled.                 | PASSED |
|      5      | Verify the sort Z to A is displayed.               | PASSED |
|      6      | Verify the sort Z to A is enabled.                 | PASSED |
|      7      | Verify the sort by price low to high is displayed. | PASSED |
|      8      | Verify the sort by price low to high is enabled.   | PASSED |
|      9      | Verify the sort by price high to low is displayed. | PASSED |
|     10      | Verify the sort by price high to low is enabled.   | PASSED |
                            
 ### Static Demo Shop State Test

| Test Number | Test Name                                     | Status |
|:-----------:|-----------------------------------------------|--------|
|      1      | Verify the title application is Demo Shop.    | PASSED |
|      2      | Verify the header contains logo icon.         | PASSED |
|      3      | Verify the header contains cart icon.         | PASSED |
|      4      | Verify the header contains wishlist icon.     | PASSED |
|      5      | Verify the header contains greetings message. | PASSED |
|      6      | Verify the header contains login button.      | PASSED |
|      7      | Verify footer details.                        | PASSED |
|      8      | Verify the footer contains question button.   | PASSED |
|      9      | "Verify the footer contains reset icon.       | PASSED |
    
  ### Sumarry Page Components Test

 | Test Number | Test Name                                                                         | Status |
|:-----------:|-----------------------------------------------------------------------------------|--------|
|      1      | Verify summary title is displayed.                                                | PASSED |
|      2      | Verify cancel button summary is displayed.                                        | PASSED |
|      3      | Verify cancel button summary is enabled.                                          | PASSED |
|      4      | Verify complete your order button is displayed.                                   | PASSED |
|      5      | Verify complete your order button is enabled.                                     | PASSED |
|      6      | Verify thank you message is displayed.                                            | PASSED |
|      7      | Verify order complete title is displayed.                                         | PASSED |
|      8      | Verify continue shopping summary button is displayed.                             | PASSED |
|      9      | Verify continue shopping summary button is enabled.                               | PASSED |
|     10      | Verify if clicking on continue shopping summary button is returning to home page. | PASSED |

 ### Wishlist Page Components Test

| Test Number | Test Name                                            | Status |
|:-----------:|------------------------------------------------------|--------|
|      1      | Verify the wishlist page can be open from home page. | PASSED |
|      2      | Verify the wishlist page is not displayed.           | PASSED |
                                                                    

                                        ####  **PACKAGE END TO END ** 

 ###  End To End User Dino Test

| Test Number | Test Name                                                             | Status |
|:-----------:|-----------------------------------------------------------------------|--------|
|      1      | Verify user dino can login ,add products,increase number of products, | PASSED |
|             | delete products,checkout and complete order on Demo Shop.             |        |
                                             

                                       ###   **PACKAGE SCENARIOS  **

 ### Compare Sum Of Products Price With Items Total Value

 | Test Number | Test Name                                                      | Status |
|:-----------:|----------------------------------------------------------------|--------|
|      1      | Compare sum of products prices in cart with items total value. | FAILED |

   ## Failed because actual results is different from expected results.

   java.lang.AssertionError: Expected value of items total to be 51.96 $.
   Expected :$51.96
   Actual   :$19.98

 ### Decrease Number Of Products In Cart Test

| Test Number | Test Name                                                                                      | Status |
|:-----------:|------------------------------------------------------------------------------------------------|--------|
|      1      | Verify if clicking on minus button for product zero is decreasing number of products in cart.  | PASSED |
|      2      | Verify if clicking on minus button for product one is decreasing number of products in cart.   | PASSED |
|      3      | Verify if clicking on minus button for product two is decreasing number of products in cart.   | PASSED |
|      4      | Verify if clicking on minus button for product three is decreasing number of products in cart. | PASSED |
|      5      | Verify if clicking on minus button for product four is decreasing number of products in cart.  | PASSED |
|      6      | Verify if clicking on minus button for product five is decreasing number of products in cart.  | PASSED |
|      7      | Verify if clicking on minus button for product six is decreasing number of products in cart.   | PASSED |
|      8      | Verify if clicking on minus button for product seven is decreasing number of products in cart. | PASSED |
|      9      | Verify if clicking on minus button for product eight is decreasing number of products in cart. | PASSED |
|     10      | Verify if clicking on minus button for product nine is decreasing number of products in cart.  | PASSED |
                    
 ### Delete Products From Cart Test

| Test Number | Test Name                                                                                      | Status |
|:-----------:|------------------------------------------------------------------------------------------------|--------|
|      1      | Verify if clicking on trash button for product zero is decreasing number of products in cart.  | PASSED |
|      2      | Verify if clicking on trash button for product one is decreasing number of products in cart.   | PASSED |
|      3      | Verify if clicking on trash button for product two is decreasing number of products in cart.   | PASSED |
|      4      | Verify if clicking on trash button for product three is decreasing number of products in cart. | PASSED |
|      5      | Verify if clicking on trash button for product four is decreasing number of products in cart.  | PASSED |
|      6      | Verify if clicking on trash button for product five is decreasing number of products in cart.  | PASSED |
|      7      | Verify if clicking on trash button for product six is decreasing number of products in cart.   | PASSED |
|      8      | Verify if clicking on trash button for product seven is decreasing number of products in cart. | PASSED |
|      9      | Verify if clicking on trash button for product eight is decreasing number of products in cart. | PASSED |
|     10      | Verify if clicking on trash button for product nine is decreasing number of products in cart.  | PASSED |
                           
 ### Increase Number Of Products In Cart Test

| Test Number | Test Name                                                                                     | Status |
|:-----------:|-----------------------------------------------------------------------------------------------|--------|
|      1      | Verify if clicking on plus button for product zero is increasing number of products in cart.  | PASSED |
|      2      | Verify if clicking on plus button for product one is increasing number of products in cart.   | PASSED |
|      3      | Verify if clicking on plus button for product two is increasing number of products in cart.   | PASSED |
|      4      | Verify if clicking on plus button for product three is increasing number of products in cart. | PASSED |
|      5      | Verify if clicking on plus button for product four is increasing number of products in cart.  | PASSED |
|      6      | Verify if clicking on plus button for product five is increasing number of products in cart.  | PASSED |
|      7      | Verify if clicking on plus button for product six is increasing number of products in cart.   | PASSED |
|      8      | Verify if clicking on plus button for product seven is increasing number of products in cart. | PASSED |
|      9      | Verify if clicking on plus button for product eight is increasing number of products in cart. | PASSED |
|     10      | Verify if clicking on plus button for product nine is increasing number of products in cart.  | PASSED |

 ### Login From Cart Page With Valid User Test 

| Test Number | Test Name                                    | Status |
|:-----------:|----------------------------------------------|--------|
|      1      | Verify user dino can login from cart page.   | PASSED |
|      2      | Verify user beetle can login from cart page. | PASSED |
|      3      | Verify user turtle can login from cart page. | PASSED |

 ### Login From Wishlist Page With Valid User Test

| Test Number | Test Name                                        | Status |
|:-----------:|--------------------------------------------------|--------|
|      1      | Verify user dino can login from wishlist page.   | PASSED |
|      2      | Verify user beetle can login from wishlist page. | PASSED |
|      3      | Verify user turtle can login from wishlist page. | PASSED |

 ### Log In Test 

| Test Number | Test Name                                                | Status |
|:-----------:|----------------------------------------------------------|--------|
|      1      | User can login with valid username and valid password.   | PASSED |
|      2      | User can't login with locked user.                       | PASSED |
|      3      | User can't login with no username and no password.       | PASSED |
|      4      | User can't login with valid username and no password.    | PASSED |
|      5      | User can't login with no username and valid password.    | PASSED |
|      6      | User can't login with wrong username and wrong password. | PASSED |
|      7      | User can't login with valid username and wrong password. | PASSED |
|      8      | User can't login with wrong username and valid password. | PASSED |
|      9      | User can't login with wrong username and no password.    | PASSED |
|     10      | User can't login with no username and wrong password.    | PASSED |

 ### Log Out Test

| Test Number | Test Name                                                             | Status |
|:-----------:|-----------------------------------------------------------------------|--------|
|      1      | User can log out after log in with valid username and valid password. | PASSED |

 ### User Beetle Test 

| Test Number | Test Name                                         | Status |
|:-----------:|---------------------------------------------------|--------|
|      1      | Verify user beetle can add product zero in cart.  | PASSED |
|      2      | Verify user beetle can add product one in cart.   | FAILED |
|      3      | Verify user beetle can add product two in cart.   | PASSED |
|      4      | Verify user beetle can add product three in cart. | FAILED |
|      5      | Verify user beetle can add product four in cart.  | PASSED |
|      6      | Verify user beetle can add product five in cart.  | FAILED |
|      7      | Verify user beetle can add product six in cart.   | PASSED |
|      8      | Verify user beetle can add product seven in cart. | FAILED |
|      9      | Verify user beetle can add product eight in cart. | PASSED |
|     10      | Verify user beetle can add product nine in cart.  | FAILED |

  ## Failed because several products can' t be added to cart :
  - product one - Awesome Granite Chips
  - product three - Awesome Metal Chair
  - product five - Awesome Soft Shirt
  - product seven - Practical Metal Mouse
  - product nine - Gorgeous Soft Pizza

  java.lang.AssertionError: Expected number of products in cart to be 1.
  Expected :1
  Actual   :

 ### User Dino Test 

| Test Number | Test Name                                                 | Status |
|:-----------:|-----------------------------------------------------------|--------|
|      1      | Verify user dino can add products in cart.                | PASSED |
|      2      | Verify user dino can add products in wishlist.            | PASSED |
|      3      | Verify user dino can increase number of products in cart. | PASSED |
|      4      | Verify user dino can decrease number of products in cart. | PASSED |
|      5      | Verify user dino can delete products from cart.           | PASSED |
|      6      | Verify user dino can't delete products from cart.         | FAILED |

   ## Failed because user dino can' delete product from cart

   Element not found {#item_9_title_link}
   Expected: exist

  ### User Turtle Test

| Test Number | Test Name                                                   | Status |
|:-----------:|-------------------------------------------------------------|--------|
|      1      | Verify user turtle can add products in cart.                | PASSED |
|      2      | Verify user turtle can add products in wishlist.            | PASSED |
|      3      | Verify user turtle can increase number of products in cart. | PASSED |
|      4      | Verify user turtle can decrease number of products in cart. | PASSED |
|      5      | Verify user turtle can delete products from cart.           | PASSED |
|      6      | Verify user turtle can 't delete products from cart.        | FAILED |
   
   ## Failed because user dino can' delete product from cart      
                                                               
 Element not found {#item_9_title_link}                         
 Expected: exist                                                