$(function () {
    var li = $('.login-main>ol li');
    var ul = $('.login-main .hidden>ul');
    li.click(function () {
        console.log($(this).index());
        $(this).addClass('current').siblings().removeClass('current');
        var index = $(this).index();
        ul.stop().animate({
            left: -index * 360
        }, 200);
        flag1 = false;
        flag2 = false;
        flag3 = false;
        sub_text.removeClass('inp-focus');
        sub_text.removeClass('inp-wrong');
        sub_pas.removeClass('inp-focus');
        sub_pas.removeClass('inp-wrong');
        submit.removeClass('submit-right');
        sub_text_span.hide();
        sub_pas_span.hide();
    });

    var sub_text = $('.sub-text');
    var sub_pas = $('.sub-pas');
    var sub_text_span = $('.sub-text-span');
    var sub_pas_span = $('.sub-pas-span');
    var submit = $('.submit');
    var flag1 = false;
    var flag2 = false;
    var flag3 = false;
    $('.inp-checkbox').change(function () {
        if ($('.inp-checkbox:checked').length == 1) {
            flag3 = true;
            $('.tiaokuan').hide();
        } else {
            flag3 = false;
        }
    });
    sub_text.focus(function () {
        inp_focus($(this));
    });

    sub_pas.focus(function () {
        inp_focus($(this));
    });
    sub_text.blur(function () {
        $(this).removeClass('inp-focus');
        if ($(this).val() == '') {
            $(this).addClass('inp-wrong');
            sub_text_span.show();
            flag1 = false;
        } else {
            $(this).removeClass('inp-wrong');
            sub_text_span.hide();
            flag1 = true;
        }
        submit_right();
    });
    sub_pas.blur(function () {
        $(this).removeClass('inp-focus');
        if ($(this).val() == '') {
            $(this).addClass('inp-wrong');
            sub_pas_span.show();
            flag2 = false;
        } else {
            $(this).removeClass('inp-wrong');
            sub_pas_span.hide();
            flag2 = true;
        }
        submit_right();
    });

    function submit_right() {
        if (flag1 && flag2) {
            submit.addClass('submit-right');
        } else {
            submit.removeClass('submit-right');
        }
    }
    function inp_focus(fn) {
        fn.addClass('inp-focus');
    }
    submit.click(function () {
        if (flag1 && flag2 && flag3) {
            alert('乌哈乌哈');
        } else if (!flag3 && flag1 && flag2) {
            $('.tiaokuan').show();
        }
    });
});