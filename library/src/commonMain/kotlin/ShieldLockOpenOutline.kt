package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldLockOpenOutline: ImageVector
    get() {
        if (_ShieldLockOpenOutline != null) {
            return _ShieldLockOpenOutline!!
        }
        _ShieldLockOpenOutline = ImageVector.Builder(
            name = "ShieldLockOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(21f, 16.5f, 17.2f, 21.7f, 12f, 23f)
                curveTo(6.8f, 21.7f, 3f, 16.5f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                moveTo(12f, 21f)
                curveTo(15.8f, 20f, 19f, 15.5f, 19f, 11.2f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.2f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(5f, 15.5f, 8.2f, 20f, 12f, 21f)
                moveTo(14.8f, 11f)
                horizontalLineTo(10.5f)
                verticalLineTo(8.5f)
                curveTo(10.5f, 7.7f, 11.2f, 7.2f, 12f, 7.2f)
                reflectiveCurveTo(13.5f, 7.7f, 13.5f, 8.5f)
                verticalLineTo(9f)
                horizontalLineTo(14.8f)
                verticalLineTo(8.5f)
                curveTo(14.8f, 7.1f, 13.4f, 6f, 12f, 6f)
                reflectiveCurveTo(9.2f, 7.1f, 9.2f, 8.5f)
                verticalLineTo(11f)
                curveTo(8.6f, 11f, 8f, 11.6f, 8f, 12.2f)
                verticalLineTo(15.7f)
                curveTo(8f, 16.4f, 8.6f, 17f, 9.2f, 17f)
                horizontalLineTo(14.7f)
                curveTo(15.4f, 17f, 16f, 16.4f, 16f, 15.8f)
                verticalLineTo(12.3f)
                curveTo(16f, 11.6f, 15.4f, 11f, 14.8f, 11f)
                close()
            }
        }.build()

        return _ShieldLockOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldLockOpenOutline: ImageVector? = null
