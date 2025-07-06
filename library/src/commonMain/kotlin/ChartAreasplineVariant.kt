package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartAreasplineVariant: ImageVector
    get() {
        if (_ChartAreasplineVariant != null) {
            return _ChartAreasplineVariant!!
        }
        _ChartAreasplineVariant = ImageVector.Builder(
            name = "ChartAreasplineVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(15.54f)
                lineTo(9.5f, 6f)
                lineTo(16f, 9.78f)
                lineTo(20.24f, 2.45f)
                lineTo(21.97f, 3.45f)
                lineTo(22f, 21f)
                close()
            }
        }.build()

        return _ChartAreasplineVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ChartAreasplineVariant: ImageVector? = null
