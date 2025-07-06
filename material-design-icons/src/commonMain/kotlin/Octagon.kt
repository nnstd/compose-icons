package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Octagon: ImageVector
    get() {
        if (_Octagon != null) {
            return _Octagon!!
        }
        _Octagon = ImageVector.Builder(
            name = "Octagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.73f, 3f)
                horizontalLineTo(8.27f)
                lineTo(3f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(8.27f, 21f)
                horizontalLineTo(15.73f)
                lineTo(21f, 15.73f)
                verticalLineTo(8.27f)
            }
        }.build()

        return _Octagon!!
    }

@Suppress("ObjectPropertyName")
private var _Octagon: ImageVector? = null
