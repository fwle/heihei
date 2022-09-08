$(function () {
    var arrow_l = $('.banner .arrow_l');
    var arrow_r = $('.banner .arrow_r');
    var banner_ol = $('.banner ol');
    var banner = document.querySelector('.banner');
    var banner_ul = banner.querySelector('ul');
    var bannerWidth = banner.offsetWidth;
    $('.banner').mouseenter(function () {
        clearInterval(bannerTimer);
    });
    $('.banner').mouseleave(function () {
        bannerTimer = setInterval(function () {
            arrow_r.click();
        }, 5000);
    });

    for (var i = 0; i < $('.banner ul li').length; i++) {
        var lili = $('<li></li>');
        lili.attr('index', i);
        $('.banner ol').append(lili);
    }
    $('.banner ol li:eq(0)').addClass('current')
    $('.banner ol').children().click(function () {
        var index = $(this).attr('index');
        banner_num = banner_current = index;
        $('.banner ul').stop().animate({
            left: -bannerWidth * index
        }, 500);
        $(this).addClass('current').siblings().removeClass('current');
    });

    var first = banner_ul.children[0].cloneNode(true);
    banner_ul.appendChild(first);
    var banner_num = 0;
    var banner_current = 0;
    var flag = true;

    arrow_l.click(function () {
        if (flag) {
            flag = false;
            if (banner_num == 0) {
                banner_num = $('.banner ul li').length - 1;
                $('.banner ul').css('left', -banner_num * bannerWidth);
            }
            banner_num--;
            $('.banner ul').stop().animate({
                left: -bannerWidth * banner_num
            }, 500, function () {
                flag = true;
            });
            banner_current--;
            if (banner_current < 0) {
                banner_current = $('.banner ol li').length - 1;
            }
            currentChange();
        }
    });

    arrow_r.click(function () {
        if (flag) {
            flag = false;
            if (banner_num == $('.banner ul li').length - 1) {
                banner_num = 0;
                $('.banner ul').css('left', 0);
            }
            banner_num++;
            $('.banner ul').stop().animate({
                left: -bannerWidth * banner_num
            }, 500, function () {
                flag = true;
            });
            banner_current++;
            if (banner_current == $('.banner ol li').length) {
                banner_current = 0;
            }
            currentChange();
        }
    });

    function currentChange() {
        // setTimeout(function () {
        $('.banner ol li').eq(banner_current).addClass('current').siblings().removeClass();
        // }, 300);
    }
    var bannerTimer = setInterval(function () {
        arrow_r.click();
    }, 5000);
});