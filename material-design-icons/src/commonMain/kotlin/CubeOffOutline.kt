package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CubeOffOutline: ImageVector
    get() {
        if (_CubeOffOutline != null) {
            return _CubeOffOutline!!
        }
        _CubeOffOutline = ImageVector.Builder(
            name = "CubeOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.3f, 6.19f)
                lineTo(3.53f, 6.62f)
                curveTo(3.21f, 6.79f, 3f, 7.12f, 3f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 16.88f, 3.21f, 17.21f, 3.53f, 17.38f)
                lineTo(11.43f, 21.82f)
                curveTo(11.59f, 21.94f, 11.79f, 22f, 12f, 22f)
                reflectiveCurveTo(12.41f, 21.94f, 12.57f, 21.82f)
                lineTo(17.28f, 19.17f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5f, 15.91f)
                verticalLineTo(9.21f)
                lineTo(10.29f, 12.18f)
                lineTo(11f, 12.89f)
                verticalLineTo(19.29f)
                lineTo(5f, 15.91f)
                moveTo(13f, 19.29f)
                verticalLineTo(14.89f)
                lineTo(15.82f, 17.7f)
                lineTo(13f, 19.29f)
                moveTo(9f, 5.82f)
                lineTo(7.56f, 4.36f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2f, 12f, 2f)
                reflectiveCurveTo(12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21f, 7.12f, 21f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(21f, 16.85f, 20.82f, 17.16f, 20.53f, 17.33f)
                lineTo(19f, 15.8f)
                verticalLineTo(9.21f)
                lineTo(14.78f, 11.58f)
                lineTo(13.31f, 10.11f)
                lineTo(17.96f, 7.5f)
                lineTo(12f, 4.15f)
                lineTo(9f, 5.82f)
                close()
            }
        }.build()

        return _CubeOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CubeOffOutline: ImageVector? = null
