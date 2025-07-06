package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarHearingLoop: ImageVector
    get() {
        if (_EarHearingLoop != null) {
            return _EarHearingLoop!!
        }
        _EarHearingLoop = ImageVector.Builder(
            name = "EarHearingLoop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.5f)
                curveTo(10.62f, 6.5f, 9.5f, 7.62f, 9.5f, 9f)
                reflectiveCurveTo(10.62f, 11.5f, 12f, 11.5f)
                reflectiveCurveTo(14.5f, 10.38f, 14.5f, 9f)
                reflectiveCurveTo(13.38f, 6.5f, 12f, 6.5f)
                moveTo(16f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                moveTo(11.69f, 13.47f)
                lineTo(3.67f, 22f)
                lineTo(2.4f, 20.73f)
                lineTo(9.75f, 12.87f)
                curveTo(10.33f, 13.21f, 11f, 13.42f, 11.69f, 13.47f)
                moveTo(19f, 9f)
                curveTo(19f, 10.26f, 18.62f, 11.65f, 17.93f, 12.9f)
                curveTo(17f, 14.55f, 15.95f, 15.38f, 15.08f, 16.05f)
                curveTo(14.27f, 16.67f, 13.69f, 17.12f, 13.37f, 18.1f)
                curveTo(12.77f, 19.92f, 12f, 20.94f, 10.64f, 21.65f)
                curveTo(10.13f, 21.88f, 9.57f, 22f, 9f, 22f)
                curveTo(7.81f, 22f, 6.75f, 21.47f, 6f, 20.65f)
                lineTo(7.43f, 19.22f)
                curveTo(7.79f, 19.69f, 8.36f, 20f, 9f, 20f)
                curveTo(9.29f, 20f, 9.56f, 19.94f, 9.76f, 19.85f)
                curveTo(10.47f, 19.5f, 10.97f, 18.97f, 11.47f, 17.47f)
                curveTo(12f, 15.91f, 12.94f, 15.18f, 13.86f, 14.47f)
                curveTo(14.65f, 13.86f, 15.47f, 13.23f, 16.18f, 11.94f)
                curveTo(16.71f, 11f, 17f, 9.93f, 17f, 9f)
                curveTo(17f, 6.2f, 14.8f, 4f, 12f, 4f)
                reflectiveCurveTo(7f, 6.2f, 7f, 9f)
                horizontalLineTo(5f)
                curveTo(5f, 5.07f, 8.07f, 2f, 12f, 2f)
                reflectiveCurveTo(19f, 5.07f, 19f, 9f)
                moveTo(18.37f, 4.12f)
                lineTo(20.72f, 1.73f)
                lineTo(22f, 3f)
                lineTo(19.32f, 5.72f)
                curveTo(19.06f, 5.15f, 18.74f, 4.61f, 18.37f, 4.12f)
                close()
            }
        }.build()

        return _EarHearingLoop!!
    }

@Suppress("ObjectPropertyName")
private var _EarHearingLoop: ImageVector? = null
