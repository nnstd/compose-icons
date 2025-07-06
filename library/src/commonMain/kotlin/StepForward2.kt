package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StepForward2: ImageVector
    get() {
        if (_StepForward2 != null) {
            return _StepForward2!!
        }
        _StepForward2 = ImageVector.Builder(
            name = "StepForward2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                moveTo(12f, 5f)
                lineTo(23f, 12f)
                lineTo(12f, 19f)
                verticalLineTo(5f)
                moveTo(2f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _StepForward2!!
    }

@Suppress("ObjectPropertyName")
private var _StepForward2: ImageVector? = null
