package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxBlankOff: ImageVector
    get() {
        if (_CheckboxBlankOff != null) {
            return _CheckboxBlankOff!!
        }
        _CheckboxBlankOff = ImageVector.Builder(
            name = "CheckboxBlankOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(19.1f, 21f)
                curveTo(19.06f, 21f, 19.03f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.97f, 3f, 4.94f, 3f, 4.9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(21f, 5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(6.2f)
                lineTo(21f, 17.8f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _CheckboxBlankOff!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxBlankOff: ImageVector? = null
