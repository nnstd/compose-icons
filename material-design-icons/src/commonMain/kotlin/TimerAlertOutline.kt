package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerAlertOutline: ImageVector
    get() {
        if (_TimerAlertOutline != null) {
            return _TimerAlertOutline!!
        }
        _TimerAlertOutline = ImageVector.Builder(
            name = "TimerAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                moveTo(13f, 1f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                moveTo(17.03f, 7.39f)
                curveTo(18.26f, 8.93f, 19f, 10.88f, 19f, 13f)
                curveTo(19f, 17.97f, 15f, 22f, 10f, 22f)
                curveTo(5.03f, 22f, 1f, 17.97f, 1f, 13f)
                reflectiveCurveTo(5.03f, 4f, 10f, 4f)
                curveTo(12.12f, 4f, 14.07f, 4.74f, 15.62f, 6f)
                lineTo(17.04f, 4.56f)
                curveTo(17.55f, 5f, 18f, 5.46f, 18.45f, 5.97f)
                lineTo(17.03f, 7.39f)
                moveTo(17f, 13f)
                curveTo(17f, 9.13f, 13.87f, 6f, 10f, 6f)
                reflectiveCurveTo(3f, 9.13f, 3f, 13f)
                reflectiveCurveTo(6.13f, 20f, 10f, 20f)
                reflectiveCurveTo(17f, 16.87f, 17f, 13f)
                moveTo(21f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _TimerAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerAlertOutline: ImageVector? = null
