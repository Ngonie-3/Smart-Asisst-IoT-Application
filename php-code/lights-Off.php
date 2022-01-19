<!DOCTYPE html>
<html>
<head>
<style>
  
  body{
    background-color: #553D67;
  }
  
  .center{
    display: block;
    margin-left: auto;
    margin-right: auto;
    border-radius: 10%
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
    
  <img src="https://c.tenor.com/JsyYsAY6mgYAAAAC/camera-ikea.gif" height="300" width="300" class="center">
    
   <p class="text">The lights are switched off</p>
    
<?php
  System("gpio -g mode 27 out");
  System("gpio -g write 27 1");
?>
    
</body>
</html>
