package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountBadgeOutline: ImageVector
    get() {
        if (_AccountBadgeOutline != null) {
            return _AccountBadgeOutline!!
        }
        _AccountBadgeOutline = ImageVector.Builder(
            name = "AccountBadgeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                curveTo(4f, 14.3f, 9.3f, 13f, 12f, 13f)
                curveTo(13.5f, 13f, 15.9f, 13.4f, 17.7f, 14.3f)
                curveTo(16.9f, 14.6f, 16.3f, 15f, 15.7f, 15.5f)
                curveTo(14.6f, 15.1f, 13.3f, 14.9f, 12f, 14.9f)
                curveTo(9f, 14.9f, 5.9f, 16.4f, 5.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(14.2f)
                curveTo(14.1f, 18.5f, 14f, 19f, 14f, 19.5f)
                verticalLineTo(20f)
                moveTo(23f, 19.5f)
                curveTo(23f, 21.4f, 21.4f, 23f, 19.5f, 23f)
                reflectiveCurveTo(16f, 21.4f, 16f, 19.5f)
                reflectiveCurveTo(17.6f, 16f, 19.5f, 16f)
                reflectiveCurveTo(23f, 17.6f, 23f, 19.5f)
                moveTo(12f, 6f)
                curveTo(13.1f, 6f, 14f, 6.9f, 14f, 8f)
                reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                reflectiveCurveTo(10f, 9.1f, 10f, 8f)
                reflectiveCurveTo(10.9f, 6f, 12f, 6f)
                moveTo(12f, 4f)
                curveTo(9.8f, 4f, 8f, 5.8f, 8f, 8f)
                reflectiveCurveTo(9.8f, 12f, 12f, 12f)
                reflectiveCurveTo(16f, 10.2f, 16f, 8f)
                reflectiveCurveTo(14.2f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _AccountBadgeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountBadgeOutline: ImageVector? = null
