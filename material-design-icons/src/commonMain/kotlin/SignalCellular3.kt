package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalCellular3: ImageVector
    get() {
        if (_SignalCellular3 != null) {
            return _SignalCellular3!!
        }
        _SignalCellular3 = ImageVector.Builder(
            name = "SignalCellular3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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

        return _SignalCellular3!!
    }

@Suppress("ObjectPropertyName")
private var _SignalCellular3: ImageVector? = null
