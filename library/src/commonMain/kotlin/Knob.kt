package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Knob: ImageVector
    get() {
        if (_Knob != null) {
            return _Knob!!
        }
        _Knob = ImageVector.Builder(
            name = "Knob",
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
                moveTo(13f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(4.1f)
                curveTo(11.3f, 4f, 11.7f, 4f, 12f, 4f)
                reflectiveCurveTo(12.7f, 4f, 13f, 4.1f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Knob!!
    }

@Suppress("ObjectPropertyName")
private var _Knob: ImageVector? = null
