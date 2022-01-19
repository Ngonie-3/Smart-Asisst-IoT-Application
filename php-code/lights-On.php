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
    
  <img src="https://i.pinimg.com/originals/df/30/ce/df30ce307f9cfe83914bd0bb0f6c5ed1.gif" height="300" width="300" class="center">
    
   <p class="text">The lights are switched on</p>
    
<?php
  System("gpio -g mode 27 out");
  System("gpio -g write 27 0");
?>
    
</body>
</html>
