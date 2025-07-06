package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StepForward: ImageVector
    get() {
        if (_StepForward != null) {
            return _StepForward!!
        }
        _StepForward = ImageVector.Builder(
            name = "StepForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                moveTo(10f, 5f)
                verticalLineTo(19f)
                lineTo(21f, 12f)
            }
        }.build()

        return _StepForward!!
    }

@Suppress("ObjectPropertyName")
private var _StepForward: ImageVector? = null
