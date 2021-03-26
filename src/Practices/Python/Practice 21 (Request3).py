from flask import Flask, jsonify, make_response
from flask_restful import Resource, Api, abort, request

app = Flask(__name__)
api = Api(app)

BOOKS = {
    '1': {
        'isbn': '744586',
        'title': 'Cien años de soledad',
        'description': 'Lorem insup lol.',
        'autor': 'Gabriel Garcia Marquez'
    },
    '2': {
        'isbn': '7894546',
        'title': 'De animales a dioses',
        'description': 'Lorem insup lol.',
        'autor': 'Yuval Noah Harari'
    }
}

def abort_if_book_doesnt_exits(book_id):
    if book_id not in BOOKS:
        abort(404, message='El libro con id {} no existe'.format(book_id))

class BookList(Resource):
    def get(self):
        return jsonify({'data': BOOKS})
    def post(self):
        json = request.get_json(True)
        index = len(BOOKS)+1
        BOOKS.update({'{}'.format(index): json})
        return 'Libro agregado correctamente con ID '+str(index)
        
class Book(Resource):
    def get(self, book_id):
        abort_if_book_doesnt_exits(book_id)
        return jsonify({'data': BOOKS[book_id]})
    def put(self, book_id):
        abort_if_book_doesnt_exits(book_id)
        json = request.get_json(True)
        BOOKS.update({'{}'.format(book_id): json})
        return jsonify({'data': BOOKS[book_id]})
    def delete(self, book_id):
        abort_if_book_doesnt_exits(book_id)
        del BOOKS[book_id]
        return jsonify({'data': BOOKS})
class Authors(Resource):
    pass

class Generes(Resource):
    pass

api.add_resource(BookList, '/API/books')
api.add_resource(Book, '/API/books/<book_id>')
api.add_resource(Authors, '/API/authors')
api.add_resource(Generes, '/API/generes')

if __name__ == '__main__':
    app.run(debug=True)
