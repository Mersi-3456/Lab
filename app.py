from flask import Flask, request, render_template

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('register.html')

@app.route('/register', methods=['POST'])
def register():
    name = request.form['name']
    email = request.form['email']
    event = request.form['event']

    return render_template('success.html', name=name, event=event)

if __name__ == '__main__':
    app.run(debug=True,port=5001)