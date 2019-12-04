import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class SteelMakingView extends Component {
    render() {
        return (
            <div className="SteelMaking">
                <Step.Group>
                    {
                        this.props.steelMaking.result === true ?
                            <Step completed>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>제강</Step.Title>
                                    <Step.Description>1,2차 정련/ 용선 제작</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>제강</Step.Title>
                                    <Step.Description>1,2차 정련/ 용선 제작</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default SteelMakingView;
