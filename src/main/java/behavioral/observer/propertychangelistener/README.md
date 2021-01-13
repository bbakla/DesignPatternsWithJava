I wrapped `SubjectChangeSupport` and `PropertyChangeListener` classes in this 
implementation to keep the naming consistent with the conventions, but it is 
not necessary at all. You can directly implement your Observer pattern using these 
classes. Your `subject` should have `SubjectChangeSupport` as instance variable 
and your observers should implement `PropertyChangeListener`.