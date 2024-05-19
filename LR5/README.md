# Design-and-support-methods
# Lab 5. Class diagram

![image](https://github.com/DekartVan/Design-and-support-methods/assets/60447026/c8c8bb25-d493-45b3-b245-1eedcaa6715f)
Описание отношений между классами:   
User и Order: Один пользователь может иметь много заказов (1:N).   
Order и Book: Один заказ может содержать много книг (1:N).   
ShoppingCart и Book: Корзина покупок может содержать много книг (1:N).   
Order и Payment: Один заказ соответствует одному платежу (1:1).    

| Class name    | Attributes/Methods  | Data type/Comment about method assignment           |
|---------------|---------------------|-----------------------------------------------------|
| User          | username            | String                                              |
|               | password            | String                                              |
|               | email               | String                                              |
|               | address             | String                                              |
|               | register()          | This method registers a new user                    |
|               | login()             | This method logs in an existing user                |
|               | updateProfile()     | This method updates the user profile                |
|---------------|---------------------|-----------------------------------------------------|
| Book          | title               | String                                              |
|               | author              | String                                              |
|               | ISBN                | String                                              |
|               | price               | Double                                              |
|               | stock               | Integer                                             |
|               | addBook()           | This method adds a new book                         |
|               | updateBook()        | This method updates book details                    |
|               | searchBook()        | This method searches for a book                     |
|---------------|---------------------|-----------------------------------------------------|
| ShoppingCart  | cartID              | String                                              |
|               | items               | List<Book>                                          |
|               | totalPrice          | Double                                              |
|               | addItem(Book)       | This method adds an item to the cart                |
|               | removeItem(Book)    | This method removes an item from the cart           |
|               | calculateTotalPrice() | This method calculates the total price of the cart |
|---------------|---------------------|-----------------------------------------------------|
| Order         | orderID             | String                                              |
|               | user                | User                                                |
|               | items               | List<Book>                                          |
|               | orderDate           | Date                                                |
|               | status              | String                                              |
|               | createOrder()       | This method creates a new order                     |
|               | cancelOrder()       | This method cancels an existing order               |
|               | updateOrderStatus() | This method updates the status of an order          |
|---------------|---------------------|-----------------------------------------------------|
| Payment       | paymentID           | String                                              |
|               | order               | Order                                               |
|               | amount              | Double                                              |
|               | paymentDate         | Date                                                |
|               | paymentMethod       | String                                              |
|               | processPayment()    | This method processes the payment                   |
|               | refundPayment()     | This method refunds the payment                     |
