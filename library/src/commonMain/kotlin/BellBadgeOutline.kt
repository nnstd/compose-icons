package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellBadgeOutline: ImageVector
    get() {
        if (_BellBadgeOutline != null) {
            return _BellBadgeOutline!!
        }
        _BellBadgeOutline = ImageVector.Builder(
            name = "BellBadgeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                verticalLineTo(11.8f)
                curveTo(18.5f, 11.9f, 18f, 12f, 17.5f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                curveTo(7f, 8.2f, 9.2f, 6f, 12f, 6f)
                curveTo(12.1f, 4.7f, 12.7f, 3.6f, 13.5f, 2.7f)
                curveTo(13.2f, 2.3f, 12.6f, 2f, 12f, 2f)
                curveTo(10.9f, 2f, 10f, 2.9f, 10f, 4f)
                verticalLineTo(4.3f)
                curveTo(7f, 5.2f, 5f, 7.9f, 5f, 11f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                lineTo(19f, 17f)
                moveTo(10f, 21f)
                curveTo(10f, 22.1f, 10.9f, 23f, 12f, 23f)
                reflectiveCurveTo(14f, 22.1f, 14f, 21f)
                horizontalLineTo(10f)
                moveTo(21f, 6.5f)
                curveTo(21f, 8.4f, 19.4f, 10f, 17.5f, 10f)
                reflectiveCurveTo(14f, 8.4f, 14f, 6.5f)
                reflectiveCurveTo(15.6f, 3f, 17.5f, 3f)
                reflectiveCurveTo(21f, 4.6f, 21f, 6.5f)
            }
        }.build()

        return _BellBadgeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BellBadgeOutline: ImageVector? = null
