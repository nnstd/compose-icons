package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DivingScubaFlag: ImageVector
    get() {
        if (_DivingScubaFlag != null) {
            return _DivingScubaFlag!!
        }
        _DivingScubaFlag = ImageVector.Builder(
            name = "DivingScubaFlag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                lineTo(19f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                moveTo(5f, 4f)
                lineTo(22f, 18f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _DivingScubaFlag!!
    }

@Suppress("ObjectPropertyName")
private var _DivingScubaFlag: ImageVector? = null
