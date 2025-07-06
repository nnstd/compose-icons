package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraOffOutline: ImageVector
    get() {
        if (_CameraOffOutline != null) {
            return _CameraOffOutline!!
        }
        _CameraOffOutline = ImageVector.Builder(
            name = "CameraOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                curveTo(17f, 12.54f, 16.9f, 13.05f, 16.74f, 13.54f)
                lineTo(15f, 11.78f)
                curveTo(14.87f, 10.3f, 13.7f, 9.13f, 12.22f, 9f)
                lineTo(10.46f, 7.26f)
                curveTo(10.95f, 7.1f, 11.46f, 7f, 12f, 7f)
                curveTo(14.76f, 7f, 17f, 9.24f, 17f, 12f)
                moveTo(9.88f, 4f)
                horizontalLineTo(14.12f)
                lineTo(15.95f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(16.8f)
                lineTo(21.88f, 18.68f)
                curveTo(21.96f, 18.47f, 22f, 18.24f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                horizontalLineTo(16.83f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.18f, 4f)
                lineTo(8.6f, 5.4f)
                lineTo(9.88f, 4f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.42f, 2.25f, 4.9f, 2.65f, 4.54f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(9f, 12f)
                curveTo(9f, 13.66f, 10.34f, 15f, 12f, 15f)
                curveTo(12.33f, 15f, 12.65f, 14.93f, 12.94f, 14.83f)
                lineTo(9.17f, 11.06f)
                curveTo(9.07f, 11.36f, 9f, 11.67f, 9f, 12f)
                moveTo(16.11f, 18f)
                lineTo(14.45f, 16.34f)
                curveTo(13.72f, 16.75f, 12.89f, 17f, 12f, 17f)
                curveTo(9.24f, 17f, 7f, 14.76f, 7f, 12f)
                curveTo(7f, 11.11f, 7.25f, 10.28f, 7.66f, 9.55f)
                lineTo(4.11f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(16.11f)
                close()
            }
        }.build()

        return _CameraOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraOffOutline: ImageVector? = null
