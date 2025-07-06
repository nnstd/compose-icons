package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoBoxOff: ImageVector
    get() {
        if (_VideoBoxOff != null) {
            return _VideoBoxOff!!
        }
        _VideoBoxOff = ImageVector.Builder(
            name = "VideoBoxOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                horizontalLineTo(6.73f)
                lineTo(14f, 15.27f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                moveTo(2.27f, 1f)
                lineTo(1f, 2.27f)
                lineTo(3f, 4.28f)
                curveTo(2.41f, 4.62f, 2f, 5.26f, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(18.73f)
                lineTo(20.73f, 22f)
                lineTo(22f, 20.73f)
                moveTo(20f, 4f)
                horizontalLineTo(7.82f)
                lineTo(11.82f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(10.18f)
                lineTo(14.57f, 10.75f)
                lineTo(18f, 8f)
                verticalLineTo(14.18f)
                lineTo(22f, 18.17f)
                curveTo(22f, 18.11f, 22f, 18.06f, 22f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                close()
            }
        }.build()

        return _VideoBoxOff!!
    }

@Suppress("ObjectPropertyName")
private var _VideoBoxOff: ImageVector? = null
