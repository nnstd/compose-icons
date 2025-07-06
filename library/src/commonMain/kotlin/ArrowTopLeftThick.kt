package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftThick: ImageVector
    get() {
        if (_ArrowTopLeftThick != null) {
            return _ArrowTopLeftThick!!
        }
        _ArrowTopLeftThick = ImageVector.Builder(
            name = "ArrowTopLeftThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.12f, 11.94f)
                verticalLineTo(16.89f)
                horizontalLineTo(5.69f)
                verticalLineTo(5.69f)
                horizontalLineTo(16.89f)
                verticalLineTo(9.12f)
                horizontalLineTo(11.94f)
                lineTo(18.31f, 15.5f)
                lineTo(15.5f, 18.31f)
                lineTo(9.12f, 11.94f)
                close()
            }
        }.build()

        return _ArrowTopLeftThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftThick: ImageVector? = null
