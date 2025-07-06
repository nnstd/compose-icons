package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CubeOff: ImageVector
    get() {
        if (_CubeOff != null) {
            return _CubeOff!!
        }
        _CubeOff = ImageVector.Builder(
            name = "CubeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(17.28f, 19.17f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22f, 12f, 22f)
                reflectiveCurveTo(11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3f, 16.88f, 3f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(4.3f, 6.19f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(12f, 4.15f)
                lineTo(17.96f, 7.5f)
                lineTo(13.31f, 10.11f)
                lineTo(20.53f, 17.33f)
                curveTo(20.82f, 17.16f, 21f, 16.85f, 21f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21f, 7.12f, 20.79f, 6.79f, 20.47f, 6.62f)
                lineTo(12.57f, 2.18f)
                curveTo(12.41f, 2.06f, 12.21f, 2f, 12f, 2f)
                reflectiveCurveTo(11.59f, 2.06f, 11.43f, 2.18f)
                lineTo(7.56f, 4.36f)
                lineTo(9f, 5.82f)
                lineTo(12f, 4.15f)
                close()
            }
        }.build()

        return _CubeOff!!
    }

@Suppress("ObjectPropertyName")
private var _CubeOff: ImageVector? = null
