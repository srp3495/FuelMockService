# FuelMockService
Mock service to get fuel price

Steps

1)First run all the 3 services
  FuelChargeProducer,FuelChargeConsumer and FuelMockService

2)Then start the producer service by calling post api

    https://localhost:8443/api/start  
    
    Request eg:
    {
	    "lidStatus":false,
	    "city":"Kochi"
    }
   
3)Now you can publish the updates using the post api
    
    https://localhost:8443/api/publish  
    
    Request eg:
    {
	    "lidStatus":false,
	    "city":"Kochi"
    }
    
4)Check the logs of Consumer service and you will get the event details and amount to be paid   
