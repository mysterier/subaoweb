$(function(){
  // nav
  $('ul#topnav li').mousemove(function(){
    $(this).find('ul').show();
  });
  $('ul#topnav li').mouseleave(function () {
    $(this).find('ul').hide();
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
//
$('.price-content .sb-relative').mousemove(function(){
  $(this).find('div').show();
})
$('.price-content .sb-relative').mouseleave(function(){
  $(this).find('div').hide();
})

})
