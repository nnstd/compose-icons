package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Equal: ImageVector
    get() {
        if (_Equal != null) {
            return _Equal!!
        }
        _Equal = ImageVector.Builder(
            name = "Equal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                moveTo(19f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _Equal!!
    }

@Suppress("ObjectPropertyName")
private var _Equal: ImageVector? = null
