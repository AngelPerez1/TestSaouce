Feature: saouceTest
	
	
	@tag2 @testSaouce2
	Scenario: Select product and or add to cart
		Given the user enters the page of virtual shop 
    When the user write the username "USER"
   	When the user write the password "PASSWORD"
		When the user clicks the login button
		When the user selects a product "PRODUCT"
		When the user add the product to the cart "CART"
		And the user goes to the shopping cart
		And the user checkout the purchase "PUCHASE"
		And the user enters his name "PEDRO"
		And the user enters his lastname "PEREZ"
		And the user enters his postal code "COD POST"
		When the user clicks the continue button to continue with the purchase
		And the user clicks on finish to complete the purchase
		And the user goes to page of virtual shop
		And close the page