package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUUpLeft: ImageVector
    get() {
        if (_ArrowUUpLeft != null) {
            return _ArrowUUpLeft!!
        }
        _ArrowUUpLeft = ImageVector.Builder(
            name = "ArrowUUpLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                verticalLineTo(13.5f)
                curveTo(20f, 17.09f, 17.09f, 20f, 13.5f, 20f)
                reflectiveCurveTo(7f, 17.09f, 7f, 13.5f)
                verticalLineTo(7.83f)
                lineTo(3.91f, 10.92f)
                lineTo(2.5f, 9.5f)
                lineTo(8f, 4f)
                lineTo(13.5f, 9.5f)
                lineTo(12.09f, 10.91f)
                lineTo(9f, 7.83f)
                verticalLineTo(13.5f)
                curveTo(9f, 16f, 11f, 18f, 13.5f, 18f)
                reflectiveCurveTo(18f, 16f, 18f, 13.5f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowUUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUUpLeft: ImageVector? = null
