package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownThick: ImageVector
    get() {
        if (_ArrowDownThick != null) {
            return _ArrowDownThick!!
        }
        _ArrowDownThick = ImageVector.Builder(
            name = "ArrowDownThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                lineTo(17.5f, 9.5f)
                lineTo(19.92f, 11.92f)
                lineTo(12f, 19.84f)
                lineTo(4.08f, 11.92f)
                lineTo(6.5f, 9.5f)
                lineTo(10f, 13f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ArrowDownThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownThick: ImageVector? = null
