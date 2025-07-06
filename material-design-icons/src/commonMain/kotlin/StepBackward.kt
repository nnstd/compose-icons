package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StepBackward: ImageVector
    get() {
        if (_StepBackward != null) {
            return _StepBackward!!
        }
        _StepBackward = ImageVector.Builder(
            name = "StepBackward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                moveTo(14f, 5f)
                verticalLineTo(19f)
                lineTo(3f, 12f)
            }
        }.build()

        return _StepBackward!!
    }

@Suppress("ObjectPropertyName")
private var _StepBackward: ImageVector? = null
