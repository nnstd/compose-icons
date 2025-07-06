package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUDownLeft: ImageVector
    get() {
        if (_ArrowUDownLeft != null) {
            return _ArrowUDownLeft!!
        }
        _ArrowUDownLeft = ImageVector.Builder(
            name = "ArrowUDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10.5f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(10.5f)
                curveTo(18f, 8f, 16f, 6f, 13.5f, 6f)
                reflectiveCurveTo(9f, 8f, 9f, 10.5f)
                verticalLineTo(16.17f)
                lineTo(12.09f, 13.09f)
                lineTo(13.5f, 14.5f)
                lineTo(8f, 20f)
                lineTo(2.5f, 14.5f)
                lineTo(3.91f, 13.08f)
                lineTo(7f, 16.17f)
                verticalLineTo(10.5f)
                curveTo(7f, 6.91f, 9.91f, 4f, 13.5f, 4f)
                reflectiveCurveTo(20f, 6.91f, 20f, 10.5f)
                close()
            }
        }.build()

        return _ArrowUDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUDownLeft: ImageVector? = null
