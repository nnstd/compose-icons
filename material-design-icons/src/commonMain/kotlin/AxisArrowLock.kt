package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisArrowLock: ImageVector
    get() {
        if (_AxisArrowLock != null) {
            return _AxisArrowLock!!
        }
        _AxisArrowLock = ImageVector.Builder(
            name = "AxisArrowLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 5f)
                curveTo(22.4f, 5f, 23f, 5.6f, 23f, 6.3f)
                verticalLineTo(9.8f)
                curveTo(23f, 10.4f, 22.4f, 11f, 21.7f, 11f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 11f, 15f, 10.4f, 15f, 9.7f)
                verticalLineTo(6.2f)
                curveTo(15f, 5.6f, 15.6f, 5f, 16.2f, 5f)
                verticalLineTo(3.5f)
                curveTo(16.2f, 2.1f, 17.6f, 1f, 19f, 1f)
                curveTo(20.4f, 1f, 21.8f, 2.1f, 21.8f, 3.5f)
                verticalLineTo(5f)
                moveTo(20.5f, 5f)
                verticalLineTo(3.5f)
                curveTo(20.5f, 2.7f, 19.8f, 2.2f, 19f, 2.2f)
                curveTo(18.2f, 2.2f, 17.5f, 2.7f, 17.5f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(20.5f)
                moveTo(1.74f, 19.25f)
                lineTo(3.21f, 13.79f)
                lineTo(4.68f, 16.34f)
                lineTo(9f, 13.85f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                lineTo(10f, 2f)
                lineTo(14f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(13.85f)
                lineTo(18.03f, 17.86f)
                lineTo(19.5f, 15.28f)
                lineTo(21f, 20.74f)
                lineTo(15.5f, 22.21f)
                lineTo(17.03f, 19.6f)
                lineTo(10f, 15.58f)
                lineTo(5.68f, 18.07f)
                lineTo(7.21f, 20.71f)
                lineTo(1.74f, 19.25f)
                close()
            }
        }.build()

        return _AxisArrowLock!!
    }

@Suppress("ObjectPropertyName")
private var _AxisArrowLock: ImageVector? = null
