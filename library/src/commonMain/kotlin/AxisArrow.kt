package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisArrow: ImageVector
    get() {
        if (_AxisArrow != null) {
            return _AxisArrow!!
        }
        _AxisArrow = ImageVector.Builder(
            name = "AxisArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(16f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(13.85f)
                lineTo(19.53f, 17.61f)
                lineTo(21f, 15.03f)
                lineTo(22.5f, 20.5f)
                lineTo(17f, 21.96f)
                lineTo(18.53f, 19.35f)
                lineTo(12f, 15.58f)
                lineTo(5.47f, 19.35f)
                lineTo(7f, 21.96f)
                lineTo(1.5f, 20.5f)
                lineTo(3f, 15.03f)
                lineTo(4.47f, 17.61f)
                lineTo(11f, 13.85f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _AxisArrow!!
    }

@Suppress("ObjectPropertyName")
private var _AxisArrow: ImageVector? = null
