package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudClockOutline: ImageVector
    get() {
        if (_CloudClockOutline != null) {
            return _CloudClockOutline!!
        }
        _CloudClockOutline = ImageVector.Builder(
            name = "CloudClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 15.5f)
                curveTo(23f, 14.79f, 22.84f, 14.14f, 22.55f, 13.54f)
                curveTo(21.89f, 11.79f, 20.56f, 10.38f, 18.86f, 9.62f)
                curveTo(18.61f, 8.26f, 18f, 7.06f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4f, 12f, 4f)
                curveTo(10.42f, 4f, 9f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1f, 13.28f, 1f, 14.58f)
                curveTo(1f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5f, 20f, 6.5f, 20f)
                horizontalLineTo(10.26f)
                curveTo(11.53f, 21.81f, 13.62f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 15.89f, 23f, 15.79f, 23f, 15.68f)
                curveTo(23f, 15.62f, 23f, 15.56f, 23f, 15.5f)
                moveTo(6.5f, 18f)
                curveTo(5.53f, 18f, 4.71f, 17.66f, 4.03f, 17f)
                curveTo(3.34f, 16.29f, 3f, 15.47f, 3f, 14.5f)
                reflectiveCurveTo(3.34f, 12.71f, 4.03f, 12.03f)
                curveTo(4.71f, 11.34f, 5.53f, 11f, 6.5f, 11f)
                horizontalLineTo(7f)
                curveTo(7f, 9.62f, 7.5f, 8.44f, 8.46f, 7.46f)
                curveTo(9.44f, 6.5f, 10.62f, 6f, 12f, 6f)
                reflectiveCurveTo(14.56f, 6.5f, 15.54f, 7.46f)
                curveTo(16f, 7.93f, 16.35f, 8.46f, 16.59f, 9.03f)
                curveTo(16.4f, 9f, 16.2f, 9f, 16f, 9f)
                curveTo(12.13f, 9f, 9f, 12.13f, 9f, 16f)
                curveTo(9f, 16.7f, 9.11f, 17.37f, 9.29f, 18f)
                horizontalLineTo(6.5f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }.build()

        return _CloudClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudClockOutline: ImageVector? = null
