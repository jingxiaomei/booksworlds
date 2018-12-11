/*jQuery(function () {
    $(document).off('.data-api');



})*/

/*toastr.options.positionClass = 'toast-center-center';*/
toastr.options = {
    closeButton: true,
    debug: false,
    progressBar: true,
    positionClass: "toast-center-center",
    onclick: null,
    showDuration: "300",
    hideDuration: "1000",
    timeOut: "2000",
    extendedTimeOut: "1000",
    showEasing: "swing",
    hideEasing: "linear",
    showMethod: "fadeIn",
    hideMethod: "fadeOut"
};



$(".pull-login").click(function () {
    var username = $("#username").val();
    var password = $("#password").val();
    if (isNull(username) || isNull(password)) {
        toastr.warning("账号或密码为空","消息提示");
        return ;
    }
    $.ajax({
        type:"get",
        url:"/login",
        data:{
            username:username,
            password:password
        },
        beforeSend:function(){
            return true ;
        },
        success:function(result){
            if(result.success){
                window.location.href="/mian";
            }else{
                toastr.warning("账号或密码错误","消息提示");
            }
        }
    })
})

/**
 * 判断是否为空
 * @param sb
 * @returns {boolean}
 */
function isNull(sb) {
    if (!sb || sb == null || sb == "" || sb == "undefined" || sb.trim() == "") {
        return true;
    }
    return false;
}