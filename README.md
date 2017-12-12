# Testing Tool Project
   Arizza Santos  
   Dr. Raunak  
   CS483: Software Testing     

## SoapUI-Tutorials.zip
   This zip file contains the SoapUI tutorials that I explored while first learning how to use SoapUI. However, it mostly used the SoapUI Pro version (which I did not download). Also, in order to use the tutorials, you would have to know which inputs are valid in order to send a request into the sample web service they have in each of the tutorials. But, the tutorials in connection to the instructions on the SoapUI website are a great way to get your "feet wet".

## Calculator-soapui-project (main Program Under Test)
   This project contains a simple SOAP web service program.  
   The main java class that I had edited in order to create the WSDL file to be imported into SoapUI is Calculator.java, which contains two methods called sum and product, both of which takes in two int values, a and b. The methods output the sum and product of the two numbers respectively.  
   The project contains a test suite with two main test cases, one for product and one for sum. Within each test case, there are a set of test steps that make verification requests to the web service.  