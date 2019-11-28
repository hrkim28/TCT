import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import 'semantic-ui-css/semantic.min.css';

//Redux 관련 import
import { createStore, applyMiddleware } from 'redux';
import reducer from './Reducer/Reducer';
import { Provider } from 'react-redux';

//미들웨어
import thunk from 'redux-thunk';

//Redux 개발툴 설정
const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ ;

// Store 생성
const store = createStore(reducer, composeEnhancers(applyMiddleware(thunk)));

ReactDOM.render(
    <Provider store={store}>
        <App />
    </Provider>,
    document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
