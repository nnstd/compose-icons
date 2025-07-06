package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalCellular2: ImageVector
    get() {
        if (_SignalCellular2 != null) {
            return _SignalCellular2!!
        }
        _SignalCellular2 = ImageVector.Builder(
            name = "SignalCellular2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(19.5f)
                moveTo(21f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                moveTo(14f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                moveTo(7f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _SignalCellular2!!
    }

@Suppress("ObjectPropertyName")
private var _SignalCellular2: ImageVector? = null
