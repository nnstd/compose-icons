package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldLock: ImageVector
    get() {
        if (_ShieldLock != null) {
            return _ShieldLock!!
        }
        _ShieldLock = ImageVector.Builder(
            name = "ShieldLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.55f, 6.84f, 21.74f, 12f, 23f)
                curveTo(17.16f, 21.74f, 21f, 16.55f, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(12f, 7f)
                curveTo(13.4f, 7f, 14.8f, 8.1f, 14.8f, 9.5f)
                verticalLineTo(11f)
                curveTo(15.4f, 11f, 16f, 11.6f, 16f, 12.3f)
                verticalLineTo(15.8f)
                curveTo(16f, 16.4f, 15.4f, 17f, 14.7f, 17f)
                horizontalLineTo(9.2f)
                curveTo(8.6f, 17f, 8f, 16.4f, 8f, 15.7f)
                verticalLineTo(12.2f)
                curveTo(8f, 11.6f, 8.6f, 11f, 9.2f, 11f)
                verticalLineTo(9.5f)
                curveTo(9.2f, 8.1f, 10.6f, 7f, 12f, 7f)
                moveTo(12f, 8.2f)
                curveTo(11.2f, 8.2f, 10.5f, 8.7f, 10.5f, 9.5f)
                verticalLineTo(11f)
                horizontalLineTo(13.5f)
                verticalLineTo(9.5f)
                curveTo(13.5f, 8.7f, 12.8f, 8.2f, 12f, 8.2f)
                close()
            }
        }.build()

        return _ShieldLock!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldLock: ImageVector? = null
