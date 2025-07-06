package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MotionPause: ImageVector
    get() {
        if (_MotionPause != null) {
            return _MotionPause!!
        }
        _MotionPause = ImageVector.Builder(
            name = "MotionPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                curveTo(22f, 6.46f, 17.54f, 2f, 12f, 2f)
                curveTo(10.83f, 2f, 9.7f, 2.19f, 8.62f, 2.56f)
                lineTo(9.32f, 4.5f)
                curveTo(10.17f, 4.16f, 11.06f, 3.97f, 12f, 3.97f)
                curveTo(16.41f, 3.97f, 20.03f, 7.59f, 20.03f, 12f)
                curveTo(20.03f, 16.41f, 16.41f, 20.03f, 12f, 20.03f)
                curveTo(7.59f, 20.03f, 3.97f, 16.41f, 3.97f, 12f)
                curveTo(3.97f, 11.06f, 4.16f, 10.12f, 4.5f, 9.28f)
                lineTo(2.56f, 8.62f)
                curveTo(2.19f, 9.7f, 2f, 10.83f, 2f, 12f)
                curveTo(2f, 17.54f, 6.46f, 22f, 12f, 22f)
                curveTo(17.54f, 22f, 22f, 17.54f, 22f, 12f)
                moveTo(5.47f, 3.97f)
                curveTo(6.32f, 3.97f, 7f, 4.68f, 7f, 5.47f)
                curveTo(7f, 6.32f, 6.32f, 7f, 5.47f, 7f)
                curveTo(4.68f, 7f, 3.97f, 6.32f, 3.97f, 5.47f)
                curveTo(3.97f, 4.68f, 4.68f, 3.97f, 5.47f, 3.97f)
                moveTo(18f, 12f)
                curveTo(18f, 8.67f, 15.33f, 6f, 12f, 6f)
                curveTo(8.67f, 6f, 6f, 8.67f, 6f, 12f)
                curveTo(6f, 15.33f, 8.67f, 18f, 12f, 18f)
                curveTo(15.33f, 18f, 18f, 15.33f, 18f, 12f)
                moveTo(11f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(15f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
            }
        }.build()

        return _MotionPause!!
    }

@Suppress("ObjectPropertyName")
private var _MotionPause: ImageVector? = null
