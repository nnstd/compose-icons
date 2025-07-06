package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightThick: ImageVector
    get() {
        if (_ArrowRightThick != null) {
            return _ArrowRightThick!!
        }
        _ArrowRightThick = ImageVector.Builder(
            name = "ArrowRightThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                lineTo(9.5f, 17.5f)
                lineTo(11.92f, 19.92f)
                lineTo(19.84f, 12f)
                lineTo(11.92f, 4.08f)
                lineTo(9.5f, 6.5f)
                lineTo(13f, 10f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _ArrowRightThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightThick: ImageVector? = null
