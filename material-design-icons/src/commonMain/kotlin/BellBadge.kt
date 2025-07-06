package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellBadge: ImageVector
    get() {
        if (_BellBadge != null) {
            return _BellBadge!!
        }
        _BellBadge = ImageVector.Builder(
            name = "BellBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6.5f)
                curveTo(21f, 8.43f, 19.43f, 10f, 17.5f, 10f)
                reflectiveCurveTo(14f, 8.43f, 14f, 6.5f)
                reflectiveCurveTo(15.57f, 3f, 17.5f, 3f)
                reflectiveCurveTo(21f, 4.57f, 21f, 6.5f)
                moveTo(19f, 11.79f)
                curveTo(18.5f, 11.92f, 18f, 12f, 17.5f, 12f)
                curveTo(14.47f, 12f, 12f, 9.53f, 12f, 6.5f)
                curveTo(12f, 5.03f, 12.58f, 3.7f, 13.5f, 2.71f)
                curveTo(13.15f, 2.28f, 12.61f, 2f, 12f, 2f)
                curveTo(10.9f, 2f, 10f, 2.9f, 10f, 4f)
                verticalLineTo(4.29f)
                curveTo(7.03f, 5.17f, 5f, 7.9f, 5f, 11f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                lineTo(19f, 17f)
                verticalLineTo(11.79f)
                moveTo(12f, 23f)
                curveTo(13.11f, 23f, 14f, 22.11f, 14f, 21f)
                horizontalLineTo(10f)
                curveTo(10f, 22.11f, 10.9f, 23f, 12f, 23f)
                close()
            }
        }.build()

        return _BellBadge!!
    }

@Suppress("ObjectPropertyName")
private var _BellBadge: ImageVector? = null
