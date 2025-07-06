package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CeilingLightOutline: ImageVector
    get() {
        if (_CeilingLightOutline != null) {
            return _CeilingLightOutline!!
        }
        _CeilingLightOutline = ImageVector.Builder(
            name = "CeilingLightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.76f, 11f)
                lineTo(16.76f, 15f)
                horizontalLineTo(7.24f)
                lineTo(9.24f, 11f)
                horizontalLineTo(14.76f)
                moveTo(13f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                lineTo(4f, 17f)
                horizontalLineTo(20f)
                lineTo(16f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                moveTo(14f, 18f)
                horizontalLineTo(10f)
                curveTo(10f, 19.11f, 10.9f, 20f, 12f, 20f)
                reflectiveCurveTo(14f, 19.11f, 14f, 18f)
                close()
            }
        }.build()

        return _CeilingLightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CeilingLightOutline: ImageVector? = null
