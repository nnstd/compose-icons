package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrangeBringForward: ImageVector
    get() {
        if (_ArrangeBringForward != null) {
            return _ArrangeBringForward!!
        }
        _ArrangeBringForward = ImageVector.Builder(
            name = "ArrangeBringForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(22f, 8f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ArrangeBringForward!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeBringForward: ImageVector? = null
