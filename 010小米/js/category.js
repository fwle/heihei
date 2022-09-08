$(function () {
    $('.list h3').click(function () {
        /* $(this).siblings().fadeToggle(10, function () {
            $(this).siblings().find('div').html('');
        }); */
        $(this).siblings().toggleClass('hide');
        $(this).find('div').toggleClass('color');
        if ($(this).siblings().hasClass('hide')) {
            $(this).find('div').html('');
        } else {
            $(this).find('div').html('');
        }
    });
});