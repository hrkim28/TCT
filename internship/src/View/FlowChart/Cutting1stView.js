import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class Cutting1stView extends Component {
    render() {
        return (
            <div className="Cutting1st">
                <Step.Group>
                    {
                        this.props.cutting1st.result === true ?
                            <Step completed>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>1차전단</Step.Title>
                                    <Step.Description>1차 전단 및 주편 가공</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>1차전단</Step.Title>
                                    <Step.Description>1차 전단 및 주편 가공</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default Cutting1stView;
