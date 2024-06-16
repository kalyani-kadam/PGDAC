import logo from './logo.svg';
import './App.css';
import "bootstrap/dist/css/bootstrap.css"
import {Routes,Route} from 'react-router-dom'
import Header from "./components/Header";
import Footer from './components/Footer';
import MainNavBar from './components/MainNavBar';
import ProductTable from './pages/ProductTable';
import Homecomponent from './pages/Homecomponent';
import ProductForm from './pages/ProductForm';
import ProductEdit from './pages/ProductEdit';
import ProductDetails from './pages/ProductDetails';
function App() {
  return (
    <div>
      <Header></Header>
      <MainNavBar></MainNavBar>
      <Routes>
          <Route path="/home" element={<Homecomponent/>}></Route>
          <Route path="/table" element={<ProductTable/>}></Route>
          <Route path="/form" element={<ProductForm/>}></Route>
          <Route path="/edit/:id" element={<ProductEdit/>}></Route>
          <Route path="/view/:id" element={<ProductDetails/>}></Route>
      </Routes>
      <Footer></Footer>
    </div>
  );
}

export default App;
