
Readme · MD
# Swagger Petstore API Testing
 
Manual REST API testing project built on the public **Swagger Petstore** sample API.
It documents **38 test cases** for the Pet, Store and User modules in an Excel sheet.
 
## Project Overview
 
The goal of this project is to practise API testing: reading Swagger/OpenAPI documentation, choosing
the right HTTP method and endpoint, preparing request data, and defining the expected status code and
response for both valid and invalid inputs.
 
| Module    | Test Cases | Positive | Negative |
| --------- | ---------- | -------- | -------- |
| Pet API   | 18         | 11       | 7        |
| Store API | 8          | 4        | 4        |
| User API  | 12         | 8        | 4        |
| **Total** | **38**     | **23**   | **15**   |
 
## Files in this Repository
 
```
.
├── README.md
└── Swagger_Petstore_API_Test_Cases.xlsx
```
 
- **Swagger_Petstore_API_Test_Cases.xlsx**
  - `Test Cases` sheet: all 38 test cases
  - `Summary` sheet: positive/negative count per module (calculated with formulas)
## Test Case Columns
 
| Column                    | Meaning                                     |
| ------------------------- | ------------------------------------------- |
| Test Case ID              | Unique id, for example `TC-PET-001`         |
| API Name                  | Pet API, Store API or User API              |
| HTTP Method               | GET, POST, PUT or DELETE                    |
| Endpoint                  | API path, for example `/pet/{petId}`        |
| Test Type                 | Positive or Negative                        |
| Description               | What the test checks                        |
| Request Headers           | Headers sent with the request               |
| Request Body / Parameters | JSON body, form data or query parameters    |
| Expected Status Code      | HTTP code the API should return             |
| Expected Response         | Behaviour the API should show               |
 
## Coverage
 
- **HTTP methods:** GET, POST, PUT, DELETE
- **CRUD operations** on pets, orders and users
- **Positive testing** with valid ids, bodies and parameters
- **Negative testing** with missing fields, malformed JSON, invalid ids and non-existing records
- **Status code checks:** 200, 400, 404, 405
- **Query, path and form-data parameters**, plus bulk user creation with array and list
### Pet API
Add pet, update pet, get pet by id, find by status, find by tags, update with form data,
upload image, delete pet.
 
### Store API
Place order, get order by id, delete order, get inventory.
 
### User API
Create user, create with array, create with list, login, logout, get user,
update user, delete user.
 
## How to Run the Tests
 
1. Open https://petstore.swagger.io/ in a browser.
2. Pick the endpoint named in the test case.
3. Click **Try it out** and enter the headers, parameters or body from the sheet.
4. Click **Execute** and note the status code and response body.
5. Compare them with the **Expected Status Code** and **Expected Response** columns.
6. Mark the case as Pass if they match, otherwise Fail.
## Important Note
 
This repository contains the **test design and expected results**. Actual results are not included.
The Petstore is a shared public demo server, so data can be changed by other users and a few
responses may differ from the documentation. Record actual results from your own execution.
 
## Tools Used
 
- Swagger UI (API execution)
- Microsoft Excel (test case documentation)
- GitHub (version control)
## Future Improvements
 
- Add a Postman collection and run it with Newman
- Automate the cases using REST Assured with TestNG
- Add JSON schema validation and a test execution report
- Add more negative and boundary cases
## Author
 
**Mahalakshmi S**
Register No: 111424104071
