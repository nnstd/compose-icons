package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockOpenAlertOutline: ImageVector
    get() {
        if (_LockOpenAlertOutline != null) {
            return _LockOpenAlertOutline!!
        }
        _LockOpenAlertOutline = ImageVector.Builder(
            name = "LockOpenAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                moveTo(16f, 8f)
                curveTo(17.1f, 8f, 18f, 8.9f, 18f, 10f)
                verticalLineTo(20f)
                curveTo(18f, 21.1f, 17.1f, 22f, 16f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(10f)
                curveTo(2f, 8.9f, 2.9f, 8f, 4f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                curveTo(13f, 4.3f, 11.7f, 3f, 10f, 3f)
                reflectiveCurveTo(7f, 4.3f, 7f, 6f)
                horizontalLineTo(5f)
                curveTo(5f, 3.2f, 7.2f, 1f, 10f, 1f)
                reflectiveCurveTo(15f, 3.2f, 15f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(10f, 17f)
                curveTo(8.9f, 17f, 8f, 16.1f, 8f, 15f)
                reflectiveCurveTo(8.9f, 13f, 10f, 13f)
                reflectiveCurveTo(12f, 13.9f, 12f, 15f)
                reflectiveCurveTo(11.1f, 17f, 10f, 17f)
                moveTo(22f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                moveTo(22f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _LockOpenAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpenAlertOutline: ImageVector? = null
