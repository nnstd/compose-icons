package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusThick: ImageVector
    get() {
        if (_PlusThick != null) {
            return _PlusThick!!
        }
        _PlusThick = ImageVector.Builder(
            name = "PlusThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _PlusThick!!
    }

@Suppress("ObjectPropertyName")
private var _PlusThick: ImageVector? = null
