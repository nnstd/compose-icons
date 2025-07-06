package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EjectCircle: ImageVector
    get() {
        if (_EjectCircle != null) {
            return _EjectCircle!!
        }
        _EjectCircle = ImageVector.Builder(
            name = "EjectCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(16.5f, 16f)
                horizontalLineTo(7.5f)
                verticalLineTo(14f)
                horizontalLineTo(16.5f)
                verticalLineTo(16f)
                moveTo(7.5f, 12f)
                lineTo(12f, 6f)
                lineTo(16.5f, 12f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()

        return _EjectCircle!!
    }

@Suppress("ObjectPropertyName")
private var _EjectCircle: ImageVector? = null
