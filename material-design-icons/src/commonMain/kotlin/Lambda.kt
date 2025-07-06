package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lambda: ImageVector
    get() {
        if (_Lambda != null) {
            return _Lambda!!
        }
        _Lambda = ImageVector.Builder(
            name = "Lambda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 20f)
                lineTo(10.16f, 7.91f)
                lineTo(9.34f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                curveTo(10.42f, 4f, 10.78f, 4.26f, 10.93f, 4.63f)
                lineTo(16.66f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                curveTo(15.57f, 20f, 15.21f, 19.73f, 15.07f, 19.36f)
                lineTo(11.33f, 10.65f)
                lineTo(8.12f, 20f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Lambda!!
    }

@Suppress("ObjectPropertyName")
private var _Lambda: ImageVector? = null
