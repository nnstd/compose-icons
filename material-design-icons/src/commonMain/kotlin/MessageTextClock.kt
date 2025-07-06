package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageTextClock: ImageVector
    get() {
        if (_MessageTextClock != null) {
            return _MessageTextClock!!
        }
        _MessageTextClock = ImageVector.Builder(
            name = "MessageTextClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12.41f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(9.29f)
                curveTo(10.15f, 20.89f, 12.83f, 23f, 16f, 23f)
                curveTo(19.86f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 14.69f, 22.63f, 13.46f, 22f, 12.41f)
                moveTo(6f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                moveTo(16f, 9f)
                curveTo(14.1f, 9f, 12.37f, 9.77f, 11.11f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                moveTo(6f, 12f)
                horizontalLineTo(10.26f)
                curveTo(9.84f, 12.6f, 9.5f, 13.28f, 9.3f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(16f, 20.85f)
                curveTo(13.32f, 20.85f, 11.15f, 18.68f, 11.15f, 16f)
                reflectiveCurveTo(13.32f, 11.15f, 16f, 11.15f)
                curveTo(18.67f, 11.15f, 20.85f, 13.32f, 20.85f, 16f)
                reflectiveCurveTo(18.67f, 20.85f, 16f, 20.85f)
                moveTo(16.5f, 15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                close()
            }
        }.build()

        return _MessageTextClock!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTextClock: ImageVector? = null
