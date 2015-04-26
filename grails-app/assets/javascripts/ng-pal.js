var palApp = angular.module('pal', []);

palApp.controller('PalController',
        [ '$scope', function($scope) {
    
    $scope.calc = function() {
        console.log("hi");
    };
}]);
