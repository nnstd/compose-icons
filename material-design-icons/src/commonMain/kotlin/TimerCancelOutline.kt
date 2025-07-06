package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerCancelOutline: ImageVector
    get() {
        if (_TimerCancelOutline != null) {
            return _TimerCancelOutline!!
        }
        _TimerCancelOutline = ImageVector.Builder(
            name = "TimerCancelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                moveTo(12f, 20f)
                curveTo(8.13f, 20f, 5f, 16.87f, 5f, 13f)
                reflectiveCurveTo(8.13f, 6f, 12f, 6f)
                curveTo(15.54f, 6f, 18.45f, 8.62f, 18.93f, 12.03f)
                curveTo(19.65f, 12.08f, 20.34f, 12.23f, 21f, 12.5f)
                curveTo(20.87f, 10.57f, 20.16f, 8.81f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20f, 5.46f, 19.55f, 5f, 19.04f, 4.56f)
                lineTo(17.62f, 6f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveTo(7.03f, 4f, 3f, 8.03f, 3f, 13f)
                reflectiveCurveTo(7.03f, 22f, 12f, 22f)
                curveTo(12.34f, 22f, 12.67f, 22f, 13f, 21.94f)
                curveTo(12.63f, 21.35f, 12.35f, 20.69f, 12.18f, 20f)
                curveTo(12.12f, 20f, 12.06f, 20f, 12f, 20f)
                moveTo(23f, 18.5f)
                curveTo(23f, 21f, 21f, 23f, 18.5f, 23f)
                reflectiveCurveTo(14f, 21f, 14f, 18.5f)
                reflectiveCurveTo(16f, 14f, 18.5f, 14f)
                reflectiveCurveTo(23f, 16f, 23f, 18.5f)
                moveTo(20f, 21.08f)
                lineTo(15.92f, 17f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17f, 15.92f)
                lineTo(21.08f, 20f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }.build()

        return _TimerCancelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerCancelOutline: ImageVector? = null
