# Introduction
After the advent of Internet there have been a lot of changes in the world. One key changes is in the way of 
conducting commerce. Evolution of exchanging goods physically to digital is one of the major milestone in internet 
revolution.

An ecommerce application mainly has two users seller and consumer. A seller add product to the platform and conumer 
buys products from the platform. A user can be either a seller or consumer with name, address, contact number as the
basic details. Every user must have a valid and unique email address and password.
The platform can store products with basic details like, name, description, manufacturer, sellers, product-owner, 
specification, price. A consumer can fetch for the products and buy, if it is available. Also, to help customer 
choose products, they can create wishlist and throw multiple products for checkout. A cart can be maintained for 
buying multiple products.

## Entities
1. Product:
    - id: Long
    - name: String
    - description: String
    - category: enum(electrocnics, homeneeds etc)
    - price: double
    - productOwner: User //For now product owner is the seller
    - Seller: List<User>
    - specification: Map<String, Object>
2. User:
   - id: Long
   - emailAddress: String
   - password: String //Hashed value
   - Role: enum(Seller, Consumer, Admin)
   - name: String
   - address: 
     - lane: String
     - city: String
     - state: enum() //of all states
     - postalCode: number// 6 character length
   - contactNumber: Long
3. Seller extends User:
   - InventoryList: List<Inventory>
   - Orders: List<Order>
   - 
4. consumer: 
5. Order:
   - id: Long
   - consumerId: Consumer
   - sellerId: Seller
   - orderStatus: enum(intransit, cancelled, payment-failed, delivered)
   - transactionId: Transaction
   - orderValue: Double
   - deliveryDate: Datetime
6. Inventory:
   - product: product
   - availability: Int
   - purchaseDate: DateTime
   - purchasePrice: Double
7. Transaction
   - id: Long
   - transactionDate: Date
   - paymentMode: enum(cash, card, coupons)
   - transactionValue: Double
   - status: boolean
# CRUD Operations
Steps to follow
1. Create model objects according to schema 
2. design API endpoints for the data access

For Product:
1. Fetch all products related to category

# Authentication and Authorization
Login Flow

1. The user hits the frontend and redirects to login page
2. User enter the credentials.
3. The frontend encrypts the credential and pass them to the backend
4. The backend creates session for the user and generates token
5. The token is sent to the user/frontend stored for future request

Validation Flow

1. 