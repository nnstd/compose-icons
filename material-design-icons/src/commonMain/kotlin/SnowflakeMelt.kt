package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SnowflakeMelt: ImageVector
    get() {
        if (_SnowflakeMelt != null) {
            return _SnowflakeMelt!!
        }
        _SnowflakeMelt = ImageVector.Builder(
            name = "SnowflakeMelt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 17.85f)
                curveTo(8f, 19.04f, 7.11f, 20f, 6f, 20f)
                reflectiveCurveTo(4f, 19.04f, 4f, 17.85f)
                curveTo(4f, 16.42f, 6f, 14f, 6f, 14f)
                reflectiveCurveTo(8f, 16.42f, 8f, 17.85f)
                moveTo(16.46f, 12f)
                verticalLineTo(10.56f)
                lineTo(18.46f, 9.43f)
                lineTo(20.79f, 10.05f)
                lineTo(21.31f, 8.12f)
                lineTo(19.54f, 7.65f)
                lineTo(20f, 5.88f)
                lineTo(18.07f, 5.36f)
                lineTo(17.45f, 7.69f)
                lineTo(15.45f, 8.82f)
                lineTo(13f, 7.38f)
                verticalLineTo(5.12f)
                lineTo(14.71f, 3.41f)
                lineTo(13.29f, 2f)
                lineTo(12f, 3.29f)
                lineTo(10.71f, 2f)
                lineTo(9.29f, 3.41f)
                lineTo(11f, 5.12f)
                verticalLineTo(7.38f)
                lineTo(8.5f, 8.82f)
                lineTo(6.5f, 7.69f)
                lineTo(5.92f, 5.36f)
                lineTo(4f, 5.88f)
                lineTo(4.47f, 7.65f)
                lineTo(2.7f, 8.12f)
                lineTo(3.22f, 10.05f)
                lineTo(5.55f, 9.43f)
                lineTo(7.55f, 10.56f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(16.46f)
                moveTo(9.5f, 12f)
                verticalLineTo(10.56f)
                lineTo(12f, 9.11f)
                lineTo(14.5f, 10.56f)
                verticalLineTo(12f)
                horizontalLineTo(9.5f)
                moveTo(20f, 17.85f)
                curveTo(20f, 19.04f, 19.11f, 20f, 18f, 20f)
                reflectiveCurveTo(16f, 19.04f, 16f, 17.85f)
                curveTo(16f, 16.42f, 18f, 14f, 18f, 14f)
                reflectiveCurveTo(20f, 16.42f, 20f, 17.85f)
                moveTo(14f, 20.85f)
                curveTo(14f, 22.04f, 13.11f, 23f, 12f, 23f)
                reflectiveCurveTo(10f, 22.04f, 10f, 20.85f)
                curveTo(10f, 19.42f, 12f, 17f, 12f, 17f)
                reflectiveCurveTo(14f, 19.42f, 14f, 20.85f)
                close()
            }
        }.build()

        return _SnowflakeMelt!!
    }

@Suppress("ObjectPropertyName")
private var _SnowflakeMelt: ImageVector? = null
