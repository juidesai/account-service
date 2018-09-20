# account-service
This is the microservice created using Spring boot and deployed on PCF using Jenkins pipeline.
Below are the endpoints which are implemented here. Here Data-Rest Api is also used which provides many default endpoints
but below are the endpoints which it doesn't provide. 

1) Add an account:
Post: /accounts
    Request Body: 
              {
                "firstName":"Jui",
                "lastName":"Soni",
                "email":"jsoni@gmail.com"
              }
2) Add an address for specifi account id:
Post: /accounts/{accountId}/addresses
    RequestBody:
              {
		            "street":"Alvista",
                "apt":"park",
                "city":"unioncity",
                "state":"CA",
                "zipcode":90815,
                "country":"USA"
              }
3) Get Account by account id
Get: /accounts/{accountId}
   Body: 
        {
            "accountId": 1,
            "firstName": "Miku",
            "lastName": "Soni",
            "email": "soni@gmail.com"
        }
4) Get All addresses by Specific Account id:
Get: /accounts/{id}/addresses
    Body:
       [{
		        "street":"Alvista",
            "apt":"park",
            "city":"unioncity",
            "state":"CA",
            "zipcode":90815,
            "country":"USA"
        }]
5) Get Address by specific Address id:
     Body:
        {
		        "street":"Alvista",
            "apt":"park",
            "city":"unioncity",
            "state":"CA",
            "zipcode":90815,
            "country":"USA"
        }
6) Update Address by Account id and Address id:
Put: /accounts/{accountId}/addresses/{addressId}
    RequestBody:
              {
		            "street":"Alvista",
                "apt":"park",
                "city":"unioncity",
                "state":"CA",
                "zipcode":90815,
                "country":"USA"
              }
7) Delete Address by Account id and Address id:
Delete: /accounts/{accountId}/addresses/{addressId}
    
          
