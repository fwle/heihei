$(function () {
    // 二维码下滑
    var download = $('.header_nav_guild').find('.download');
    download.on('mouseenter mouseleave', function () {
        $(this).find('div').stop().slideToggle(200);
    });

    // 购物车下滑菜单
    var header_nav_login = $('.header_nav_login li:last');
    header_nav_login.on('mouseenter mouseleave', function () {
        header_nav_login.find('div').stop().slideToggle(200);
    });

    // 设置列表显示隐藏
    var site_category_list = $('.subnav_main .site_category_list');
    var children_list = site_category_list.find('.children_list');
    site_category_list.find('.category_item').mouseenter(function () {
        $(this).find('.children_list').show();
    });
    site_category_list.find('.category_item').mouseleave(function () {
        $(this).find('.children_list').hide();
    });

    // 小米下滑菜单栏
    var flag = true;
    $('.subnav_main_list').on('mouseenter', 'li', function () {
        if ($(this).index() == 7 || $(this).index() == 8) {

            $(this).siblings().find('.subnav_list_children').stop().slideUp();
            return false;
        }
        var windowWidth = window.innerWidth - 11;
        // console.log(windowWidth);
        if (flag) {
            $(this).find('.subnav_list_children').css({
                width: windowWidth,
            });
            $(this).find('.subnav_list_children').stop().slideDown(300, function () {
                // flag = false;
            });
        } else {
            $(this).find('.subnav_list_children').css({
                width: windowWidth,
            });
            $(this).find('.subnav_list_children').show();
        }
        flag = false;
        $(this).siblings().find('.subnav_list_children').hide();
    });

    $('.subnav_main_list').mouseleave(function () {
        $(this).find('.subnav_list_children').stop().slideUp(250);
        flag = true;
    });

    // 搜索模块
    var search = $('.subnav .search');
    var search_input = search.find('.search_input');
    search_input.on('focus blur', function () {
        search.find('ul').fadeToggle(10);
        $(this).toggleClass('search_input_focus')
        $(this).siblings('.search_sub').toggleClass('search_sub_focus')
    });

    search.on('mouseenter mouseleave', function () {
        $(this).toggleClass('search_hover');
    });

    var search_input1 = document.querySelector('.search_input');
    var search_lis = search.find('ul li a')
    var search_arr = [];
    for (var i = 1; i < search_lis.length; i++) {
        search_arr.push(search_lis[i].innerHTML);
    }

    var t = 0;
    var search_timer = setInterval(function () {
        if (t == search_arr.length) {
            t = 0;
        }
        search_input1.placeholder = search_arr[t];
        t++;
    }, 5000);

    // 页面主体 列表切换模块
    var home_box = $('.home_box');
    var tab_list_lis = home_box.find('.tab_list li');
    tab_list_lis.mouseenter(function () {
        $(this).addClass('current').siblings().removeClass('current');
        var box_bd_r = $(this).parents('.home_box').find('.box_bd_r');
        var index = $(this).index();
        box_bd_r.eq(index).show().siblings('.box_bd_r').hide();
    });

    // 右侧导航
    if ($(document).scrollTop() < 824) {
        $('.tool-bar .a6').hide();
    }
    $(window).scroll(function () {
        // console.log($(document).scrollTop());
        if ($(document).scrollTop() > 824) {
            $('.tool-bar').css({
                top: 120
            });
            $('.tool-bar .a6').show();
        } else {
            $('.tool-bar').css({
                top: 243
            });
            $('.tool-bar .a6').hide();
        }
    });

    $('.tool-bar .a6').click(function () {
        $("body, html").stop().animate({
            scrollTop: 0
        });
    });

    

});

