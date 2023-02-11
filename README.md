## **CoderzCalculator**

- Demonstration of a calculator type input from buttons.
- In this demonstration, not all buttons are functional. Only the number buttons, clear button, decimal button, and the backspace button are functional.
- We make use of a ViewModel with a MutableLiveData<String> variable to hold the entry which is observed in the MainActivity class. I have added functions to the ViewModel, which make use of a private StringBuilder viariable for number entry.
- I have also tried to make the decimal button function like the button of a real calculator.
- I have also prevented the ability to have a long string of zeros like a calculator.
