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
                                <Icon name='code branch' />
                                <Step.Content>
                                    <Step.Title>벡터결합</Step.Title>
                                    <Step.Description>복제 세포와 벡터 결합</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='code branch' />
                                <Step.Content>
                                    <Step.Title>벡터결합</Step.Title>
                                    <Step.Description>복제 세포와 벡터 결합</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default SteelMakingView;
