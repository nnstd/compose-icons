package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisYArrow: ImageVector
    get() {
        if (_AxisYArrow != null) {
            return _AxisYArrow!!
        }
        _AxisYArrow = ImageVector.Builder(
            name = "AxisYArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 20.5f)
                lineTo(17f, 21.96f)
                lineTo(18.53f, 19.35f)
                lineTo(12f, 15.58f)
                lineTo(2.61f, 21f)
                lineTo(1.61f, 19.27f)
                lineTo(11f, 13.85f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(13.85f)
                lineTo(19.53f, 17.61f)
                lineTo(21f, 15.03f)
                lineTo(22.5f, 20.5f)
                close()
            }
        }.build()

        return _AxisYArrow!!
    }

@Suppress("ObjectPropertyName")
private var _AxisYArrow: ImageVector? = null
