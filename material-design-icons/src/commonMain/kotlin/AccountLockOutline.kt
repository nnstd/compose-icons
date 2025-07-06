package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountLockOutline: ImageVector
    get() {
        if (_AccountLockOutline != null) {
            return _AccountLockOutline!!
        }
        _AccountLockOutline = ImageVector.Builder(
            name = "AccountLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                curveTo(12.21f, 12f, 14f, 10.21f, 14f, 8f)
                reflectiveCurveTo(12.21f, 4f, 10f, 4f)
                reflectiveCurveTo(6f, 5.79f, 6f, 8f)
                reflectiveCurveTo(7.79f, 12f, 10f, 12f)
                moveTo(10f, 6f)
                curveTo(11.11f, 6f, 12f, 6.9f, 12f, 8f)
                reflectiveCurveTo(11.11f, 10f, 10f, 10f)
                reflectiveCurveTo(8f, 9.11f, 8f, 8f)
                reflectiveCurveTo(8.9f, 6f, 10f, 6f)
                moveTo(12f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 14.33f, 7.33f, 13f, 10f, 13f)
                curveTo(11f, 13f, 12.38f, 13.19f, 13.71f, 13.56f)
                curveTo(13.41f, 14.12f, 13.23f, 14.74f, 13.21f, 15.39f)
                curveTo(12.23f, 15.1f, 11.11f, 14.9f, 10f, 14.9f)
                curveTo(7.03f, 14.9f, 3.9f, 16.36f, 3.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(12f)
                curveTo(12f, 18.13f, 12f, 18.17f, 12f, 18.2f)
                verticalLineTo(20f)
                moveTo(20.8f, 17f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13f, 18f, 13f)
                curveTo(16.6f, 13f, 15.2f, 14.1f, 15.2f, 15.5f)
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
                curveTo(18.8f, 14.2f, 19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _AccountLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountLockOutline: ImageVector? = null
