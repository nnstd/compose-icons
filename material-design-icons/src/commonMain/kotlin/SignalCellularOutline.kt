package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalCellularOutline: ImageVector
    get() {
        if (_SignalCellularOutline != null) {
            return _SignalCellularOutline!!
        }
        _SignalCellularOutline = ImageVector.Builder(
            name = "SignalCellularOutline",
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
                moveTo(12.5f, 10.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(12.5f)
                moveTo(5.5f, 15.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(5.5f)
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

        return _SignalCellularOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SignalCellularOutline: ImageVector? = null
