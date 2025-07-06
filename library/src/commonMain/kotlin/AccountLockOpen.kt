package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountLockOpen: ImageVector
    get() {
        if (_AccountLockOpen != null) {
            return _AccountLockOpen!!
        }
        _AccountLockOpen = ImageVector.Builder(
            name = "AccountLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                curveTo(6f, 5.79f, 7.79f, 4f, 10f, 4f)
                reflectiveCurveTo(14f, 5.79f, 14f, 8f)
                reflectiveCurveTo(12.21f, 12f, 10f, 12f)
                reflectiveCurveTo(6f, 10.21f, 6f, 8f)
                moveTo(12f, 18.2f)
                curveTo(12f, 17.24f, 12.5f, 16.34f, 13.2f, 15.74f)
                verticalLineTo(14.5f)
                curveTo(13.2f, 14.45f, 13.22f, 14.39f, 13.22f, 14.34f)
                curveTo(12.23f, 14.12f, 11.15f, 14f, 10f, 14f)
                curveTo(5.58f, 14f, 2f, 15.79f, 2f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(18.2f)
                moveTo(22f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(22f, 22.4f, 21.4f, 23f, 20.7f, 23f)
                horizontalLineTo(15.2f)
                curveTo(14.6f, 23f, 14f, 22.4f, 14f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(14f, 17.6f, 14.6f, 17f, 15.2f, 17f)
                verticalLineTo(14.5f)
                curveTo(15.2f, 13.1f, 16.6f, 12f, 18f, 12f)
                reflectiveCurveTo(20.8f, 13.1f, 20.8f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.5f)
                curveTo(19.5f, 13.7f, 18.8f, 13.2f, 18f, 13.2f)
                reflectiveCurveTo(16.5f, 13.7f, 16.5f, 14.5f)
                verticalLineTo(17f)
                horizontalLineTo(20.8f)
                curveTo(21.4f, 17f, 22f, 17.6f, 22f, 18.3f)
                close()
            }
        }.build()

        return _AccountLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _AccountLockOpen: ImageVector? = null
