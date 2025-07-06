package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BorderAllVariant: ImageVector
    get() {
        if (_BorderAllVariant != null) {
            return _BorderAllVariant!!
        }
        _BorderAllVariant = ImageVector.Builder(
            name = "BorderAllVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _BorderAllVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BorderAllVariant: ImageVector? = null
