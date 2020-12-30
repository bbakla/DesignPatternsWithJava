To avoid multiple concrete Employee classes, you could also create only one concrete Employee class
and set the children of Leaf classes to `null` or initialize them lazily when adding operation is called.
However, this operation has also its own disadvantages.