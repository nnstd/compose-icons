package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExclamationThick: ImageVector
    get() {
        if (_ExclamationThick != null) {
            return _ExclamationThick!!
        }
        _ExclamationThick = ImageVector.Builder(
            name = "ExclamationThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                moveTo(10f, 21f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _ExclamationThick!!
    }

@Suppress("ObjectPropertyName")
private var _ExclamationThick: ImageVector? = null
