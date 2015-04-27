<!doctype html>
<html>

<head>
    <meta name="layout" content="main"/>
    <title>Hashtag Palindrome Calculator</title>
    <asset:javascript src="ng-pal.js" />
</head>

<body ng-app="pal">
    <div ng-controller="HashTagController">
        <form class="form-inline" ng-submit="calc()">
            <div class="cover-heading">@<input type="text" ng-model="handle" class="form-control-trans" autofocus /><button type="submit" ng-disabled="loading" class="btn btn-lg btn-default">Go!</button></div>
        </form>

        <div class="tag-list">
            <ul class="list-unstyled">
                <li ng-repeat="item in hashtags"><span class="col-sm-5 col-sm-offset-1 hashtag"><span class="hash">#</span>{{item.tag}}</span><span ng-bind-html="item.count > 999999999 ? item.count.toExponential(2).replace('e+', ' x 10<sup>') + '</sup>' : item.count.toLocaleString()" class="col-sm-5 pal-count"></span></li>
            </ul>
        </div>
    </div>
</body>

</html>
