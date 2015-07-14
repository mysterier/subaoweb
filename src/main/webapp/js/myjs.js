$(function(){
  $('ul#topnav li').mousemove(function(){
    $(this).find('span').slideDown("1000");
  });
  $('ul#topnav li').mouseleave(function () {
    $(this).find('span').slideUp("fast");
  });

})
