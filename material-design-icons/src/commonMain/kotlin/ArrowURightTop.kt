package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowURightTop: ImageVector
    get() {
        if (_ArrowURightTop != null) {
            return _ArrowURightTop!!
        }
        _ArrowURightTop = ImageVector.Builder(
            name = "ArrowURightTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(10.5f)
                curveTo(6.91f, 20f, 4f, 17.09f, 4f, 13.5f)
                reflectiveCurveTo(6.91f, 7f, 10.5f, 7f)
                horizontalLineTo(16.17f)
                lineTo(13.08f, 3.91f)
                lineTo(14.5f, 2.5f)
                lineTo(20f, 8f)
                lineTo(14.5f, 13.5f)
                lineTo(13.09f, 12.09f)
                lineTo(16.17f, 9f)
                horizontalLineTo(10.5f)
                curveTo(8f, 9f, 6f, 11f, 6f, 13.5f)
                reflectiveCurveTo(8f, 18f, 10.5f, 18f)
                close()
            }
        }.build()

        return _ArrowURightTop!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightTop: ImageVector? = null
