<!DOCTYPE html>
<head>
<style>
  
  body{
    background-color: #553D67;
  }
  
  .center{
    display: block;
    margin-left: auto;
    margin-right: auto;
    border-radius: 10%;
  }
  
  .text{
    color: white;
    font-size: 30px;
    text-align: center;
    font-family: Georgia, serif; 
  }
  
</style>
</head>
<body>
  
  <img src="https://c.tenor.com/1a0ubKklMkcAAAAC/airboss-vorenzzia.gif" height="300" width="300" class="center">
  
  <p class="text">The fan has been turned off</p>
  
<?php
  System("gpio -g mode 22 out");
  
  System("gpio -g write 22 1");
?>  
  
</body>
</html>
