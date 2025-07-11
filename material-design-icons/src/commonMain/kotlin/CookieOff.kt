package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CookieOff: ImageVector
    get() {
        if (_CookieOff != null) {
            return _CookieOff!!
        }
        _CookieOff = ImageVector.Builder(
            name = "CookieOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.25f, 6.05f)
                lineTo(7.45f, 4.25f)
                curveTo(8.79f, 3.46f, 10.34f, 3f, 12f, 3f)
                curveTo(12f, 3f, 13f, 3f, 13f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                curveTo(14f, 6f, 15f, 6f, 15f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                curveTo(17f, 8f, 18f, 8f, 18f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                curveTo(20f, 10f, 20.6f, 10f, 20.87f, 10.5f)
                curveTo(20.96f, 11f, 21f, 11.5f, 21f, 12f)
                curveTo(21f, 13.66f, 20.54f, 15.22f, 19.75f, 16.55f)
                lineTo(17.95f, 14.75f)
                curveTo(17.97f, 14.67f, 18f, 14.59f, 18f, 14.5f)
                curveTo(18f, 13.67f, 17.33f, 13f, 16.5f, 13f)
                curveTo(16.41f, 13f, 16.33f, 13.03f, 16.25f, 13.05f)
                lineTo(10.95f, 7.75f)
                curveTo(10.97f, 7.67f, 11f, 7.59f, 11f, 7.5f)
                curveTo(11f, 6.67f, 10.33f, 6f, 9.5f, 6f)
                curveTo(9.41f, 6f, 9.33f, 6.03f, 9.25f, 6.05f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.34f, 19.23f)
                curveTo(15.85f, 20.34f, 14f, 21f, 12f, 21f)
                curveTo(7.03f, 21f, 3f, 16.97f, 3f, 12f)
                curveTo(3f, 10f, 3.66f, 8.15f, 4.77f, 6.66f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8f, 11.5f)
                curveTo(8f, 10.67f, 7.33f, 10f, 6.5f, 10f)
                reflectiveCurveTo(5f, 10.67f, 5f, 11.5f)
                reflectiveCurveTo(5.67f, 13f, 6.5f, 13f)
                reflectiveCurveTo(8f, 12.33f, 8f, 11.5f)
                moveTo(10f, 12.5f)
                curveTo(10f, 13.33f, 10.67f, 14f, 11.5f, 14f)
                curveTo(11.68f, 14f, 11.85f, 13.96f, 12f, 13.9f)
                lineTo(10.1f, 12f)
                curveTo(10.04f, 12.15f, 10f, 12.32f, 10f, 12.5f)
                moveTo(12.5f, 17.5f)
                curveTo(12.5f, 16.67f, 11.83f, 16f, 11f, 16f)
                reflectiveCurveTo(9.5f, 16.67f, 9.5f, 17.5f)
                reflectiveCurveTo(10.17f, 19f, 11f, 19f)
                reflectiveCurveTo(12.5f, 18.33f, 12.5f, 17.5f)
                close()
            }
        }.build()

        return _CookieOff!!
    }

@Suppress("ObjectPropertyName")
private var _CookieOff: ImageVector? = null
