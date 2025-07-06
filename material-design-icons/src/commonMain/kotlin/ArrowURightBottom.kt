package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowURightBottom: ImageVector
    get() {
        if (_ArrowURightBottom != null) {
            return _ArrowURightBottom!!
        }
        _ArrowURightBottom = ImageVector.Builder(
            name = "ArrowURightBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                lineTo(14.5f, 21.5f)
                lineTo(13.08f, 20.09f)
                lineTo(16.17f, 17f)
                horizontalLineTo(10.5f)
                curveTo(6.91f, 17f, 4f, 14.09f, 4f, 10.5f)
                reflectiveCurveTo(6.91f, 4f, 10.5f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(10.5f)
                curveTo(8f, 6f, 6f, 8f, 6f, 10.5f)
                reflectiveCurveTo(8f, 15f, 10.5f, 15f)
                horizontalLineTo(16.17f)
                lineTo(13.09f, 11.91f)
                lineTo(14.5f, 10.5f)
                lineTo(20f, 16f)
                close()
            }
        }.build()

        return _ArrowURightBottom!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightBottom: ImageVector? = null
