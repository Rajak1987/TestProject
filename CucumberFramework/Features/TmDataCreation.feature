@TmDataCreation 
Feature: This is a TM test data creation feature 

Background: This is a login test 
	Given navigate to TM "<TMUrl>" 
	When Enter "<UserName>" and "<Password>" and click on Login button 
	Then TM home page should be opened successfully 
	
@ShipmentCreation 
Scenario Outline: This is a shipment creation data  scenario 
	Given Goto Shipment processing module and select shipments 
	When Click on New button 
	Then Template page should be opened
	When Enter "<CustomerID>" as cutomer id and refresh the field
	And click on submit button
	Then create shipment page should be displayed
	When enter "<shipmentId>" as shipment Id and "<FreightTerms>" as freight term
	And enter "<OriginLocationType>"  and "<OriginLocationID>" and "<PickupFrom>" and "<PickupTo>" details
	And enter "<DestLocationType>"  and "<DestLocationID>" and "<DeliveryFrom>" and "<DeliveryTo>" details
	And click on submit button
	When enter "<Quantity>" as Quantity and "<ContainerType>" as container type and "<Weight>" as Nominal Weight and "<Volume>" as volume 
	And click on submit/finish button
	And click on Accept Shipment button
	Then shipment create message should be displayed
Examples:
|CustomerID|shipmentId		|FreightTerms|OriginLocationType	|OriginLocationID|PickupFromDate	|PickUpFromTime |PickupToDate	|PickUpTime	|DestLocationType		|DestLocationID	|DeliveryFromDate	|DeliveryFromTime	|DeliveryToDate	|DeliveryToTime	|Quantity	|ContainerType|Weight	|Volume|
|	MOBCUST|AUTOSHIPMENT-01	|Collect	 |Distribution Center	|MOBDC-SANJ		 |02/15/2020		|07:00	   		|02/15/2020		|23:59		|Distribution Center 	|MOBDC-HAN		|02/15/2020			|	08:00			|02/18/2020		|23:59			|4			|PALLET		  |1200		|110|
	
	
	
	
	
