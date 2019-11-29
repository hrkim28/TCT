import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class CastingCutView extends Component {
    render() {
        return (
            <div className="CastingCut">
                <Step.Group>
                    {
                        this.props.castingCut.result === true ?
                            <Step completed>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>주조</Step.Title>
                                    <Step.Description>주조 및 1,2차 전단 판단</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>주조</Step.Title>
                                    <Step.Description>주조 및 1,2차 전단 판단</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default CastingCutView;
