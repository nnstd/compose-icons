package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GarageLock: ImageVector
    get() {
        if (_GarageLock != null) {
            return _GarageLock!!
        }
        _GarageLock = ImageVector.Builder(
            name = "GarageLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 16f)
                verticalLineTo(14.5f)
                curveTo(20.8f, 13.1f, 19.4f, 12f, 18f, 12f)
                reflectiveCurveTo(15.2f, 13.1f, 15.2f, 14.5f)
                verticalLineTo(16f)
                curveTo(14.6f, 16f, 14f, 16.6f, 14f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(14f, 21.4f, 14.6f, 22f, 15.2f, 22f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 22f, 22f, 21.4f, 22f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(22f, 16.6f, 21.4f, 16f, 20.8f, 16f)
                moveTo(19.5f, 16f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.5f)
                curveTo(16.5f, 13.7f, 17.2f, 13.2f, 18f, 13.2f)
                reflectiveCurveTo(19.5f, 13.7f, 19.5f, 14.5f)
                verticalLineTo(16f)
                moveTo(5f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                moveTo(5f, 15f)
                horizontalLineTo(12.95f)
                curveTo(12.42f, 15.54f, 12.08f, 16.24f, 12f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                moveTo(12f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                moveTo(14f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                lineTo(9f, 5f)
                lineTo(16f, 9f)
                verticalLineTo(10.44f)
                curveTo(15.19f, 10.8f, 14.5f, 11.36f, 14f, 12.06f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _GarageLock!!
    }

@Suppress("ObjectPropertyName")
private var _GarageLock: ImageVector? = null
