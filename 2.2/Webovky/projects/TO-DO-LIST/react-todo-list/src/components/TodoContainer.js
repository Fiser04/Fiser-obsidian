import React from "react";

class TodoContainer extends React.Component {
  state = {
    todos: [
      {
        userId: 1,
        id: 1,
        title: "delectus aut autem",
        completed: false,
      },
      {
        userId: 1,
        id: 2,
        title: "quis ut nam facilis et officia qui",
        completed: false,
      },
      {
        userId: 1,
        id: 3,
        title: "fugiat veniam minus",
        completed: false,
      },
      {
        userId: 1,
        id: 4,
        title: "et porro tempora",
        completed: true,
      },
      {
        userId: 1,
        id: 5,
        title:
          "laboriosam mollitia et enim quasi adipisci quia provident illum",
        completed: false,
      },
    ],
  };

  render() {
    return (
      <div>
        <ul>
          {this.state.todos.map((todo) => (
            <li key={todo.id}>
              {todo.title} - {todo.completed ? "Completed" : "Not completed"}
            </li>
          ))}
        </ul>
      </div>
    );
  }
}

export default TodoContainer;
