<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Train Ticket Generator</title>
    <link rel="stylesheet" type="text/css" href=main.css>
</head>
<body>
<div class="main">
    <h1>Welcome To Train Ticket Application</h1>
    <div id="welcome">
        <h2>Train Details</h2>
        <center>
        <table border="0" width="600" height="300" >
            <tr>
                <td><b>Train No</b></td>
                <td><b> Train Name</b></td>
                <td><b> Source</b></td>
                <td><b>Destination</b></td>
                <td><b>Price</b></td>
            </tr>
            <tr>
                <td>1001</td>
                <td>Shatabdi Express</td>
                <td>Bangalore</td>
                <td>Delhi</td>
                <td>2500</td>
            </tr>
            <tr>
                <td>1002</td>
                <td>Shatabdi Express</td>
                <td>Delhi</td>
                <td>Bangalore</td>
                <td>2500</td>
            </tr>
            <tr>
                <td>1003</td>
                <td> Udyan Express</td>
                <td>Bangalore</td>
                <td>Mumbai</td>
                <td>1500</td>
            </tr>
            <tr>
                <td>1004</td>
                <td>Udyan Express</td>
                <td>Mumbai</td>
                <td>Bangalore</td>
                <td>1500</td>

            </tr>
            <tr>
                <td>1004</td>
                <td>Brindhavan Express</td>
                <td>Bangalore</td>
                <td>Chennai</td>
                <td>1000</td>


            </tr>
            <tr>
                <td>1006</td>
                <td> Brindhavan Express</td>
                <td>Chennai</td>
                <td>Bangalore</td>
                <td>1000</td>
            </tr>
        </table>
         <button class="btn" id="generate">Book Ticket</button>
        </center>
    </div>
    <div id="ticketForm">
        <form method="POST" action="Ticket.jsp">
            <h2>Please Enter Your Details</h2>
<br>

           <div id="trains" class="inputField" type="text" name="trainNum" class="row">
          <label>Train No: </label>

          <input id="numb">





                <button style="background-color: grey"; type="button" onclick="myFunction()">Validate</button>
                <p style="background-color: red";   id="demo"></p>
                 <p style="background-color: green";   id="demo1"></p>





</div>
            <div class="row">
                <label>Travel Date: </label>
                <input class="inputField" type="date" id="date" name="travelDate" disabled />
            </div>
            <div class="row">
                <label>Passengers:</label>
                <div>
                    <select disabled name="passengerNumber" id="numberOfPassengers" class="inputField">
                        <option value="0" selected disabled>Number of Passengers</option>
                        <option value="1">One</option>
                        <option value="2">Two</option>
                        <option value="3">Three</option>
                        <option value="4">Four</option>
                        <option value="5">Five</option>
                        <option value="6">Six</option>
                        <option value="7">Seven</option>
                        <option value="8">Eight</option>
                    </select>
                </div>

            </div>
            <div id="passengers" class="row">

            </div>
            <button id="submit" class="btn">Submit</button>
        </form>
    </div>
</div>
<script>
function myFunction() {
  // Get the value of the input field with id="numb"
  let x = document.getElementById("numb").value;

  let text;
  let text1;
  if (isNaN(x) || x < 1001 || x > 1006) {

    text = "Please enter train number between 1001 and 1006";
     document.getElementById("demo").innerHTML = text;
  } else {
    text1 = "Valid train number";
    document.getElementById("demo1").innerHTML = text1;
  }

}
</script>

<script src=script.js></script>
</body>
</html>