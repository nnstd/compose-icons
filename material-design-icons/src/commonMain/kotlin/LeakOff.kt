package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LeakOff: ImageVector
    get() {
        if (_LeakOff != null) {
            return _LeakOff!!
        }
        _LeakOff = ImageVector.Builder(
            name = "LeakOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                curveTo(8f, 3.37f, 7.96f, 3.72f, 7.88f, 4.06f)
                lineTo(9.47f, 5.65f)
                curveTo(9.81f, 4.84f, 10f, 3.94f, 10f, 3f)
                moveTo(3f, 4.27f)
                lineTo(5.84f, 7.11f)
                curveTo(5.03f, 7.67f, 4.06f, 8f, 3f, 8f)
                verticalLineTo(10f)
                curveTo(4.61f, 10f, 6.09f, 9.45f, 7.27f, 8.54f)
                lineTo(8.7f, 9.97f)
                curveTo(7.14f, 11.24f, 5.16f, 12f, 3f, 12f)
                verticalLineTo(14f)
                curveTo(5.71f, 14f, 8.19f, 13f, 10.11f, 11.38f)
                lineTo(12.61f, 13.88f)
                curveTo(11f, 15.81f, 10f, 18.29f, 10f, 21f)
                horizontalLineTo(12f)
                curveTo(12f, 18.84f, 12.76f, 16.86f, 14.03f, 15.31f)
                lineTo(15.46f, 16.74f)
                curveTo(14.55f, 17.91f, 14f, 19.39f, 14f, 21f)
                horizontalLineTo(16f)
                curveTo(16f, 19.94f, 16.33f, 18.97f, 16.89f, 18.16f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                moveTo(14f, 3f)
                horizontalLineTo(12f)
                curveTo(12f, 4.5f, 11.63f, 5.91f, 11f, 7.16f)
                lineTo(12.44f, 8.62f)
                curveTo(13.42f, 7f, 14f, 5.06f, 14f, 3f)
                moveTo(19.94f, 16.12f)
                curveTo(20.28f, 16.04f, 20.63f, 16f, 21f, 16f)
                verticalLineTo(14f)
                curveTo(20.06f, 14f, 19.16f, 14.19f, 18.34f, 14.5f)
                lineTo(19.94f, 16.12f)
                moveTo(15.38f, 11.56f)
                lineTo(16.84f, 13f)
                curveTo(18.09f, 12.37f, 19.5f, 12f, 21f, 12f)
                verticalLineTo(10f)
                curveTo(18.94f, 10f, 17f, 10.58f, 15.38f, 11.56f)
                close()
            }
        }.build()

        return _LeakOff!!
    }

@Suppress("ObjectPropertyName")
private var _LeakOff: ImageVector? = null
