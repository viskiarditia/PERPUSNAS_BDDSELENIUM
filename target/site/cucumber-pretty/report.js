$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Beranda/beranda-review.feature");
formatter.feature({
  "line": 2,
  "name": "Testing menu Radio",
  "description": "",
  "id": "testing-menu-radio",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Perpusnas"
    },
    {
      "line": 1,
      "name": "@Beranda"
    },
    {
      "line": 1,
      "name": "@beranda-review"
    }
  ]
});
formatter.before({
  "duration": 19990743666,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User open website perpusnas",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click Menu Beranda",
  "keyword": "When "
});
formatter.match({
  "location": "BerandaSteps.userOpenWebsitePerpusnas()"
});
formatter.result({
  "duration": 1424257834,
  "status": "passed"
});
formatter.match({
  "location": "BerandaSteps.clickMenuBeranda()"
});
formatter.result({
  "duration": 6519041708,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "\"Users Click Scroll to Layanan Kami\"",
  "description": "",
  "id": "testing-menu-radio;\"users-click-scroll-to-layanan-kami\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User Hover All Content in Beranda Layanan Kami",
  "keyword": "Then "
});
formatter.match({
  "location": "BerandaReviewSteps.userHoverAllContentInBerandaLayananKami()"
});
formatter.result({
  "duration": 18912567709,
  "status": "passed"
});
formatter.after({
  "duration": 2118037459,
  "status": "passed"
});
});