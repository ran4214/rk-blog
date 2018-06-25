function switchContent(contentName){
    $(".main-content").children().remove();
    $(".main-content").load("/login");
}