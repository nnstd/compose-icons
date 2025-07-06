package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpDownBoldOutline: ImageVector
    get() {
        if (_ArrowUpDownBoldOutline != null) {
            return _ArrowUpDownBoldOutline!!
        }
        _ArrowUpDownBoldOutline = ImageVector.Builder(
            name = "ArrowUpDownBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10f)
                horizontalLineTo(22f)
                lineTo(12f, 0f)
                lineTo(2f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                lineTo(12f, 24f)
                lineTo(22f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                moveTo(14f, 16f)
                horizontalLineTo(17f)
                lineTo(12f, 21f)
                lineTo(7f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                lineTo(12f, 3f)
                lineTo(17f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ArrowUpDownBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpDownBoldOutline: ImageVector? = null
