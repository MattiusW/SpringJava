import { Component } from 'react';


class App extends Component{

  state = {
    name: "Mati"
  }

  render(){
    return(
      <div>
        Hello {this.state.name}
      </div>
    )
  }

}

export default App;
