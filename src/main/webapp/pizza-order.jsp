<%--
  Created by IntelliJ IDEA.
  User: michaelgalimore
  Date: 2/4/22
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza R US</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<h1>Welcome!</h1>

<form method= "post" action="/pizza-order">
<%--Crusts--%>

    <label for="crust"></label>
    <select id="crust" name="crust">
        <option selected>Choose your crust</option>
        <option value="pan">Pan</option>
        <option value="hand">Hand</option>
        <option value="thin">Thin</option>
    </select>


<%--Sauces--%>
    <label for="sauce"></label>
    <select id="sauce" name="sauce">
        <option selected>Choose your sauce</option>
        <option value="tomato">Tomato</option>
        <option value="alfredo">Alfredo</option>
        <option value="marinara">Marinara</option>
    </select>


<%--Pizza Sizes--%>
    <label for="size"></label>
    <select name="size" id="size" >
        <option>Choose your size</option>
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>

<h2>Choose your Toppings</h2>

<input type="checkbox" id="Ham" name="toppings" value="ham">
<label for="ham">Ham</label><br>
<input type="checkbox" id="Beef" name="toppings" value="beef">
<label for="beef"> Beef</label><br>
<input type="checkbox" id="Pepperoni" name="toppings" value="pepperoni">
<label for="pepperoni"> Pepperoni</label><br>


<%--    Address Input--%>
    <h1>Enter Address for Delivery</h1>
<label for="address"> Will be delivered to:</label>
    <input type="text" id="address" name="address" placeholder= "address"><br><br>
    <input type="submit" value="Submit Your Order">
</form>






<%--<%--%>
<%--    if(request.getMethod().equalsIgnoreCase("post")) {--%>


<%--        String crust = request.getParameter("crust");--%>
<%--        String sauce = request.getParameter("sauce");--%>


<%--        if (request.getMethod() == null) {--%>
<%--            response.sendRedirect("/pizza-order");--%>
<%--            System.out.println(crust,sauce,topping,street-address,city,zipcode);--%>
<%--        }--%>

<%--    }--%>

<%--    request.getRequestDispatcher("/hello.jsp").forward(request, response);--%>

<%--%>--%>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>
