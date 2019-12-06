import React, { Component } from 'react';
import {
    Header,
    Segment,
    TransitionablePortal,
} from 'semantic-ui-react';

class PortalView extends Component {
    render() {
        return (
            <TransitionablePortal
               open={this.props.open}
            >
                <Segment
                    style={{ left: '30%', position: 'fixed', top: '25%', zIndex: 1000 }}
                >
                    <Header>복제조건 미달</Header>
                    <p>복제조건이 만족하지 않기 때문에 벡터 결합을 다시 수행합니다.</p>
                    <p>(복제조건 > 3 만족 시 다음 과정으로 진행)</p>
                </Segment>
            </TransitionablePortal>
        );
    }
}

export default PortalView;