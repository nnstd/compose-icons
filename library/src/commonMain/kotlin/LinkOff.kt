package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LinkOff: ImageVector
    get() {
        if (_LinkOff != null) {
            return _LinkOff!!
        }
        _LinkOff = ImageVector.Builder(
            name = "LinkOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(8.9f)
                horizontalLineTo(17f)
                curveTo(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12f)
                curveTo(20.1f, 13.43f, 19.12f, 14.63f, 17.79f, 15f)
                lineTo(19.25f, 16.44f)
                curveTo(20.88f, 15.61f, 22f, 13.95f, 22f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 7f)
                moveTo(16f, 11f)
                horizontalLineTo(13.81f)
                lineTo(15.81f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                moveTo(2f, 4.27f)
                lineTo(5.11f, 7.38f)
                curveTo(3.29f, 8.12f, 2f, 9.91f, 2f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15.1f)
                horizontalLineTo(7f)
                curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12f)
                curveTo(3.9f, 10.41f, 5.11f, 9.1f, 6.66f, 8.93f)
                lineTo(8.73f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10.73f)
                lineTo(13f, 15.27f)
                verticalLineTo(17f)
                horizontalLineTo(14.73f)
                lineTo(18.74f, 21f)
                lineTo(20f, 19.74f)
                lineTo(3.27f, 3f)
                lineTo(2f, 4.27f)
                close()
            }
        }.build()

        return _LinkOff!!
    }

@Suppress("ObjectPropertyName")
private var _LinkOff: ImageVector? = null
