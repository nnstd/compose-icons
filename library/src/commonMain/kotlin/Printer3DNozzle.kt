package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Printer3DNozzle: ImageVector
    get() {
        if (_Printer3DNozzle != null) {
            return _Printer3DNozzle!!
        }
        _Printer3DNozzle = ImageVector.Builder(
            name = "Printer3DNozzle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                lineTo(13f, 17f)
                horizontalLineTo(11f)
                lineTo(7.5f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                moveTo(10f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 22f)
                close()
            }
        }.build()

        return _Printer3DNozzle!!
    }

@Suppress("ObjectPropertyName")
private var _Printer3DNozzle: ImageVector? = null
