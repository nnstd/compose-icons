package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisXArrow: ImageVector
    get() {
        if (_AxisXArrow != null) {
            return _AxisXArrow!!
        }
        _AxisXArrow = ImageVector.Builder(
            name = "AxisXArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.5f, 20.5f)
                lineTo(3f, 15.03f)
                lineTo(4.46f, 17.6f)
                lineTo(11f, 13.82f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(13.82f)
                lineTo(22.39f, 19.25f)
                lineTo(21.39f, 21f)
                lineTo(12f, 15.56f)
                lineTo(5.46f, 19.33f)
                lineTo(7f, 21.96f)
                lineTo(1.5f, 20.5f)
                close()
            }
        }.build()

        return _AxisXArrow!!
    }

@Suppress("ObjectPropertyName")
private var _AxisXArrow: ImageVector? = null
