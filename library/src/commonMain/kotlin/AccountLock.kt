package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountLock: ImageVector
    get() {
        if (_AccountLock != null) {
            return _AccountLock!!
        }
        _AccountLock = ImageVector.Builder(
            name = "AccountLock",
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
                verticalLineTo(15.5f)
                curveTo(13.2f, 15.11f, 13.27f, 14.74f, 13.38f, 14.38f)
                curveTo(12.35f, 14.14f, 11.21f, 14f, 10f, 14f)
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
                verticalLineTo(15.5f)
                curveTo(15.2f, 14.1f, 16.6f, 13f, 18f, 13f)
                curveTo(19.4f, 13f, 20.8f, 14.1f, 20.8f, 15.5f)
                verticalLineTo(17f)
                curveTo(21.4f, 17f, 22f, 17.6f, 22f, 18.3f)
                moveTo(19.5f, 15.5f)
                curveTo(19.5f, 14.7f, 18.8f, 14.2f, 18f, 14.2f)
                curveTo(17.2f, 14.2f, 16.5f, 14.7f, 16.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(19.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _AccountLock!!
    }

@Suppress("ObjectPropertyName")
private var _AccountLock: ImageVector? = null
