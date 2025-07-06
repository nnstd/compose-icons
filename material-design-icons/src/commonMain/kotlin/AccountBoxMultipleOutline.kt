package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountBoxMultipleOutline: ImageVector
    get() {
        if (_AccountBoxMultipleOutline != null) {
            return _AccountBoxMultipleOutline!!
        }
        _AccountBoxMultipleOutline = ImageVector.Builder(
            name = "AccountBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(18.5f, 14.25f)
                curveTo(18.5f, 12.75f, 15.5f, 12f, 14f, 12f)
                reflectiveCurveTo(9.5f, 12.75f, 9.5f, 14.25f)
                verticalLineTo(15f)
                horizontalLineTo(18.5f)
                moveTo(14f, 10.25f)
                curveTo(15.24f, 10.25f, 16.25f, 9.24f, 16.25f, 8f)
                reflectiveCurveTo(15.24f, 5.75f, 14f, 5.75f)
                reflectiveCurveTo(11.75f, 6.76f, 11.75f, 8f)
                reflectiveCurveTo(12.76f, 10.25f, 14f, 10.25f)
                moveTo(20f, 2f)
                horizontalLineTo(8f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.9f, 18f, 8f, 18f)
                horizontalLineTo(20f)
                curveTo(21.11f, 18f, 22f, 17.11f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.1f, 2f, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _AccountBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountBoxMultipleOutline: ImageVector? = null
