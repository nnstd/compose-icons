package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerSyncOutline: ImageVector
    get() {
        if (_TimerSyncOutline != null) {
            return _TimerSyncOutline!!
        }
        _TimerSyncOutline = ImageVector.Builder(
            name = "TimerSyncOutline",
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
                moveTo(12f, 20f)
                curveTo(8.13f, 20f, 5f, 16.87f, 5f, 13f)
                reflectiveCurveTo(8.13f, 6f, 12f, 6f)
                curveTo(15.19f, 6f, 17.88f, 8.14f, 18.72f, 11.05f)
                curveTo(19f, 11f, 19.24f, 11f, 19.5f, 11f)
                curveTo(19.94f, 11f, 20.38f, 11.05f, 20.8f, 11.13f)
                curveTo(20.5f, 9.74f, 19.89f, 8.46f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                curveTo(20f, 5.46f, 19.55f, 5f, 19.04f, 4.56f)
                lineTo(17.62f, 6f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveTo(7.03f, 4f, 3f, 8.03f, 3f, 13f)
                reflectiveCurveTo(7.03f, 22f, 12f, 22f)
                curveTo(12.87f, 22f, 13.7f, 21.87f, 14.5f, 21.65f)
                curveTo(14.05f, 21.11f, 13.7f, 20.5f, 13.45f, 19.85f)
                curveTo(13f, 19.95f, 12.5f, 20f, 12f, 20f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                moveTo(19f, 13.5f)
                verticalLineTo(12f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 16.5f)
                verticalLineTo(15f)
                curveTo(20.38f, 15f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23f, 18.32f, 23f, 17.5f)
                curveTo(23f, 15.29f, 21.21f, 13.5f, 19f, 13.5f)
                moveTo(19f, 20f)
                curveTo(17.62f, 20f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15f, 16.68f, 15f, 17.5f)
                curveTo(15f, 19.71f, 16.79f, 21.5f, 19f, 21.5f)
                verticalLineTo(23f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 18.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _TimerSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerSyncOutline: ImageVector? = null
