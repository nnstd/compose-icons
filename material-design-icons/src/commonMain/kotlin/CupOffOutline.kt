package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CupOffOutline: ImageVector
    get() {
        if (_CupOffOutline != null) {
            return _CupOffOutline!!
        }
        _CupOffOutline = ImageVector.Builder(
            name = "CupOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.83f, 2f)
                lineTo(5.83f, 4f)
                horizontalLineTo(18.78f)
                lineTo(17.5f, 15.66f)
                lineTo(19.3f, 17.5f)
                lineTo(21f, 2f)
                moveTo(2.27f, 3f)
                lineTo(1f, 4.27f)
                lineTo(3.53f, 6.8f)
                lineTo(5f, 20.23f)
                curveTo(5.13f, 21.23f, 5.97f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(17.47f, 22f, 17.91f, 21.82f, 18.26f, 21.54f)
                lineTo(19.73f, 23f)
                lineTo(21f, 21.73f)
                moveTo(5.78f, 9.06f)
                lineTo(16.73f, 20f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _CupOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CupOffOutline: ImageVector? = null
