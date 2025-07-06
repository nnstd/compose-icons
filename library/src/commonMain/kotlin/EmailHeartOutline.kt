package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailHeartOutline: ImageVector
    get() {
        if (_EmailHeartOutline != null) {
            return _EmailHeartOutline!!
        }
        _EmailHeartOutline = ImageVector.Builder(
            name = "EmailHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9f)
                curveTo(8.9f, 9f, 8f, 9.92f, 8f, 11.05f)
                curveTo(8f, 11.62f, 8.22f, 12.12f, 8.59f, 12.5f)
                lineTo(12f, 16f)
                lineTo(15.42f, 12.5f)
                curveTo(15.78f, 12.13f, 16f, 11.61f, 16f, 11.05f)
                curveTo(16f, 9.92f, 15.1f, 9f, 14f, 9f)
                curveTo(13.46f, 9f, 12.95f, 9.23f, 12.59f, 9.6f)
                lineTo(12f, 10.2f)
                lineTo(11.42f, 9.61f)
                curveTo(11.05f, 9.23f, 10.54f, 9f, 10f, 9f)
                moveTo(20f, 4f)
                curveTo(21.1f, 4f, 22f, 4.9f, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 19.1f, 21.1f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.9f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                moveTo(16.7f, 8.06f)
                lineTo(20f, 6f)
                horizontalLineTo(4f)
                lineTo(7.3f, 8.06f)
                curveTo(6.89f, 8.45f, 6.55f, 8.92f, 6.33f, 9.45f)
                lineTo(4f, 8f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                lineTo(17.67f, 9.45f)
                curveTo(17.45f, 8.92f, 17.11f, 8.45f, 16.7f, 8.06f)
                close()
            }
        }.build()

        return _EmailHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailHeartOutline: ImageVector? = null
