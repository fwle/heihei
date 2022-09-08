$(function () {
    // 全选
    $('.checkall').change(function () {
        // console.log(1);
        $('.item-checkbox, .checkall').prop("checked", $(this).prop("checked"));
    });

    // 单选
    $('.item-checkbox').change(function () {
        // console.log($('.item-checkbox:checked'));
        if ($('.item-checkbox:checked').length == $('.item-checkbox').length) {
            $('.checkall').prop("checked", true);
        } else {
            $('.checkall').prop("checked", false);
        }
    });

    // 加法
    $('.increment').click(function () {
        var i = $(this).siblings('.i-ipt').val();
        i++;
        $(this).siblings('.i-ipt').val(i);

        // 计算价格
        var p = $(this).parents('.i-num').siblings('.i-price').children('span').html();
        // console.log(p);
        var price = (p * i).toFixed(2);
        $(this).parents('.i-num').siblings('.i-sum').children('span').html(price);
        getSum();
    });
    // 减法
    $('.decrement').click(function () {
        var i = $(this).siblings('.i-ipt').val();
        i--;
        if (i == 0) {
            i = 1;
        }
        $(this).siblings('.i-ipt').val(i);

        // 计算价格
        var p = $(this).parents('.i-num').siblings('.i-price').children('span').html();
        // console.log(p);
        var price = (p * i).toFixed(2);
        $(this).parents('.i-num').siblings('.i-sum').children('span').html(price);
        getSum();
    });

    // 修改数量
    $('.i-ipt').change(function () {
        var i = $(this).val();
        if (i < 1) {
            i = 1;
        }
        var p = $(this).parents('.i-num').siblings('.i-price').children('span').html();
        var price = (p * i).toFixed(2);
        $(this).parents('.i-num').siblings('.i-sum').children('span').html(price);
        getSum();
    });
    getSum();
    // 总价
    function getSum() {
        var count = 0;
        var money = 0;
        $('.i-ipt').each(function (i, ele) {
            count += parseInt($(ele).val());
        });
        // console.log(count);
        $('.account-left span i').text(count);
        $('.i-sum').each(function (i, ele) {
            money += parseFloat($(ele).text());
        });
        // console.log(money);
        money = money.toFixed(2);
        $('.account-sum i').text(money);
    }

    // 删除
    $('.i-action i').click(function () {
        $(this).parents('.carts-item').remove();
    });
});