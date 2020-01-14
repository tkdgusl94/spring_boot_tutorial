var main = {
    init : function () {
        var _this = this;
        $('#btn-movies-find').on('click', function () {
            _this.find();
        });
    },
    find : function () {
        var keyword = $('#keyword').val();
        console.log(keyword);
        $.ajax({
            type: 'GET',
            url: '/api/v1/movies/'+keyword,
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
        }).done(function(res) {
            alert(JSON.stringify(res));
        }).fail(function (error) {
            console.log(JSON.stringify(error));
            alert(JSON.stringify(error));
        });
    }
};

main.init();

