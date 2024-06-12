import logo from './logo.svg';
import './App.css';
import Header from './component/Header';
import Footer from './component/Footer';
import CounterClassComponent from './component/CounterClassComponent';
import CounterFunctionalComponent from './component/CounterFunctionComponent';
function App() {
  return (
    <div>
        <Header></Header>
        <CounterClassComponent val="5"></CounterClassComponent>
        <hr color="red" size="2px"></hr>
        <CounterFunctionalComponent></CounterFunctionalComponent>
        <Footer></Footer>
    </div>
  );
}

export default App;
