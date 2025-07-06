package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StepBackward2: ImageVector
    get() {
        if (_StepBackward2 != null) {
            return _StepBackward2!!
        }
        _StepBackward2 = ImageVector.Builder(
            name = "StepBackward2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                moveTo(12f, 5f)
                lineTo(1f, 12f)
                lineTo(12f, 19f)
                verticalLineTo(5f)
                moveTo(22f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _StepBackward2!!
    }

@Suppress("ObjectPropertyName")
private var _StepBackward2: ImageVector? = null
