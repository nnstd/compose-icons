package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowULeftBottom: ImageVector
    get() {
        if (_ArrowULeftBottom != null) {
            return _ArrowULeftBottom!!
        }
        _ArrowULeftBottom = ImageVector.Builder(
            name = "ArrowULeftBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10.5f)
                curveTo(20f, 14.09f, 17.09f, 17f, 13.5f, 17f)
                horizontalLineTo(7.83f)
                lineTo(10.92f, 20.09f)
                lineTo(9.5f, 21.5f)
                lineTo(4f, 16f)
                lineTo(9.5f, 10.5f)
                lineTo(10.91f, 11.91f)
                lineTo(7.83f, 15f)
                horizontalLineTo(13.5f)
                curveTo(16f, 15f, 18f, 13f, 18f, 10.5f)
                reflectiveCurveTo(16f, 6f, 13.5f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13.5f)
                curveTo(17.09f, 4f, 20f, 6.91f, 20f, 10.5f)
                close()
            }
        }.build()

        return _ArrowULeftBottom!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftBottom: ImageVector? = null
