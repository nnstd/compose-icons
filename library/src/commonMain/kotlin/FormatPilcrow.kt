package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatPilcrow: ImageVector
    get() {
        if (_FormatPilcrow != null) {
            return _FormatPilcrow!!
        }
        _FormatPilcrow = ImageVector.Builder(
            name = "FormatPilcrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _FormatPilcrow!!
    }

@Suppress("ObjectPropertyName")
private var _FormatPilcrow: ImageVector? = null
