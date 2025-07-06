package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FanAlert: ImageVector
    get() {
        if (_FanAlert != null) {
            return _FanAlert!!
        }
        _FanAlert = ImageVector.Builder(
            name = "FanAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 11f)
                curveTo(9.43f, 11f, 9f, 11.45f, 9f, 12f)
                reflectiveCurveTo(9.43f, 13f, 10f, 13f)
                curveTo(10.54f, 13f, 11f, 12.55f, 11f, 12f)
                reflectiveCurveTo(10.54f, 11f, 10f, 11f)
                moveTo(10.5f, 2f)
                curveTo(15f, 2f, 15.09f, 5.57f, 12.73f, 6.75f)
                curveTo(11.74f, 7.24f, 11.3f, 8.29f, 11.11f, 9.22f)
                curveTo(11.59f, 9.42f, 12f, 9.73f, 12.33f, 10.13f)
                curveTo(16.03f, 8.13f, 20f, 8.92f, 20f, 12.5f)
                curveTo(20f, 17f, 16.43f, 17.1f, 15.26f, 14.73f)
                curveTo(14.76f, 13.74f, 13.7f, 13.3f, 12.77f, 13.11f)
                curveTo(12.57f, 13.59f, 12.26f, 14f, 11.86f, 14.34f)
                curveTo(13.85f, 18.03f, 13.06f, 22f, 9.5f, 22f)
                curveTo(5f, 22f, 4.9f, 18.42f, 7.26f, 17.24f)
                curveTo(8.24f, 16.75f, 8.68f, 15.71f, 8.88f, 14.79f)
                curveTo(8.39f, 14.59f, 7.96f, 14.27f, 7.64f, 13.87f)
                curveTo(3.95f, 15.85f, 0f, 15.07f, 0f, 11.5f)
                curveTo(0f, 7f, 3.56f, 6.89f, 4.73f, 9.26f)
                curveTo(5.23f, 10.25f, 6.28f, 10.68f, 7.21f, 10.87f)
                curveTo(7.4f, 10.39f, 7.72f, 9.97f, 8.13f, 9.65f)
                curveTo(6.14f, 5.96f, 6.93f, 2f, 10.5f, 2f)
                moveTo(22f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(24f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                moveTo(22f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(24f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _FanAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FanAlert: ImageVector? = null
