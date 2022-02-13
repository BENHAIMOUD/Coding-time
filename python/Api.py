from flask import Flask

app = Flask(import_name="__name__")


@app.route('/')
def index():
    return "Hello Family"


if __name__ == "__main__":
    app.run(host="0.0.0.0.0")
