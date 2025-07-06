package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanGreeting: ImageVector
    get() {
        if (_HumanGreeting != null) {
            return _HumanGreeting!!
        }
        _HumanGreeting = ImageVector.Builder(
            name = "HumanGreeting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(13.1f, 2f, 14f, 2.9f, 14f, 4f)
                reflectiveCurveTo(13.1f, 6f, 12f, 6f)
                reflectiveCurveTo(10f, 5.1f, 10f, 4f)
                reflectiveCurveTo(10.9f, 2f, 12f, 2f)
                moveTo(15.9f, 8.1f)
                curveTo(15.5f, 7.7f, 14.8f, 7f, 13.5f, 7f)
                horizontalLineTo(11f)
                curveTo(8.2f, 7f, 6f, 4.8f, 6f, 2f)
                horizontalLineTo(4f)
                curveTo(4f, 5.2f, 6.1f, 7.8f, 9f, 8.7f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(10.1f)
                lineTo(19f, 14f)
                lineTo(20.4f, 12.6f)
                lineTo(15.9f, 8.1f)
                close()
            }
        }.build()

        return _HumanGreeting!!
    }

@Suppress("ObjectPropertyName")
private var _HumanGreeting: ImageVector? = null
