package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadsetOff: ImageVector
    get() {
        if (_HeadsetOff != null) {
            return _HeadsetOff!!
        }
        _HeadsetOff = ImageVector.Builder(
            name = "HeadsetOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.5f, 4.77f)
                lineTo(3.57f, 6.84f)
                curveTo(3.2f, 7.82f, 3f, 8.89f, 3f, 10f)
                verticalLineTo(20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 23f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(12.27f)
                lineTo(15f, 18.27f)
                verticalLineTo(20f)
                horizontalLineTo(16.73f)
                lineTo(19.23f, 22.5f)
                lineTo(20.5f, 21.22f)
                lineTo(2.78f, 3.5f)
                lineTo(1.5f, 4.77f)
                moveTo(12f, 1f)
                curveTo(9.47f, 1f, 7.18f, 2.04f, 5.55f, 3.72f)
                lineTo(6.96f, 5.14f)
                curveTo(8.23f, 3.82f, 10f, 3f, 12f, 3f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(13.18f)
                lineTo(20.5f, 18.67f)
                curveTo(20.81f, 18.19f, 21f, 17.62f, 21f, 17f)
                verticalLineTo(10f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                moveTo(5f, 12f)
                verticalLineTo(10f)
                curveTo(5f, 9.46f, 5.06f, 8.94f, 5.17f, 8.44f)
                lineTo(8.73f, 12f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _HeadsetOff!!
    }

@Suppress("ObjectPropertyName")
private var _HeadsetOff: ImageVector? = null
