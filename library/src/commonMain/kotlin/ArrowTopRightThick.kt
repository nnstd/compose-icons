package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRightThick: ImageVector
    get() {
        if (_ArrowTopRightThick != null) {
            return _ArrowTopRightThick!!
        }
        _ArrowTopRightThick = ImageVector.Builder(
            name = "ArrowTopRightThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 18.31f)
                lineTo(5.69f, 15.5f)
                lineTo(12.06f, 9.12f)
                horizontalLineTo(7.11f)
                verticalLineTo(5.69f)
                horizontalLineTo(18.31f)
                verticalLineTo(16.89f)
                horizontalLineTo(14.89f)
                verticalLineTo(11.94f)
                lineTo(8.5f, 18.31f)
                close()
            }
        }.build()

        return _ArrowTopRightThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRightThick: ImageVector? = null
