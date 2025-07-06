package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowULeftTop: ImageVector
    get() {
        if (_ArrowULeftTop != null) {
            return _ArrowULeftTop!!
        }
        _ArrowULeftTop = ImageVector.Builder(
            name = "ArrowULeftTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13.5f)
                curveTo(20f, 17.09f, 17.09f, 20f, 13.5f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(13.5f)
                curveTo(16f, 18f, 18f, 16f, 18f, 13.5f)
                reflectiveCurveTo(16f, 9f, 13.5f, 9f)
                horizontalLineTo(7.83f)
                lineTo(10.91f, 12.09f)
                lineTo(9.5f, 13.5f)
                lineTo(4f, 8f)
                lineTo(9.5f, 2.5f)
                lineTo(10.92f, 3.91f)
                lineTo(7.83f, 7f)
                horizontalLineTo(13.5f)
                curveTo(17.09f, 7f, 20f, 9.91f, 20f, 13.5f)
                close()
            }
        }.build()

        return _ArrowULeftTop!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftTop: ImageVector? = null
