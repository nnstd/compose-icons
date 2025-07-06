package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiscAlert: ImageVector
    get() {
        if (_DiscAlert != null) {
            return _DiscAlert!!
        }
        _DiscAlert = ImageVector.Builder(
            name = "DiscAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14f)
                curveTo(8.9f, 14f, 8f, 13.1f, 8f, 12f)
                curveTo(8f, 10.9f, 8.9f, 10f, 10f, 10f)
                curveTo(11.1f, 10f, 12f, 10.9f, 12f, 12f)
                reflectiveCurveTo(11.1f, 14f, 10f, 14f)
                moveTo(10f, 4f)
                curveTo(5.6f, 4f, 2f, 7.6f, 2f, 12f)
                reflectiveCurveTo(5.6f, 20f, 10f, 20f)
                reflectiveCurveTo(18f, 16.4f, 18f, 12f)
                reflectiveCurveTo(14.4f, 4f, 10f, 4f)
                moveTo(20f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _DiscAlert!!
    }

@Suppress("ObjectPropertyName")
private var _DiscAlert: ImageVector? = null
