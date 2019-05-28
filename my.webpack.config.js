module.exports = {
    "entry": {
        "scalajs-cli-test4-opt": ["/Volumes/Personal/forks/scalajs-cli-test/target/scala-2.12/scalajs-bundler/main/scalajs-cli-test4-opt.js"],
        "scalajs-cli-test4-fastopt": ["/Volumes/Personal/forks/scalajs-cli-test/target/scala-2.12/scalajs-bundler/main/scalajs-cli-test4-fastopt.js"]
    },
    "output": {
        "path": "/Volumes/Personal/forks/scalajs-cli-test/target/scala-2.12/scalajs-bundler/main",
        "filename": "index.js"
    },
    "devtool": "source-map",
    "module": {
        "rules": [{
            "test": new RegExp("\\.js$"),
            "enforce": "pre",
            "use": ["source-map-loader"]
        }]
    }
};