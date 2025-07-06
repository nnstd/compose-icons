package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CeilingLightMultipleOutline: ImageVector
    get() {
        if (_CeilingLightMultipleOutline != null) {
            return _CeilingLightMultipleOutline!!
        }
        _CeilingLightMultipleOutline = ImageVector.Builder(
            name = "CeilingLightMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.76f, 13f)
                lineTo(18.76f, 17f)
                horizontalLineTo(9.24f)
                lineTo(11.24f, 13f)
                horizontalLineTo(16.76f)
                moveTo(15f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                lineTo(6f, 19f)
                horizontalLineTo(22f)
                lineTo(18f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                moveTo(16f, 20f)
                curveTo(16f, 21.11f, 15.11f, 22f, 14f, 22f)
                reflectiveCurveTo(12f, 21.11f, 12f, 20f)
                horizontalLineTo(16f)
                moveTo(8.21f, 10.11f)
                lineTo(8.76f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                lineTo(2f, 15f)
                horizontalLineTo(5.76f)
                lineTo(8.21f, 10.11f)
                close()
            }
        }.build()

        return _CeilingLightMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CeilingLightMultipleOutline: ImageVector? = null
