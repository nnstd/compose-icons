package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailLockOutline: ImageVector
    get() {
        if (_EmailLockOutline != null) {
            return _EmailLockOutline!!
        }
        _EmailLockOutline = ImageVector.Builder(
            name = "EmailLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.2f)
                curveTo(12f, 18.13f, 12f, 18.07f, 12f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                lineTo(12f, 13f)
                lineTo(20f, 8f)
                verticalLineTo(11.44f)
                curveTo(20.81f, 11.8f, 21.5f, 12.36f, 22f, 13.06f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(12f)
                verticalLineTo(18.2f)
                moveTo(20f, 6f)
                lineTo(12f, 11f)
                lineTo(4f, 6f)
                horizontalLineTo(20f)
                moveTo(20.8f, 17f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13f, 18f, 13f)
                reflectiveCurveTo(15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17f)
                curveTo(14.6f, 17f, 14f, 17.6f, 14f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14f, 22.4f, 14.6f, 23f, 15.2f, 23f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23f, 22f, 22.4f, 22f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22f, 17.6f, 21.4f, 17f, 20.8f, 17f)
                moveTo(19.5f, 17f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18f, 14.2f)
                reflectiveCurveTo(19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _EmailLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailLockOutline: ImageVector? = null
