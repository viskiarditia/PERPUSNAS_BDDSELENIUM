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
  "duration": 22982714666,
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
  "duration": 2442312250,
  "status": "passed"
});
formatter.match({
  "location": "BerandaSteps.clickMenuBeranda()"
});
formatter.result({
  "duration": 10227313167,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#  Scenario: \"Users Click Scroll to Layanan Kami\""
    },
    {
      "line": 7,
      "value": "#    Then User Hover All Content in Beranda Layanan Kami"
    },
    {
      "line": 8,
      "value": "#  Scenario: \"Users Click Scroll to Unit Kerja\""
    },
    {
      "line": 9,
      "value": "#    Then User Click All Content in Unit Kerja"
    },
    {
      "line": 10,
      "value": "#  Scenario: \"Users Click Scroll to Berita Terbaru\""
    },
    {
      "line": 11,
      "value": "#    Then User Click All Content in Berita Terbaru"
    }
  ],
  "line": 12,
  "name": "\"Users Click Scroll to Buku Terbaru\"",
  "description": "",
  "id": "testing-menu-radio;\"users-click-scroll-to-buku-terbaru\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User Click All Content in Buku Terbaru",
  "keyword": "Then "
});
formatter.match({
  "location": "BerandaReviewSteps.userClickAllContentInBukuTerbaru()"
});
formatter.result({
  "duration": 17927420917,
  "status": "passed"
});
formatter.after({
  "duration": 2173561250,
  "status": "passed"
});
});