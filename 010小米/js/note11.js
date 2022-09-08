$(function () {
    $('.tool-bar a').hover(function () {
        $(this).find('li').eq(1).fadeToggle(0);
        $(this).find('li').eq(0).fadeToggle(0);
    });

    $('.site_category>div').hover(function () {
        $(this).siblings().fadeToggle(0);
    });
    $('.site_category_list').hover(function () {
        $(this).fadeToggle(0);
    });

    // 轮播图
    var arrow_l = $('.note11-img .arrow-l');
    var arrow_r = $('.note11-img .arrow-r');
    var ol = $('.note11-img ol');
    var note11_img = document.querySelector('.note11-img');
    var ul = $('.note11-img ul');

    ul.children('li').eq(0).show().siblings().hide();
    for (var i = 0; i < $('.note11-img ul li').length; i++) {
        var lili = $('<li></li>');
        lili.attr('index', i);
        // console.log(lili);
        $('.note11-img ol').append(lili);
    }
    $('.note11-img ol li:eq(0)').addClass('current');
    $('.note11-img ol').children().click(function () {
        var index = $(this).attr('index');
        t = index;
        ul.children('li').eq(index).fadeIn().siblings().fadeOut();
        // console.log(ul.children('li').eq(index).index());
        $(this).addClass('current').siblings().removeClass('current');
    });
    var t = 0;
    var flag = true;
    arrow_l.click(function () {
        if (flag) {
            flag = false;
            t++;
            if (t == ul.children('li').length) {
                t = 0;
            }
            ul.children('li').eq(t).fadeIn(500, function () {
                flag = true;
            }).siblings().fadeOut();
            ol.children('li').eq(t).addClass('current').siblings().removeClass('current');
        }
    });

    arrow_r.click(function () {
        if (flag) {
            flag = false;
            t--;
            if (t < 0) {
                t = ul.children('li').length - 1;
            }
            ul.children('li').eq(t).fadeIn(500, function () {
                flag = true;
            }).siblings().fadeOut();
            ol.children('li').eq(t).addClass('current').siblings().removeClass('current');
        }
    });
    var str2 = 1699;
    Xuanze();
    $('.xuanze a').click(function () {
        $(this).addClass('current').siblings().removeClass('current');
        Xuanze();
    });

    $('.baoxiu li').click(function () {
        $(this).toggleClass('current').find('input').prop("checked", true).parents('li').siblings().removeClass('current').find('input').prop("checked", false);
        if (!$(this).hasClass('current')) {
            $(this).find('input').prop("checked", false);
        }
        var str = '';
        $('.baoxiu .current').each(function (i, ele) {
            Xuanze();
            str += $(ele).find('h3').text() + '<i class="fr">' + $(ele).find('div div i').html() + '</i>' + '<br>';
            str2 += parseInt($(ele).find('.hide').html());
        });
        $('.zhangdan div i').html(str2);
        $('.zhangdan').find('li').eq(1).html(str);
    });
    function Xuanze() {
        str2 = 1699;
        var str = '';
        $('.xuanze .current').each(function (i, ele) {
            str += $(ele).html() + ' ';
            str2 += parseInt($(ele).find('.hide').html());
        });
        $('.zhangdan').find('li').eq(0).html(str);

        $('.wz').find('span').html(str2 + '&nbsp;<del>' + (str2 + 100) + '</del>');
        $('.zhangdan div i').html(str2);

    }
});