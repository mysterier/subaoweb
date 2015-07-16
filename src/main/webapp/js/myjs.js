$(function(){
  // nav
  $('ul#topnav li').mousemove(function(){
    $(this).find('span').slideDown("1000");
  });
  $('ul#topnav li').mouseleave(function () {
    $(this).find('span').slideUp("fast");
  });
// login
$('.login-top').click(function(){
  $('.theme-popover-mask').fadeIn(100);
  $('.theme-popover').slideDown(200);
})
$('.theme-poptit .close').click(function(){
  $('.theme-popover-mask').fadeOut(100);
  $('.theme-popover').slideUp(200);
})

})
