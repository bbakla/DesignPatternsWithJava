- I checked several example codes but none of them contains a proper `memento`
object, because all of them exposes the state to the outside world.
- There are also different implementations about the responsibility of 
 creatingSnapshot and restoring the state. Some of them give it to CareTaker, or 
 share it between Originator and Care Taker. I also show an example that assigns
 `Memento` for restoring.  