### classical pattern implementation
As you can see here, responsibility
of the `director` is only to call the public functions of the builders. `Director` class seems like redundant 
because building phase of our products are quite simple. When the building process of a product is more complicated,
`Director` class is usable to hide the implementation details. In addition, `Director` class gives us the chance
to hide the building details of the Product.

In our example, the product has an inheritance relationship. It is not really necessary according to GOF but I think it 
is good to have an abstraction if the `Product` classes have similar construction process.

### with inner class approach
As you can see here, the responsibility of the `director` class is actually delegated mostly to the singleton.client.
The singleton.client should walk through the process of creation to get the `Product`. The advantage of this approach is 
to obtain an immutable Product. Disadvantage of this approach is that the creation process of the `Product` is 
exposed to `Client` which was hidden before by `Director`.  
